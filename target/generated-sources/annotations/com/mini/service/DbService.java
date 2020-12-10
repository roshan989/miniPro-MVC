package com.mini.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import com.rk.model.DbModel;
@Service
public class DbService {
		DbModel n=new DbModel();
		
	    public DbModel getparam(int id/*,String nm,String book,String date,String bnm*/) {
		
		 try {
		     Class.forName("com.mysql.jdbc.Driver");
		     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minipro","roshan","1234");
		     Statement st=con.createStatement();
		     ResultSet rs= st.executeQuery("select *from dbmini where id="+id);  
		      if(rs.next()) {
		       n.setId(rs.getInt("id"));
		       n.setNm(rs.getString("nm"));
		       n.setBook(rs.getString("book"));
		       n.setDate(rs.getString("date"));
		       n.setBorrowN(rs.getString("borrowN"));}
		 
		   }
		     catch(Exception e){
		     e.printStackTrace();
		     
		   }
		
		return n;
		
	}
	
	
	
}
