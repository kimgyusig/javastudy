package practice01_Board;

import java.util.List;

public class MainClass {

  public static void main(String[] args) {

    BoardService boardService = new BoardService();
    
    boardService.getBoadrList();  // 하나씩 출력하기
    
    List<BoardVo> boardList =boardService.getBoadrList();
    
    // to String 이용하기
    for(int i =0, size = boardList.size(); i < size; i++) {
      System.out.println(boardList.get(i));
    }
    
    // Getter 활용하기
    for(int i =0, size = boardList.size(); i <boardList.size(); i++) {
      System.out.println("번호 : " + boardList.get(i).getBoardNo());
      System.out.println("제목 : " + boardList.get(i).getTitle());
    }
  }
  

}
