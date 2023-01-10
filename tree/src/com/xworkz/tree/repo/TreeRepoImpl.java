package com.xworkz.tree.repo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.tree.dto.TreeDto;

public class TreeRepoImpl implements TreeRepo{

	String username = "root";
	String password = "Madhu@862000";
	String host = "jdbc:mysql://localhost:3306/xworkz_1";
	
	@Override
	public boolean save(TreeDto dto) {
		

	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(host, username, password);
			String query = "insert into tree_details values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			
			
			statement.setString(1,dto.getName());
			statement.setString(2,dto.getType());
			statement.setInt(3,dto.getHight());
			statement.setString(4,dto.getLocation());
			statement.setBoolean(5,dto.isFlower());
			statement.setBoolean(6,dto.isFruit());
			statement.setInt(7,dto.getLifeSpan());
			statement.setInt(8,dto.getCostOfTree());
			statement.setInt(9,dto.getNoOfbranch());
			statement.setString(10,dto.getColorOfstem());
			
			
			statement.executeUpdate();
			
			statement.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return true;
	}

	@Override
	public TreeDto read() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host, username, password);
			
			String query1="select * from tree_details WHERE name=? ";
			
			  PreparedStatement statement = connection.prepareStatement(query1);
			
			statement.setString(1, "mango");
			
			ResultSet set = statement.executeQuery();
			
			set.next();
			System.out.println(set.getString("name"));
			System.out.println(set.getString("type"));
			System.out.println(set.getString("hight"));
			System.out.println(set.getString("location"));
			System.out.println(set.getString("flower"));
			System.out.println(set.getString("fruit"));
			System.out.println(set.getString("lifeSpan"));
			System.out.println(set.getString("CostOfTree"));
			System.out.println(set.getString("NoOfbranch"));
			System.out.println(set.getString("ColorOfstem"));
			
			
			statement.executeQuery();
			statement.close();
			connection.close();
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
