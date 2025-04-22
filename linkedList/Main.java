package linkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        for (int i = 1; i <= 4; i++) {
            ll.addFirst(i);
            // ll.addLast(i);
            ll.display();
        }
        System.out.println("calling remove function");
        while(ll.size != 0){
            ll.removeLast();
            ll.display();
        }
        // System.out.println(ll);
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    public void addLast(int data) {
        Node newNode = new Node(data);

        // if size = 0(head == null or size == 0)
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        this.size = size++;
    }

    public void addFirst(int data) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        this.size = size++;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("nothing to remove");
            return;
        }

        if(head.next == null){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node temp = head;
        while(temp.next != tail){//finding tail
            Node tempNext = temp.next;
            temp = temp.next;
            System.out.println("removed one");
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    public void display() {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data +"\t");

            // Node tempNext = temp.next;
            // temp = tempNext;
            // OR
            temp = temp.next;
        }
        System.out.println();
    }
}