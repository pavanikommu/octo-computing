package com.milan.sym.util;

import java.sql.SQLException;

public class MilanDataBaseException extends SQLException 
{
	public MilanDataBaseException(){
		
	}
	
	public MilanDataBaseException(String message)
	{
	super(message);	
	}

}
