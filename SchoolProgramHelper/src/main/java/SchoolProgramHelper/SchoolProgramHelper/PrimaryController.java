package SchoolProgramHelper.SchoolProgramHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
    	test();
        App.setRoot("secondary");
    }
    
    public void test()
    {
    	String dbURL = "jdbc:sqlite:../test";
		try (Connection conn = DriverManager.getConnection(dbURL);
			)
		{	
			//query to be run, check to see if the person_Id is found in the db
			String query = "Select name from sqlite_schema where type = 'table'";
			
			//create the prepared statement
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			//inject the id entered by the user into the query
			//preparedStatement.setString(1, "Table");
			
			//run the query
			ResultSet rset = preparedStatement.executeQuery();
			
			//if a result is fount then open the voters page if not inform the user
			
				while(rset.next())
				{
					System.out.println(rset.getString("name"));
				}
				
				//App.setRoot("voterMenu", voterIdTextField.getText());
			
			
		} catch (SQLException e) {
			System.err.println(e);
		}
    }
}
