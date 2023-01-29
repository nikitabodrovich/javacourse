package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14,23,11,18,22,27,5,15,18,24,150,8};
        for (int number: numbers)
            addNode(number, root);

        dfs(root);
    }

    public static void dfs(Node node){
        if (node == null)
            return;

        dfs(node.getLeftChild());
        System.out.print(node.getValue()+" ");
        dfs(node.getRightChild());
    }

    public static void addNode(int insertNumber ,Node root){
        if (root == null)
            throw new IllegalArgumentException("Нет корня");

        Node nextNode = root;
        Node current = null;
        while (nextNode != null){
            current = nextNode;

            if (insertNumber < current.getValue()){
                nextNode = current.getLeftChild();
            } else{
                nextNode = current.getRightChild();
            }
        }
        if (insertNumber < current.getValue()){
            current.setLeftChild(new Node(insertNumber));
        } else {
            current.setRightChild(new Node(insertNumber));
        }

    }

}
