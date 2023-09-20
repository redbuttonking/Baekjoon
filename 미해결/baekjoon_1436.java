/* comment





N 0~10,000


*/

import java.util.Scanner;

public class baekjoon_1436 {
  

  public static void main (String[] args){

    int count = 0;
    int num = 665;
    Scanner scan = new Scanner(System.in);
    int input_num = scan.nextInt();

    String str;
    str = Integer.toString(input_num);
    
    // while(count != input_num){
    //   num++;
    //   System.out.println(num);

    //   for (int i = 0 ; i < str.length()-3; i++){

    //     if(comparison(num,i)){
    //       count++;
    //     }
    //     break;
    //   }
    //   if(num==count){
    //     break;
    //   }
    // }

    System.err.println("출력된거 맞음?");
    System.out.println(count);

  }

  public static boolean comparison(int num, int x){
    
    String snum = Integer.toString(num);
    String num6 = "666";
    int triple = 0;

    for(int i = 0; i < 3 ; i++){

      triple += snum.charAt(i+x) == num6.charAt(i) ? 1 : 0;
      System.out.println("트리플 값"+triple);
      
    }

    return triple == 3 ? true : false;

  }

}
