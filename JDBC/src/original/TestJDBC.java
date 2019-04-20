package original;

import java.sql.*;

/**
 * Title: TestJDBC类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String user = "root";
        String pwd = "111";
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mianshi";
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        Class.forName(driver);
        connection = DriverManager.getConnection(url,user,pwd);
        connection.setAutoCommit(false);
        //事务
        connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);//TRANSACTION_SERIALIZABLE是事务的最高级别
        System.out.println(connection.getTransactionIsolation());//8
        statement = connection.createStatement();

        statement.execute("insert into employee(name,age) values('caotao','22')");
        statement.execute("insert into employee(name,age) values('李UI下那个样','1')");
        statement.execute("insert into employee(name,age) values('liuxiangyang','24')");
//        int i = 1/0;
        resultSet = statement.executeQuery("select * from employee");

        PreparedStatement preparedStatement = connection.prepareStatement("select * from employee where id = ?");
        preparedStatement.setInt(1,35);
        ResultSet resultSet1 = preparedStatement.executeQuery();

        while (resultSet.next())
            System.out.println(resultSet.getInt(1) + "" + resultSet.getString(2) + "" + resultSet.getInt(3));

        while (resultSet1.next())
            System.out.println(resultSet1.getInt(1) + "" + resultSet1.getString(2) + "" + resultSet1.getInt(3));

        connection.commit();

        resultSet1.close();
        resultSet.close();
        statement.close();
        connection.close();


    }
}
