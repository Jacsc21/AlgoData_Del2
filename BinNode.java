/*
    Jacsc21@student.sdu.dk  Jacob Schmidt
    Julso21@student.sdu.dk  Julian Sørensen
    Jaali21@student.sdu.dk  Jan Alian
*/
public class BinNode{

    //Class variables 
    private int data;
    private BinNode rightChild;
    private BinNode leftChild;

    //Constructor for the class
    public BinNode(int data){
        this.data = data;
        this.rightChild = null;
        this.leftChild = null;
    }

    //Method for returning the data of a given node
    public int getData(){
        return this.data;
    }

    //Method for returning the right child of a given node
    public BinNode getRightChild(){
        return this.rightChild;
    }

    //Method for returning the left child of a given node
    public BinNode getLeftChild(){
        return this.leftChild;
    }

    //Method for setting the right child of a given node
    public void setRightChild(BinNode node){
        this.rightChild = node;
    }

    //Method for setting the left child of a given node
    public void setLeftChild(BinNode node){
        this.leftChild = node;
    }
}