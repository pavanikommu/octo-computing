/**
 * 
 */
package com.isko.app.domain.dao;

import java.sql.SQLException;

import com.isko.app.domain.Student;

/**
 * @author srinivas_kommu
 *
 */
public interface StudentDAO 
{
	void insertStudent(Student student) throws ClassNotFoundException, SQLException;
	
	
}
