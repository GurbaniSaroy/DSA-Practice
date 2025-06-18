package linkedList;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Scanner;

public class Questions {

    class Node{
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    class LinkedList{
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

        public int getKthFromLast(Node head, int k){
             
       Node slow = head; 
       Node fast = head;
       
       while(k > 0){
           if(fast == null){
               return -1;
           }
           Node fastNext = fast.next;
           fast = fastNext;
           k--;
       }
       
       while(fast != null){
           Node slowNext = slow.next;
           slow = slowNext;
           
           fast = fast.next;
       }
       return slow.data;
        }

        public ListNode middleNode(ListNode head){
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next.next != null){
                
            }
        }

    }
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/0
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        LinkedList ll = new LinkedList();
        int i =0;
        while(i<5){
            ll.addLast(i);
        }
        System.out.println(ll.getKthFromLast(ll.head, k));

        // https://leetcode.com/problems/middle-of-the-linked-list/description/?envType=problem-list-v2&envId=linked-list
        ll.middleNode(ll.head);
    }
}