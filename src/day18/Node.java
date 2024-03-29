package day18;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value){
        this.value = value;

    }
    public int getValue(){
        return this.value;
    }
    public Node getLeftChild(){
        return this.leftChild;
    }
    public void setLeftChild(Node leftChild){
        this.leftChild = leftChild;
    }
    public Node getRightChild(){
        return rightChild;
    }
    public void setRightChild(Node rightChild){
        this.rightChild = rightChild;
    }
}
