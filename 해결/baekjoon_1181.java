/* comment
- LinkedHashSet 에 대해 알게 됨
- 초기 값인 배열( 정렬하고 싶은 배열 )을 중복을 제거하고 동시에 정렬까지 보장된 LinkedHashSet를 만듦
- sort()에서 Comparator.comparing(String::length)를 통해 배열에 있는 문자열 길이 순으로 정렬을 함 
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class baekjoon_1181 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    
    int input_num = scan.nextInt();

    String[] word = new String[input_num];

    for(int i = 0; i<input_num; i++ ){
      word[i] = scan.next();
    }
    
    // 사전 순으로 단어 정렬
    Arrays.sort(word); 

    // 중복을 제거하며 정렬(순서)보장 , 선언과 동시에 초기 값 설정 
    LinkedHashSet<String> word2 = new LinkedHashSet<String>(Arrays.asList(word)); 
    
    word = word2.toArray(new String[0]);

    // 문자열 길이 순으로 정렬
    Arrays.sort(word,Comparator.comparing(String::length));
    
    // System.out.println(Arrays.deepToString(word)); // 배열 값들 문자열로 보여주기
    
    for (int i = 0 ; i<word.length; i++){
        System.out.println(word[i]);
    }

  }

}
