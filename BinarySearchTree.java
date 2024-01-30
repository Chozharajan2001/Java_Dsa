//Binary Search tree Implementation in java
class BinarySearchTree{
    Node root;
    class Node{
        int key;
        Node left,right;
        public Node(int val){
            key = val;
            left = right = null;
        }
    }
    public BinarySearchTree(int val){
        root = new Node(val);
    }
    public BinarySearchTree(){
        root = null;
    }
    //Inserting elements in Binary Search Tree   //O(h) // h-height of the tree
    public void insert(int val){
        insert(root, val);
    }
    public Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val<root.key){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    //InOrder Traversal  
    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.key+" ");//Left Root Right
            inOrder(root.right);
        }
    }
    //Search and Find element   //O(h) // h-height of the tree
    public Node search(Node root, int val){
        if(root == null || root.key == val){
            return root;
        }
        if(root.key<val){
            return search(root.left, val);
        }
        return search(root.right, val);
    }
}

class Main{
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(10);
        tree.insert(25);
        tree.insert(60);
        tree.insert(90);
        
        BinarySearchTree.inOrder(tree.root);
        
        if(tree.search(tree.root, 50) == null){
            System.out.println("\nNot Found");
        }
        else{
             System.out.println("\nFound");
        }
        
    }
}
