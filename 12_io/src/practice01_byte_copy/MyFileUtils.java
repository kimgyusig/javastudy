package practice01_byte_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;




public class MyFileUtils {

  // 파일 복사 메소드
  public static void fileCopy(String src, String dest) {
    
    // src로부터 읽은 데이터를 바이트 배열에 저장하고,
    // 바이트 배열에 있는 데이터 파일 출력 스트림으로 보내는 방식
    
    // 원본 File 객체
    File srcFile = new File(src);
    
    // 복사본 File 객체
    File destFile = new File(dest);
    
    // 원본을 읽는 버퍼 입력 스트림 선언
    BufferedInputStream in = null;
    
    // 복사본을 만드는 버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
    
   try {
    
     // 원본을 읽는 버퍼 입력 스트림 생성
     in = new BufferedInputStream(new FileInputStream(srcFile));
     
     // 복사본을 만드는 버퍼 출력 스트림 생성
     out = new BufferedOutputStream(new FileOutputStream(destFile));
     
     // 원본을 5바이트씩 읽어온다.
     byte[] bytes = new byte[5];
     
     // 원본을 끝까지 읽는다.  읽는 내용을 복사본으로 보낸다.
     int readByte = 0;
     while( (readByte = in.read(bytes)) != -1) {
       out.write(bytes, 0, readByte);
     }
     
     // 버퍼 출력 스트림 닫기        생성의 역순으로 닫는게 좋다
     out.close();
     
     // 버퍼 입력 스트림 닫기       생성의 역순으로 닫는게 좋다
     in.close();
     
     
  } catch (Exception e) { 
    
  }
    
    
  }
  
  // 파일 이동 메소드
  
  public static void fileMove(String src, String dest) {
    
    fileCopy(src,dest);
    new File(src).delete();
    
  }
  
  
 
}


 


