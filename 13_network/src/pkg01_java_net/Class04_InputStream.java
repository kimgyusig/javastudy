package pkg01_java_net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Class04_InputStream {

  public static void method1() {

    String spec = "https://www.google.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader in = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) { 
        throw new RuntimeException(spec + "접속 불가");
      }
      
      in= new BufferedReader( new InputStreamReader(con.getInputStream()));
      
      String line = null;
      StringBuilder builder = new StringBuilder();
      while((line = in.readLine()) != null) {
        builder.append(line).append("\n");
      }
      
      System.out.println(builder.toString());
      
      in.close();
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null)
        con.disconnect();
    }
    
  }

  public static void method2() {
    
    String spec ="https://ssl.pstatic.net/melona/libs/1482/1482864/7a75f9e4c96886c8aca9_20240124160331812.jpg";
    
    // \\storage\\banner.jpg
    
    
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedInputStream in = null;
    BufferedOutputStream out = null;
    
    try {
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(spec + " 접속 불가");
      }
      
      in = new BufferedInputStream(con.getInputStream());
      File dir = new File("\\storage");
      if(!dir.exists()) {
        dir.mkdirs();
      }
      File file = new File(dir, "banner.jpg");
      out= new BufferedOutputStream(new FileOutputStream(file));
      
      byte [] b = new byte [10];
      int readbyte = 0;  // 실제로 읽은 바이트수 검사 10바이트 아래로 읽을때
      while((readbyte = in.read(b)) != -1) {
        out.write(b, 0, readbyte);
        
        
      }
      out.close();
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null)
      con.disconnect();
    }
    
  }
  
  public static void main(String[] args) {
   
    method2();
  }
  
}
