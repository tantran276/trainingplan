package vn.com.tma.trainingplan.designpattern;

import java.sql.SQLException;

public class JDBCSingletonDemo {
	public static void main(String[] args){
		 JDBCSingleton jdbc= JDBCSingleton.getInstance(); 
		 try {
			int i = jdbc.insert("ABCD", "9070");
			System.out.println("Insert success at " + i);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
