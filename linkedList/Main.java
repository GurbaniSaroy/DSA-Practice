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
        // System.out.println("calling remove function");
        // while(ll.size != 0){
        //     ll.removeLast();
        //     ll.display();
        // }
        // System.out.println("removing first");
        // ll.removeFirst();
        // ll.display();
        
        // ll.getNodeAt(1);
        // System.out.println("adding node at idx");
        // ll.addNode(3,10);
        // ll.display();

        ll.reverseData();
        ll.display();
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

        // this.size = size++;
        size++;
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
        // this.size = size++;
        size++;
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

    public void removeFirst(){
        if(head == null){
            System.out.println("nothing to remove");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
        } else{
            Node headNext = head.next;
            head = headNext;
        }
        size--;
    }

    public Node getNodeAt(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("out of bound");
            return null;
        } 
        Node temp = head;
        for(int i = 0; i < idx; i++){
            Node tempNext = temp.next;
            temp = tempNext;
        }
        return temp;
    }

    public void addNode(int idx, int data){
        if(idx < 0 ||idx > size){
            System.out.println("idx out of bound");
            return;
        }
        if(idx == 0){
            addFirst(data);
        } else if(idx == size){
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node prevNode = getNodeAt(idx-1);
        Node nextNode = prevNode.next;

        prevNode.next = null; //breaking connetion with rest of LL
        prevNode.next = newNode; // connecting prev node to new node

        newNode.next = nextNode;
        // this.size++;
        size++;
    }

    public void reverseData(){

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