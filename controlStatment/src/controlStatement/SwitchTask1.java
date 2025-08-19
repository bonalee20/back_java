package controlStatement;

import java.util.Scanner;

public class SwitchTask1 {
   public static void main(String[] args) {
//      계절을 맞추는 프로그램
//      겨울 12 1 2       // 0
//      봄 3 4 5       // 1
//      여름 6 7 8       // 2
//      가을 9 10 11       // 3
      
//      입력) 10
//      출력) 10월은 가을입니다.
      Scanner sc = new Scanner(System.in);
      String message = "계절을 확인하고 싶은 월을 입력하세요.\nex)10",
            seasonMessage = "";
      int month = 0, season = 0;
      
      System.out.println(message);
      month = sc.nextInt();
      season = month / 3 % 4;
      
      switch(season) {
      case 0:
         seasonMessage = month + "월은 겨울입니다.";
         break;
      case 1:
         seasonMessage = month + "월은 봄입니다.";
         break;
      case 2:
         seasonMessage = month + "월은 여름입니다.";
         break;
      case 3:
         seasonMessage = month + "월은 가을입니다.";
         break;
      default:
         break;
      }
   
      System.out.println(seasonMessage);
      
   }
}











