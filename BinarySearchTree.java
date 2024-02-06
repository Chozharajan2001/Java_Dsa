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
    //delete an element in BST
    public void delete(int val){
        root = delete(root, val);
    }
    public Node delete(Node root, int val){
        if(root == null){
            return root;
        }
        if(val>root.key){
            root.right = delete(root.right, val);
        }
        else if(val<root.key){
            root.left = delete(root.left, val);
        }
        else{
            if(root.right == null){
                return root.left;
            }
            if(root.left == null){
                return root.right;
            }
            root.key = min(root.right);
            root.right = delete(root.right, root.key);
        }
        return root;
    }
    public int min(Node root){
        // if(root.left == null){
        //     return root.key;
        // }
        // return min(root.left);
        int minval = root.key;
        while(root.left != null){
            minval = root.left.key;
            root = root.left;
        }
        return minval;
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
        
        tree.delete(70);
        BinarySearchTree.inOrder(tree.root);
        
    }
}
