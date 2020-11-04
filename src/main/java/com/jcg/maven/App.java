package com.jcg.maven;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		try {

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.87.122.65:1526:imssit", "ops$bom",
					"bom");

			if (con != null) {
				System.out.println("Test connection successfully!");
			}

			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
