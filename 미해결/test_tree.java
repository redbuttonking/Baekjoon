class Tree{

  class Node{
    int data;
    Node left;
    Node right;
    Node(int data){  // 생성자
      this.data = data;
    }
  }
 
  Node root; // Tree 맴버 변수 >> 트리가 시작하는 root 노드 저장

  public void makeTree(int[] a){ // 배열을 받아서 트리 만들기 시작해주는 함수
   
    root = makeTreeR(a,0, a.length-1); // 배열을 넣어주고 배열의 첫 index , 끝 index를 넣어줌 


  }
  public Node makeTreeR(int[] a,int start , int end){
    
    // 반복해서 재귀호출을 하다가 시작지점(index)가 끝지점(index) 보다 커지면
    if(start > end) return null; 


    int mid = (start + end)/2;
    Node node = new Node(a[mid]);

    node.left = makeTreeR(a, start, mid-1);
    node.right = makeTreeR(a, mid+1, end);

    return node;

  }
  public void searchBTree(Node n, int find){
    if(find<n.data){
      System.out.println("Data is samller than " + n.data);
      searchBTree(n.left, find);
    }else if(find > n.data){
      System.out.println("Data is bigger than " + n.data);
      searchBTree(n.right, find);
    }else{
      System.out.println("Data found!!");

    }
  }

}

public class test_tree {
    public static void main (String[] args){

      int[] a = new int[10];
      for (int i = 0; i<a.length; i++){
        a[i] = i;
      }

      Tree t = new Tree();
      t.makeTree(a);
      t.searchBTree(t.root, 2);
      

  }

}
