package stepdefinitions.ui;


import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.JdbcUtils;
import java.sql.SQLException;
import java.util.List;


public class US_06_DB {



    //test for database
    @Given("user connects to the database")
    public void user_connects_to_the_database() throws SQLException, ClassNotFoundException {
        JdbcUtils.connectToDatabase("managementonschools.com", "school_management", "select_user", "43w5ijfso");
        JdbcUtils.createStatement();

    }
    @Given("user gets the column {string} from table {string}" )
    public void user_gets_the_column_from_table(String column, String table) {
        String query = "SELECT "+column+" FROM "+table;
        JdbcUtils.executeQuery(query);
    }

    @Then("verify table {string} and column {string} contains data {string}")
    public void verify_table_and_column_contains_data(String table, String column, String username) {
        String query ="SELECT "+column+" FROM "+table;
        List<Object> columnData = JdbcUtils.getColumnData(query,column);
        System.out.println(columnData);
        Assert.assertTrue(columnData.contains(username));
    }
    @Then("close the connection")
    public void close_the_connection() {
        JdbcUtils.closeConnectionAndStatement();
    }






}


