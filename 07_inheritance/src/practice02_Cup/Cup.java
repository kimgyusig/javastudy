package practice02_Cup;

public class Cup {

  private Coffee coffee;
  
  public void fill(Coffee coffee) {
    this.coffee = coffee;
  }
  
  public void whoami() {
    coffee.whoami();
  }
  
  
}
/*public static void main(String[] args) {
Coffee coffee =new Americano();
coffee.whoami(); //호출은 커피 실행은 아메리카노
} */