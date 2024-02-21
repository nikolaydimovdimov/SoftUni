import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username - default (root):");
        String userName = scanner.nextLine();
        userName = userName.isEmpty() ? "root" : userName;
        System.out.print("Enter password - default empty:");
        String password=scanner.nextLine().trim();

//Connect DB
        Properties properties=new Properties();
        properties.setProperty("user",userName);
        properties.setProperty("password",password);

        Connection connection= DriverManager
                .getConnection("jdbc:mysql://localhost:3306/diablo",properties);

// Execute Query
        PreparedStatement statement= connection
                .prepareStatement("SELECT u.id, u.first_name, u.last_name,COUNT(ug.game_id) AS cnt\n" +
                                        "FROM users AS u\n" +
                                        "JOIN users_games AS ug ON u.id=ug.user_id\n" +
                                        "WHERE u.user_name= ? \n" +
                                        "GROUP BY u.id");

        System.out.print("Enter username of the player:");
        String playerUsername=scanner.nextLine();

        statement.setString(1,playerUsername);

        ResultSet result= statement.executeQuery();

//Get and print results
        if(result.next()){
            System.out.printf("User: %s%n%s %s has played %d games",
                    playerUsername,
                    result.getString("first_name"),
                    result.getString("last_name"),
                    result.getInt("cnt"));
        }else {
            System.out.println("No such user exists");
        }
        connection.close();
    }
}
