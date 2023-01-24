package com.xworkz.pencil.configaration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.xworkz.pencil.dto.PencileDto;

public class PencilConfig {
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {

		Configuration configuration = new Configuration();

		Properties properties = new Properties();
		if (sessionfactory == null) {
			properties.put(Environment.USER, "root");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/xworkz_1");
			properties.put(Environment.PASS, "Madhu@862000");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.HBM2DDL_AUTO, "create-drop");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			properties.put(Environment.SHOW_SQL, true);

			configuration.setProperties(properties);
			configuration.addAnnotatedClass(PencileDto.class);

			StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			sessionfactory = configuration.buildSessionFactory(standardServiceRegistry);

			return sessionfactory;

		}
		return null;

	}
}
