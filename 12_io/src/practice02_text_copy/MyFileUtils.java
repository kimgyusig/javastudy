package practice02_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileUtils {

  public static void fileCopy(File src, File dest) {
  
    // 원본
    
    
    // BufferedReader : File src 읽는 역할
    // BufferedWriter : File dest 만드는 역할
    
     
    
    try (BufferedReader in =new BufferedReader(new FileReader(src));
        BufferedWriter out = new BufferedWriter(new FileWriter(dest)) ){
      
     char [] cbuf = new char[256];
      int readChar =0;  
      
      // in.read(cbuf) -> out.write(cbuf)
     
      while( (readChar = in.read(cbuf)) != -1) {
        out.write(cbuf, 0, readChar);
        
      }
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void fileCopy2(File src, File dest) {
    
    // 원본 
    File file = new File(src, "");
    
    // 복사본
    File file2 = new File(dest, "");
    
    // 버퍼 스트림 입력 선언
    BufferedReader in = null;
    
    // 버퍼 스트림 출력 선언
    BufferedWriter out = null;
     
     try {
      
       in = new BufferedReader(new FileReader(file));
       out = new BufferedWriter(new FileWriter(file2));
       
       // 읽는 데이터
       String line = null;
       
       //읽기
       while((line = in.readLine()) != null){
        out.write(line); 
       }
       out.close();
       in.close();
       
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void fileMove(File src, File dest) {
    
    fileCopy(src, dest);
    src.delete();
    
  }
}
