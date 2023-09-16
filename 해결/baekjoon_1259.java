/* comment
- 동적 배열을 선언 하기 위해서 ArrayList를 사용
- java에서 문자열을 비교할때는 == 가 아닌 eqauls()를 사용, 변수앞에 !를 붙이면 not
- 문자열을 역순으로 바꾸기 위해서 StringBuffer 타입으로 문자열을 선언해줌 안에 있는 reverse()를 사용
 */

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_1259 {
  
  public static void main (String[] args){

    Scanner scan = new Scanner(System.in);

    // 동적 배열 선언 ArrayList 선언
    ArrayList<String> num = new ArrayList<>(); 
    String data;

    // 입력값을 배열에 넣어줌
    while (!(data = scan.nextLine()).equals("0")){
      num.add(data);
    }

    // reverse()를 사용하기 위해서 StringBuffer 를 사용 => 문자열 역순 
    for (int i = 0; i<num.size() ; i++){

      StringBuffer sb = new StringBuffer(num.get(i));

      if( sb.reverse().toString().equals(num.get(i)) ){
        System.out.println("yes");
      }else{
        System.out.println("no");
      }
    
    }

  }


}
