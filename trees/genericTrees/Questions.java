import java.util.ArrayList;

public class Questions {

    // brute force -> flattern the generic tree into a linear format-------------
    public static Node flatternGenericTree(Node root) {
        for (Node child : root.children) {
            flatternGenericTree(child);
        }
        while (root.children.size() > 1) {
            Node lastChild = root.children.remove(root.children.size() - 1);
            Node secondLastChild = root.children.get(root.children.size() - 1);

            Node tail = getTail(secondLastChild);

            tail.children.add(lastChild);
        }
        return root;
    }

    
    // optimised approach -> flattern the generic tree into a linear format-------------
    public static Node flatternGenericTree2(Node root){
        Node lastChildTail = flatternGenericTree2(root.children.remove(root.children.size()-1));
        return;
    }


    public static Node getTail(Node root) {
        Node temp = root;
        while (temp.children.size() > 1) {
            temp = temp.children.get(0);
        }
        return root;
    }


    public static void main(String[] args) {
        int treeData[] = { 10, 20, 50, -1, 40, 60, -1, 70, 110, -1, 120, -1, -1, 80, -1, -1, 40, 90, 100 };
    }
}

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