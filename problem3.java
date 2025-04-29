class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class problem3 {

    
    public static int maxDepth(Node root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        int result = maxDepth(root);
        System.out.println("Maximum Depth: " + result);  
    }
}
