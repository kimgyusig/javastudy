package pkg08_intermedia_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

  public static void method1() {
    
    // filter() 메소드
    // Stream<T> filter(Predicate<T> predicate) { }
    
    List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    //Stream<Integer> numbers = list.stream();
    list.stream().filter( (number) -> number % 2 ==0 /* {return true}  생략*/ )
     .forEach((number) -> System.out.println(number));  
    
  }
  
  public static void method2() {
    
    List<Book> books = Arrays.asList(
           new Book("a", "aa",20000),
           new Book("b", "bb",20000),
           new Book("c", "cc",20000),
           new Book("d", "dd",20000),
           new Book("e", "ee",20000)
           );
    
    books.stream()
    .filter((book) -> book.getPrice() >= 10000)
    .forEach((book) -> System.out.println(book.getTitle()));
    
    List<Book> over20000 = books.stream()
    .filter((book) -> book.getPrice() >= 20000)
    .collect(Collectors.toList());
    
    System.out.println(over20000);
            
    
  }

  public static void method3() {
    
    // map() 메소드 : 값을 바꿀 때 사용
    // Stream<T> map(Function<T, R> function) { }
    
    List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    list.stream()
    .map((number) -> number + 1)  // filter 와 map 을 같이 사용할땐 filter 부터 사용한다.
    .forEach((number) -> System.out.println(number));
    
    
    
  }

  public static void method4() {
    
    // 20000 이상은 책 가격을 50% 세일한 리스트 생성하기
    
    List<Book> books = Arrays.asList(
        new Book("a", "aa",20000),
        new Book("b", "bb",20000),
        new Book("c", "cc",20000),
        new Book("d", "dd",50000),
        new Book("e", "ee",40000)
        );
   List<Book> saleList = books.stream()
                          .filter((book) -> book.getPrice() >= 20000)
                          .map((book) -> new Book(book.getTitle(), book.getAuthor(), book.getPrice() / 2)).toList();
   saleList.stream()
       .forEach((book) -> System.out.println(book.getTitle() + ":" + book.getPrice()));
   
  }
  
  public static void main(String[] args) {
    method4();

  }

}
