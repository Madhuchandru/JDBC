package com.xworkz.bag.repo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.constants.BagConstant;

public class BagRepoImpl implements BagRepoo {

	@Override
	public boolean save(BagDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(BagConstant.URL.getValues(),
					BagConstant.USERNAME.getValues(), BagConstant.PASSWORD.getValues());
			String query = "insert into bagdetails values(?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			prepareStatement.setInt(1, dto.getId());
			prepareStatement.setString(2, dto.getName());
			prepareStatement.setString(3, dto.getColor());
			prepareStatement.setInt(5, dto.getCapacity());
			prepareStatement.setDouble(4, dto.getPrice());
			 prepareStatement.executeUpdate();
			prepareStatement.close();
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BagDto findByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(BagConstant.URL.getValues(),
					BagConstant.USERNAME.getValues(), BagConstant.PASSWORD.getValues());

			String query = "SELECT * FROM bag WHERE name=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);

			ResultSet execute = statement.executeQuery();

			while (execute.next()) {
				int id = execute.getInt("id");
				String brand = execute.getString("name");
				String color = execute.getString("color");
				double price = execute.getDouble("price");
				int capacity = execute.getInt("capacity");

				BagDto dto = new BagDto(id, brand, color, price, capacity);
				System.out.println(dto);
			}
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
		
		
		
	}

	@Override
	public BagDto findByNameAndId(String name, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(BagConstant.URL.getValues(),
					BagConstant.USERNAME.getValues(), BagConstant.PASSWORD.getValues());

			String query = "SELECT * FROM bag WHERE name=? AND id=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, id);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				System.out.println("entered");
				int id1 = set.getInt("id");
				String name1 = set.getString("name");
				String color1 = set.getString("color");
				double price1 = set.getDouble("price");
				int capacity1 = set.getInt("capacity");

				BagDto dto = new BagDto(id1, name1, color1, price1, capacity1);
				System.out.println(dto);

			}
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
