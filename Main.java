import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

//     int CountNode(Node start) {
//        int count = 0;
//        Node current = start;
//
//        while (current != null) {
//            count++;
//            current = current.next;
//        }
//
//        return count;
//    }
//    public void reverse(Node start){
//        int l= start.data;
//        int r=count-1;
//        Node left=new Node(l);
//        Node right = new Node(r);
//        int temp= left.data;
//        left.data= right.data;
//        right.data=temp;
//        l++;
//        r--;
//
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        Node start = new Node(sc.nextInt());
//        Node p = start;
//
//
//        for (int i = 1; i<4; i++){
//            p.next = new Node(sc.nextInt());
//            p = p.next;
//        }
//
//        int No_Of_Nodes = CountNode(start);
//
//        System.out.println("Number of nodes: " + No_Of_Nodes);
//
//    }
//}


    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Node start=new Node(2);
      Node p=start;
      for(int i=0;i<5;i++){
          p.next=new Node(sc.nextInt());
          p=p.next;
      }
      for(Node i=start;i!=null;i=i.next){
          System.out.println(i.data);
      }
            Node current = start;
            Node prev = null;
            Node next = null;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                System.out.println(prev.data);
            }


        }


    }


