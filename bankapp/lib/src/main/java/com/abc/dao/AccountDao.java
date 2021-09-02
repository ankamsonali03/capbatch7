package com.abc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.abc.dto.Account;
import com.abc.util.DBUtil;

public class AccountDao {
	
	public void saveAccount(Account account) {		
		String sql = "insert into account_tbl values(?,?,?,?)";		
		try(Connection con = DBUtil.getDBConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, account.getAccno());
			ps.setString(2, account.getName());
			ps.setDouble(3, account.getBalance());
			ps.setDate(4, Date.valueOf(account.getOpeningDate()));			
			ps.executeUpdate();			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public Account fetchAccountById(int accno) {
		Account account = null;
		String sql = "select * from account_tbl where accno = ?";
		try(Connection con = DBUtil.getDBConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, accno);			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				account = new Account();
				account.setAccno(rs.getInt(1));
				account.setName(rs.getString(2));
				account.setBalance(rs.getDouble(3));
				account.setOpeningDate(rs.getDate(4).toLocalDate());
			}			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		return account;
	}
}
