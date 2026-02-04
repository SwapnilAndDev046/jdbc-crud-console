import java.sql.*;
import java.util.Scanner;

public class SignUpForm {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/signupform";
        String user = "root";
        String password = "your_password";
        try (
                Scanner in = new Scanner(System.in);
                Connection con = DriverManager.getConnection(url, user, password)
        ) {
            int Choice;
            do {
                System.out.print("1.Insert\n2.Delete\n3.Update\n4.Read\nMake Your Choice:");
                Choice = in.nextInt();
                in.nextLine();
                switch (Choice) {
                    case 1:
                        Insert(con, in);
                        break;
                    case 2:
                        Delete(con, in);
                        break;
                    case 3:
                        Update(con, in);
                        break;
                    case 4:
                        Read(con);
                        break;
                    default:
                        System.out.println("-----------------------BYE--------------------");
                }

            } while (Choice < 5);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void Insert(Connection con, Scanner in) throws SQLException {
        System.out.println("\n-------Start inserting-------");

        System.out.print("Enter your First Name:");
        String FirstName = in.nextLine();
        System.out.print("Enter your Last Name:");
        String LastName = in.nextLine();
        System.out.print("Enter your Email:");
        String email = in.nextLine();
        System.out.print("Enter Your Phone Number:");
        String phone = in.nextLine();
        System.out.print("Gender(M,F,B):");
        String gender = in.nextLine();
        System.out.print("Password:");
        String pass = in.nextLine();

        try (
                PreparedStatement ps = con.prepareStatement
                        ("INSERT INTO signup(Name,email,phoneNumber,Gender,password) VALUES (?,?,?,?,?)")
        ) {
            String name = FirstName + " " + LastName;
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, gender);
            ps.setString(5, pass);

            ps.executeUpdate();
        }
        System.out.println("--------------Success----------------");
    }


    static void Delete(Connection con, Scanner in) throws SQLException {
        try (
                PreparedStatement ps = con.prepareStatement("DELETE FROM signup WHERE id = ?")
        ) {
            System.out.print("What is the ID number present there: ");
            int id = in.nextInt();

            ps.setInt(1, id);

            ps.executeUpdate();
        }
        System.out.println("--------------Success----------------");
    }

    static void Update(Connection con, Scanner in) throws SQLException {
        System.out.println("""
                What do you want to update?
                1. Name
                2. Email
                3. Phone Number
                4. Gender
                5. Password
                """);

        System.out.print("Enter choice: ");
        int opt = in.nextInt();
        in.nextLine();

        String column;

        switch (opt) {
            case 1 -> column = "Name";
            case 2 -> column = "email";
            case 3 -> column = "phoneNumber";
            case 4 -> column = "Gender";
            case 5 -> column = "password";
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }

        try (
                PreparedStatement ps = con.prepareStatement("UPDATE signup SET " + column + " = ? WHERE Id = ?")
        ) {
            System.out.print("Enter the new Value: ");
            String newVal = in.nextLine();
            System.out.print("What is the ID number present there: ");
            int id = in.nextInt();

            ps.setString(1, newVal);
            ps.setInt(2, id);

            ps.executeUpdate();
        }
        System.out.println("--------------Success----------------");
    }

    static void Read(Connection con) throws SQLException {
        try (
                PreparedStatement ps = con.prepareStatement("SELECT * FROM signup")
                ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                System.out.println("\nName: " + rs.getString("Name"));
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("email: " + rs.getString("email"));
                System.out.println("phone Number: " + rs.getString("phoneNumber"));
                System.out.println("Gender: " + rs.getString("Gender"));
                System.out.println("password: ************");
                System.out.println("-----------------------------------");
            }
        }
        System.out.println("--------------Success----------------");
    }
}
