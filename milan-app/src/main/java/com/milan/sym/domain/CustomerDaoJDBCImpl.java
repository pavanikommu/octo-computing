package com.milan.sym.domain;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.List;

import com.milan.sym.domain.util.MilanSqlUtil;
import com.milan.sym.util.MilanDataBaseException;

public class CustomerDaoJDBCImpl implements CustomerDAO 
{
	private Connection conncetion;
	private Statement statement;
	private PreparedStatement psStatement;
	private CallableStatement csStatement;

	private ResultSet resultSet;

	public CustomerDaoJDBCImpl(String driverName, String dbName,
			String userName, String password) throws ClassNotFoundException,
			SQLException 
	{
		Class.forName(driverName);
		this.conncetion = DriverManager.getConnection(dbName, userName,
				userName);

	}

	public Customer createCustomer(Customer customer)
			throws MilanDataBaseException 
	{
		
		try 
		{
			//
			customer.setCustomerId(readNextCustomerIdSeqValue());
			
			
			psStatement = this.conncetion.prepareStatement(MilanSqlUtil.CUSTOMER_INSERT);
			psStatement.setLong(1, customer.getCustomerId());
			psStatement.setString(2, customer.getFirstName());
			psStatement.setString(3, customer.getLastName());
			psStatement.setString(4, customer.getIsAMember());
			psStatement.setString(5, customer.getMemberType());
			
			
			psStatement.execute();
			
		
		} catch (SQLException e) 
		{
			//We might consider changing this one later point --log4j
			System.err.println("exception"+e.getMessage());
			e.printStackTrace();
			
			throw new MilanDataBaseException(e.getMessage());
		} 
		
		
		return customer;
	}

	private Long readNextCustomerIdSeqValue() throws SQLException 
	{
		Long customerId = 0l;
		statement = this.conncetion.createStatement();
		resultSet = statement.executeQuery(MilanSqlUtil.CUSTOMER_INSERT_SEQ);
		resultSet.next();
		
		customerId = resultSet.getLong(1);
		
		return customerId;
	}

	public void updateCustomer(Customer customer) 
	{
		

	}

	public void findCustimerById(long id) 
	{
		

	}

	public void findCustomerByName(String name) 
	{

		

	}

	public void deleteCustomer(Customer customer) {

	}

	public List<Customer> findAllCustomers() 
	{


		return null;
	}

}
