import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class learn {
    public static void main(String[] args) {
        try {


            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "123456789");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(" select * from students");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
