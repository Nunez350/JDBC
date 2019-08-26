package examples.pubhub.dao;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import examples.pubhub.model.*;



public class TestConnection {

	public static void main(String[] args) {
		System.out.print("\"Hello3\"");
		try {
			Class.forName("org.postgresql.Driver");	
			
			String url = "jdbc:postgresql://localhost:5432/PubHub";
			String user ="roynunez";
			String pass = "postgres";
		
			Connection conn = DriverManager.getConnection(url,user,pass);
			
			DatabaseMetaData meta =conn.getMetaData();
			System.out.println(meta.getDatabaseProductVersion());
			String newLine = System.getProperty("line.separator");
			System.out.print("Hello!" + newLine);
			
	
			
			
			BookTagDAOImpl daoObj = new BookTagDAOImpl();
			daoObj.getAllBooks();
		
			List<BookTag> list = daoObj.getAllBooks();
			 for (int i = 0; i < list.size(); i++){
				    BookTag t = list.get(i);
				    System.out.println(t);
				  }
			 
		//	System.out.println("The result is " + fine);
			conn.close();
			
			
			
			
			} catch (Exception e){
				e.printStackTrace();
				}
		
			}

	
	
	
}
	
	
	
	

