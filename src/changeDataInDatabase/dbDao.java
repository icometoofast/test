package changeDataInDatabase;


import java.math.BigInteger;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/*public class dbDao {
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://161.117.163.9:3306/BeService";


    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "dbopr";
    static final String PASS = "2WXGOH3pU1h8";

    public static void main(String[] args)  {
        Connection conn = null;
        Statement stmt = null;
        try {

            Class.forName(JDBC_DRIVER);                               // 注册 JDBC 驱动


            System.out.println("连接数据库...");                       // 打开链接
            conn = DriverManager.getConnection(DB_URL, USER, PASS);


            System.out.println(" 实例化Statement对象...");       // 执行查询
            stmt = conn.createStatement();


            String sql1,sql2;
            long kycId = 517287628639305622l;
            int userId = 49142358;
            userId = userId +1;
            kycId = kycId + 1;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime();

            Random r = new Random(1000);

            for(int i=0;i<4000;i++) {

                calendar.add(Calendar.SECOND, r.nextInt());

            sql1 = "insert  into BeService.Be_Task_Kycs(secondaryScenarioCode,kycId,userId,processStatus,kycType,scenarioCode) values(70,'"+kycId+"','"+userId+"','Processed','application',70);";
            sql2 = "insert into BeService.Be_Task_Kycs_DialItem(status,createdAt,dialType,kycId,latestCalledAt,processedAt) values('Processed','2020-09-28 06:30:21','auto','"+kycId+"','2020-09-28 06:50:21','2020-09-28 06:55:21');";
            stmt.execute(sql1);
            stmt.execute(sql2);
            }

        } catch (ParseException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}*/