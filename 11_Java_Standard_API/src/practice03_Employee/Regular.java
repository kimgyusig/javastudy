package practice03_Employee;

public class Regular extends Employee{

  // field
  private int salary;
  // constructor
  public Regular(int empNo, String name) {
    super(empNo, name);
    // TODO Auto-generated constructor stub
  }
  public Regular(int empNo, String name, int salary) {
    super(empNo, name);
    this.salary = salary;
  }
  
  // method
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }
  @Override
  public void info() {
    super.info();                     // 부모클래스의 인포내용 그대로 가져온다
    System.out.println("연봉 :" + salary);
  }
  
  
}
