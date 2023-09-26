/* comment
 -  while 문에서 무한 루프가 돈다
    min 이 152가 되면 같은 값으로 왔다갔다 하게됨 (랜선 15 와 6으로 왔다리 갔다리)


*/

import java.util.Arrays;
import java.util.Scanner;



public class baekjoon_1654 {
  
  static int min_1st = 0, min = 0 , max = 0;
  static int N_result = 0;
  

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    boolean tf = true;

    int k = scan.nextInt();
    int n = scan.nextInt();

    int[] k_array = new int[k];

    for (int i = 0; i<k_array.length; i++){
      k_array[i] = scan.nextInt();
    }
    Arrays.sort(k_array);
    max = k_array[0];
    min_1st = k_array[0]/2;
    min = k_array[0]/2;


    N_count(k_array);
    System.out.println("min = " + min_1st);
    System.out.println("1번= " + N_result);

    while(N_result!=n){ // 무한 루프 = min 이 152가 되면 같은 값으로 왔다갔다 하게됨 (랜선 15 와 6으로 왔다리 갔다리)

      if(N_result < n ){
        tf = true;
      }else{
        tf = false;
      }

      standard(min, tf);
      N_count(k_array);
      System.out.println("min = " + min);
      System.out.println("랜선 결과 =" + N_result);
    
    }


    // standard(min, false);
    // N_count(k_array);
    // System.out.println("min = " + min);
    // System.out.println("3번 =" + N_result);

    // standard(min, true);
    // N_count(k_array);
    // System.out.println("min = " + min);
    // System.out.println("4번 =" + N_result);

    // standard(min, false);
    // N_count(k_array);
    // System.out.println("min = " + min);
    // System.out.println("5번 =" + N_result);

    // standard(min, true);
    // N_count(k_array);
    // System.out.println("min = " + min);
    // System.out.println("6번 =" + N_result);
    
    // standard(min, false);
    // N_count(k_array);
    // System.out.println("min = " + min);
    // System.out.println("7번 =" + N_result);
    
    // standard(min, true);
    // N_count(k_array);
    // System.out.println("min = " + min);
    // System.out.println("8번 =" + N_result);
    
    // standard(min, false);
    // N_count(k_array);
    // System.out.println("min = " + min);
    // System.out.println("9번 =" + N_result);   






    // while(N_result<=n){
    //   // 여기 조건문을 달아줘야 함 => min값이 오른쪽으로 갈때/ min 값이 왼쪽으로 갈때
    //   standard(min, false);
    //   N_count(k_array);
    
    // }

    // System.out.println(Arrays.toString(k_array));
    // System.out.println("min = " + min + "max = "+ max);


  }

  public static void N_count(int[] arr){

    int count = 0;

    for (int i=0;i<arr.length;i++){
      count += arr[i]/min;
    }

    N_result = count;
  }


  public static void standard (int n, boolean bool){

    if (min_1st <= n){ // min 값이 첫 min 값 보다 같거나 작을 경우에
      if(bool){ // true = left
         n = n/2;
      }else{ // false = right 
        n += n/2;
      }

    }else if(n < min_1st){ // min 값이 첫 min 값 보다 클 경우에
      if(bool){ // true = left
         n = n - (max -min)/2;
      }else{ // false = right 
        n = n + (max - min)/2;
      }

    }
    min = n;


    // if(bool){ // true = left
    //   n = n/2;
    // }else{ // false = right
    //   n = n+(n/2);
    // }
    // min = n;

  }

}