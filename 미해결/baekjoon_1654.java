/* comment

*/

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1654 {
  static int min,max;
  static int N_result = 0;

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int k = scan.nextInt();
    int n = scan.nextInt();

    int[] k_array = new int[k];

    for (int i = 0; i<k_array.length; i++){
      k_array[i] = scan.nextInt();
    }
    Arrays.sort(k_array);
    min = k_array[0]/2;
    max = k_array[0];

    N_count(k_array);
    
    while(N_result<=n){
      // 여기 조건문을 달아줘야 함 => min값이 오른쪽으로 갈때/ min 값이 왼쪽으로 갈때
      standard(min, false);
      N_count(k_array);
    
    }

    System.out.println(Arrays.toString(k_array));


  }

  public static void N_count(int[] arr){

    int count = 0;

    for (int i=0;i<arr.length;i++){
      count += arr[i]/min;
    }

    N_result = count;
  }


  public static void standard (int n, boolean bool){

    if(bool){ // true = left
      n = n/2;
    }else{ // false = right
      n = n+(n/2);
    }
    min = n;

  }


}