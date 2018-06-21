package com.bridgelabz.jdbcpgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author bridgelabz
 *
 */
public class LogInValidation {
	public static void main(String[] args) {
		Utility u = new Utility();
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rs = null;
		String qry = "select * from gmailAccount.accholder where uname=? and password=?";
		System.out.println("enter username");
		String uname = u.inputString();
		System.out.println("enter password");
		String pwd = u.inputString();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, uname);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String name = rs.getString(1);
				System.out.println("successfully login to gmail");
			} else
				System.err.println("invalid username or password");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}