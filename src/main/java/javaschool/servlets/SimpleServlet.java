package javaschool.servlets;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet{


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");

        PrintWriter pw = resp.getWriter();
        pw.println("<H1>SELECT * FROM clients 3</H1>");
        String query= "SELECT * FROM clients";

        try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/client?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "admin");
                if(!connection.isClosed()) {
                    pw.println("Connected");
                    }
            //PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = connection.prepareStatement(query).executeQuery();
            while (resultSet.next()){
                pw.print("<p>id client = " + resultSet.getInt(1) + " , ");
                pw.print("Client name = " + resultSet.getString("client_name") + " , ");
                pw.println("Client surname= " + resultSet.getString("client_surname")+ "</p>");
            }
                //resultSet.close();
                //preparedStatement.close();
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            pw.println(e);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

