package pkg08_this;

public class MainClass {

  public static void main(String[] args) {

    Computer computer = new Computer();
    
    System.out.println(computer);
    computer.showThis();
    
    System.out.println(computer.model); // this 는 현재 class 이다 여기서는 Main
    computer.showModel();   
    
    
    
    
  }

}
