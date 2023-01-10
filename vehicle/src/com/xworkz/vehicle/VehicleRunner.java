package com.xworkz.vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VehicleRunner {

	public static void main(String[] args) {

		String username = "root";
		String password = "Madhu@862000";
		String host = "jdbc:mysql://localhost:3306/xworkz_1";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(host, username, password);

			String query = "insert into madhu values(?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			prepareStatement.setInt(1, 5);
			prepareStatement.setString(2, "madhu");
			prepareStatement.setString(3, "balakrishn");
			prepareStatement.setInt(4, 20000);

			prepareStatement.setInt(1, 6);
			prepareStatement.setString(2, "malatesh");
			prepareStatement.setString(3, "noolvi");
			prepareStatement.setInt(4, 30000);

			prepareStatement.setInt(1, 7);
			prepareStatement.setString(2, "manoj");
			prepareStatement.setString(3, "HJ");
			prepareStatement.setInt(4, 40000);

			prepareStatement.setInt(1, 1);
			prepareStatement.setString(2, "kiran");
			prepareStatement.setString(3, "kj");
			prepareStatement.setInt(4, 50000);

			prepareStatement.setInt(1, 2);
			prepareStatement.setString(2, "vinayaka");
			prepareStatement.setString(3, "gb");
			prepareStatement.setInt(4, 25000);

			prepareStatement.setInt(1, 3);
			prepareStatement.setString(2, "yugesh");
			prepareStatement.setString(3, "bm");
			prepareStatement.setInt(4, 45000);

			prepareStatement.setInt(1, 4);
			prepareStatement.setString(2, "mohan");
			prepareStatement.setString(3, "kumar");
			prepareStatement.setInt(4, 60000);

		//	int executeUpdate = prepareStatement.executeUpdate();
		//	System.out.println(executeUpdate);
		//	prepareStatement.executeUpdate();

			String query1 = "select * from madhu where name='malatesh'";
			PreparedStatement prepareStatement2 = connection.prepareStatement(query1);

			ResultSet rs = prepareStatement2.executeQuery(query1);
			while (rs.next()) {

				System.out.println(rs.getInt("id") + " " + rs.getString("name")+" "+rs.getString("lastName")+" "+rs.getInt("salary"));

			}

			prepareStatement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
