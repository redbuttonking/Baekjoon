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
    
    Arrays.sort(word);

    LinkedHashSet<String> word2 = new LinkedHashSet<String>(Arrays.asList(word)); 
    // 중복을 제거하며 정렬(순서)보장 , 선언과 동시에 초기 값 설정 
    
    word = word2.toArray(new String[0]);

    Arrays.sort(word,Comparator.comparing(String::length));
    
    // System.out.println(Arrays.deepToString(word)); // 배열 값들 문자열로 보여주기
    
    for (int i = 0 ; i<word.length; i++){
        System.out.println(word[i]);
    }

  }

}
