package pkg07_polymorphism;

public class MainClass {

  public static void main(String[] args) {

    Tv tv = new Tv();
    Radio radio = new Radio();
    
    
    Person person = new Person();
    
    person.powerOn(tv);
    person.powerOn(radio);
    
    
  }

}
// 1. 클래스들의 부모만들기
// 2. 메소드를 부모에 만들고 자식들은 다시 만들기
// 하나의 타입으로 여러개 저장하기 위해서 부모를 준비
// Elec elec