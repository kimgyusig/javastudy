package pkg04_checked;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

  public static void main(String[] args) {
    //패키지생략가능 java.lang 일때, 동일한 패키지인경우
    // checked exception : try - catch 와 같은 예외 처리 코드가 없으면 동작하지 않는 예외이다.

    try {
    URL url = new URL("https://www.google.com/");
    } catch(MalformedURLException e) {
      System.out.println("잘못된 URL입니다.");
    }
  }

}
