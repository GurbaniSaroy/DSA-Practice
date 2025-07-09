import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    ArrayList<Node> children;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class Main {

    public static void displayTree(Node root) {
        System.out.print(root.data + "->");

        for (Node child : root.children) { // for each loop on ArrayList
            System.out.print(child.data + ",");
        }
        System.out.println(".");

        // asking recursive fxn to print subTrees
        for (Node child : root.children) {
            displayTree(child);
            // no base case as root can't be null
        }
    }

    public static void size(Node root){
        
    }
    public static void main(String[] args) {
        int treeData[] = { 10, 20, 80, -1, -1, 30, 50, -1, 60 };

        // constucting a tree
        Stack<Node> st = new Stack<>();
        Node root = new Node(treeData[0]);
        for (int i = 0; i < treeData.length; i++) {
            int val = treeData[i];

            if (val == -1) {
                st.pop();
            } else {
                Node nn = new Node(val);
                if (st.size() == 0) {
                    root = nn; // when stack is empty and it will be when we have a new stack
                } else {
                    st.peek().children.add(nn); // adding on the peek node's child
                }
                st.push(nn);
            }
        }
        displayTree(root);
    }
}
