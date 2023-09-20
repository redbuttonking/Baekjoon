/* comment
- 브루트포스 알고리즘 사용
- while문을 통해 num을 계속해서 증가시키고 그때마다 num을 String으로 바꾸어 문자열"666"과 앞에서부터 비교한다(comparison 함수)
-----------------------------------메모리 초과---------------------------------------------
ㄴ 해결 => 음...최대한 변수선언(?)을 안하고 했음 ㅇㅇ 
-----------------------------------다른 사람들의 풀이---------------------------------------
- if문으로 중복 사용해서 해결
- String에서 contains() 함수를 사용함 => 정수를 문자열로 바꾸고 "666"이 있는지 확인

*/

import java.util.Scanner;

public class baekjoon_1436 {
  

  public static void main (String[] args){

    int count = 0;
    int num = 665;
    Scanner scan = new Scanner(System.in);
    int input_num = scan.nextInt();
    String str;

    
    while(count != input_num){
      num++;
      str = Integer.toString(num);


      for (int i = 0 ; i <= str.length()-3; i++){
        if(comparison(str,i)){
          count++;
          break;
        }
      }

    }
    System.out.println(num);
  }

  public static boolean comparison(String num, int x){
  
    int triple = 0;

    for(int i = 0; i < 3 ; i++){

      triple += num.charAt(i+x) == "666".charAt(i) ? 1 : 0;
   
    }

    return triple == 3 ? true : false;

  }

}
