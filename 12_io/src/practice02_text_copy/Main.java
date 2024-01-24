package practice02_text_copy;

import java.io.File;
import java.util.Scanner;

public class Main {
  

  public static void main(String[] args) {

   File src = new File("\\Program Files\\Java\\jdk-17\\LICENSE");
   File dest = new File( "\\storage\\LICENSE");
   
   MyFileUtils.fileCopy(src, dest);
  
  }

}
