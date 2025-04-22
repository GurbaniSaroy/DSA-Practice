package linkedList;
import java.util.*;

public class Intoduction {
    public static void main(String[] args) {
        /*Node n1 = new Node(10);
        Node n2 = new Node(5);
        
        n1.next = n2;
        
        System.out.println(n1.data);
        
        Node addOfSecnd = n1.next;
        System.out.println(addOfSecnd.data);
        */

        Scanner sc = new Scanner(System.in);
        Node n1 = new Node(sc.nextInt());
        Node n2 = new Node(sc.nextInt());
        Node n3 = new Node(sc.nextInt());
        Node n4 = new Node(sc.nextInt());

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(n1.data);
        Node addSec = n1.next;
        System.out.println(addSec.data);
        Node addThrd = addSec.next;
        System.out.println(addThrd.data);
        Node addfrth = addThrd.next;
        System.out.println(addfrth.data);
        
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}