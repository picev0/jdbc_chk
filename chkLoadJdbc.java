import java.sql.Connection;
import java.sql.*;

public class chkLoadJdbc {
	public static void main(String[] args)throws Exception{

		String sid = "orcl";

		String msg = "";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection 
		("jdbc:oracle:thin:@" + "127.0.0.1" + ":1521:" + sid,"SYS as sysdba","xxxxxx");
			msg = "ドライバのロードに成功しました。";

		}catch(ClassNotFoundException e){
			msg = "ドライバのロードに失敗しました。";

		}
		System.out.println(msg);
	}
}