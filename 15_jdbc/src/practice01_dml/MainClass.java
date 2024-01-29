package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MainClass {

  /*
   * TALK_T 테이블에 1행씩 삽입하시오
   * TALK_T 구조
   *    TALK_NO      NUMBER (PK)
   *    TALK_CONTENT VARCHAR2(1000 BYTE)
   *    TALK_USER  VARCHAR2(1000 BYTE)
   *    WRITEN_AT    TIMESTAMP ( * 현재 날짜/시간 : CURRENT_TIMESTAMP)
   * TALK_SEQ 시퀀스 존재함
   * DB 서버 환경
   *   192.168.0.214
   *   GD/1111
   */
  
  public static void main(String[] args) {

    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = "jdbc:oracle:thin:@192.168.0.214:1521:xe";
      String user = "GD";
      String password = "1111";
      // -Djdbc.url=jdbc:oracle:thin:@192.168.0.214:1521:xe
      // -Djdbc.user=GD
      // -Djdbc.password=1111
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "INSERT INTO TALK_T(TALK_NO, TALK_CONTENT, TALK_USER, WRITEN_AT) VALUES(TALK_SEQ.NEXTVAL, ?,?, CURRENT_TIMESTAMP)";
      
      ps = con.prepareStatement(sql);
      
      Scanner sc = new Scanner(System.in);
      System.out.println("내용 입력 >>>");
      String talkcon = sc.next();
      System.out.println("편집자 입력 >>>");
      String talkedi = sc.next();
      sc.close();
      
      ps.setString(1, talkcon);
      ps.setString(2, talkedi);
      
      int result = ps.executeUpdate();
      System.out.println(result + " 행 이(가) 삽입되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
    
  }

}
