package com.abc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.bean.Account;

@Repository
public class AccountDao {
	
	@Autowired
	private DataSource dataSource;
	
	public void save(Account account) {
		
		String sql="insert into account_tbl values(?,?,?,?)";
		
		try(Connection con = dataSource.getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, account.getAccno());
			ps.setDouble(2, account.getBalance());
			ps.setString(3, account.getName());
			ps.setDate(4,Date.valueOf(account.getOpeningDate()));
			
			ps.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
