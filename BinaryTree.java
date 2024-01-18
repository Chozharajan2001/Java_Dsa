class BinaryTree{
    Node root;
    //Creating Nodes which has data, left node reference and right node reference
    class Node{
        int data;
        Node left, right;
        public Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }
    public BinaryTree(int d){
        root = new Node(d);
    }
    //Inserting a node to left of the parent node
    public void insertLeft(Node r, int val){
        Node newNode = new Node(val);
        r.left = newNode;
    }
    //Inserting a node to right of the parent node
    public void insertRight(Node r, int val){
        Node newNode = new Node(val);
        r.right = newNode;
    }
    
    //Tree Traversal{preOrder, inOrder, postOrder}
    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data+" ");//Root Left Right
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");//Left Root Right
            inOrder(root.right);
        }
    }
    public static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");//Left Right Root
        }
    }
}
class Main{
    public static void main(String[] args){
       // tree looks like
        // ---------------
        //       10
        //   5        15
        // 4   6    14  16
        //
        BinaryTree tree = new BinaryTree(10);
        tree.insertLeft(tree.root, 5);
        tree.insertRight(tree.root, 15);
        tree.insertLeft(tree.root.left, 4);
        tree.insertRight(tree.root.left, 6);
        tree.insertLeft(tree.root.right, 14);
        tree.insertRight(tree.root.right, 16);
        
        System.out.println("preOrder traversal");
        BinaryTree.preOrder(tree.root);
        System.out.println("\ninOrder traversal");
        BinaryTree.inOrder(tree.root);
        System.out.println("\npostOrder traversal");
        BinaryTree.postOrder(tree.root);
    }
}
