/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cart;
import model.Payment;
import model.Remove;
import model.delete;
import model.login;
import model.product;
import model.signup;
/**
 *
 * @author peter
 */
public class ConnectionDao{

    private static Connection connect() throws SQLException, ClassNotFoundException{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    String url="jdbc:derby://localhost:1527/ShopOnline;create=true;user=Saranyadevi;password=12345";
    Connection con=DriverManager.getConnection(url);
    return con;
}
public static int signup(signup su , String sql) throws SQLException, ClassNotFoundException {
	int i=0;
	Connection con = connect();
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, su.getSignuser());
		ps.setString(2, su.getSignemail());
		ps.setString(3, su.getSignpass1());
		ps.setString(4, su.getSignpass2());
		
		i = ps.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return i;
}
public static ResultSet userlogin(login l,String sql) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ResultSet rs= null;
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, l.getSignuser());
			ps.setString(2, l.getSignpass1());
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");
		return rs;
	}
public static int cart(Cart c,String sql) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int i=0;
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			i=ps.executeUpdate();
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return i;
	}
public static int remove(Remove r, String sql) throws SQLException, ClassNotFoundException{
    int i=0;
    Connection con=connect();
    try{
        PreparedStatement ps = con.prepareStatement(sql);
			i=ps.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");
		return i;
    }
public static int payment(Payment p, String sql) throws SQLException, ClassNotFoundException{
    int i=0;
    Connection con=connect();
    try{
        PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getSignuser());
			i=ps.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
    }
    
System.out.println("success");
	return i;
}
public static int product(product pdt , String sql) throws SQLException, ClassNotFoundException {
	int i=0;
	Connection con = connect();
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pdt.getPid());
		ps.setString(2, pdt.getProductname());
		ps.setInt(3, pdt.getQuantity());
		ps.setInt(4, pdt.getMrp());
		
		i = ps.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return i;
}
public static int delete(delete d, String sql) throws SQLException, ClassNotFoundException{
    int i=0;
    Connection con=connect();
    try{
        PreparedStatement ps = con.prepareStatement(sql);
			i=ps.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");
		return i;
    }
}



