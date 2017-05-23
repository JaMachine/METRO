package Metro;

import java.sql.*;

public class MySQL {

	private static String url = "jdbc:mysql://localhost:3306/metro_db";
	private static String passNlog = "root";

	public static void getFrom(String q) {
		try {
			Connection con = DriverManager.getConnection(url, passNlog, passNlog);

			Statement stm = con.createStatement();

			ResultSet res = stm.executeQuery(q);

			while (res.next())
				System.out.println("id = " + res.getInt("id") + "\n" + "name = " + res.getString("name") + "\n"
						+ "cash = " + res.getInt("cash") + "\n");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void insertInto(String q) {

		try {
			Connection con = DriverManager.getConnection(url, passNlog, passNlog);

			Statement stm = con.createStatement();

			stm.executeUpdate(q);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void addCash(int cash, int id) {
		
		try {
		
			int g = cash;
			
			Connection con = DriverManager.getConnection(url, passNlog, passNlog);

			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery("select cash from stations where id =" + id);

			// g = res.getInt(id);

			stm.executeUpdate("update stations set cash = " + g + " where id = " + id+";");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
