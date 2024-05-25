//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//
//}
// class moin{
//    Node head;
//
//    void getdata() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter elements (enter -1 to stop):");
//
//        int data = sc.nextInt();
//        while (data != -1) {
//            Node newNode = new Node(data);
//
//            if (head == null) {
//                head = newNode;
//            } else {
//                Node ab = head;
//                while (ab.next != null) {
//                    ab = ab.next;
//                }
//                ab.next = newNode;
//            }
//
//            data = sc.nextInt(); // Read the next input
//        }
//        sc.close();
//    }
//
//    void printList() {
//        Node ab = head;
//        System.out.println("Elements of the linked list:");
//        System.out.print("[");
//        while (ab != null) {
//            System.out.print(ab.data + "   ");
//            ab = ab.next;
//        }
//        System.out.print("]");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        moin aaa =new moin();
//
//        // Create the linked list based on user input
//        aaa.getdata();
//
//        // Print the elements of the linked list
//        aaa.pri
import java.util.*;
class Moin {
    int data;
    Moin next;

    Moin(int data) {
        this.data = data;
    }
    public  Moin duplicateLinkedList(Moin p) {
        Moin star = new Moin(p.data);
        Moin temp = star;
        p = p.next;

        while (p != null) {
            temp.next = new Moin(p.data);
            p = p.next;
            temp = temp.next;
        }

        return star;
    }



//    Moin reverse(Moin start){
//      Moin p=start;
//        Moin q=p.next;
//      if (start==null)
//      return p;
//
//      p=start;
//      q= p.next;
//      if (q==null)
//          return p;
//
//      q=reverse(q);
//      p.next.next=p;
//      p.next=q;
//      return q;
//    }
//
//    public static void main(String[] args) {
//
//        Moin start=new Moin(1) ;
//        Moin p=start;
//        p.next=new Moin(2);
//        p=p.next;
//        p.next=new Moin(3);
//        p=p.next;
//        p.next=new Moin(4);
//        p=p.next;
//        p.next=new Moin(5);
//        p=p.next;
//        p.next=new Moin(6);
//
//
//
//Moin ee=start.reverse(start);
//
//
//
//        System.out.println(start.data);
//        System.out.println(start.next.data);
//        System.out.println(start.next.next.data);
//        System.out.println(start.next.next.next.data);
//        System.out.println(start.next.next.next.next.data);
//        System.out.println(start.next.next.next.next.next.data);
//
//    }
//
//}

    public static void main(String[] args) {
        Moin start=new Moin(12);
        Moin p=start;
        p.next=new Moin(24);
        p=p.next;

        p.next=new Moin(36);
        p=p.next;
        p.next=new Moin(48);
        p=p.next;
        p.next=new Moin(60);
        p=p.next;
        p.next=new Moin(72);


        System.out.println("The LinkedList elements are :");
        for(Moin i=start;i!=null;i=i.next){
            System.out.println(i.data);
        }



            if(start ==null || start.next==null){
                return;
            }
            Moin prev=start;
            Moin curr=start.next;
            while(curr!=null){
                Moin nextnode=curr.next;
                curr.next=prev;

                prev=curr;
                curr=nextnode;
            }
            start.next=null;
            start=prev;
int COUNT=0;
        System.out.println("The LinkedList elements are :");
        for(Moin i=start;i!=null;i=i.next){
            System.out.println(i.data);
            COUNT++;
        }
        System.out.println(COUNT);



}}