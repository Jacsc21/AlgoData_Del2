public class BinNode{

    private int data;
    private BinNode rightChild;
    private BinNode leftChild;

    public BinNode(int data){
        this.data = data;
        this.rightChild = null;
        this.leftChild = null;
    }

    public int getData(){
        return this.data;
    }

    public BinNode getRightChild(){
        return this.rightChild;
    }

    public BinNode getLeftChild(){
        return this.leftChild;
    }

    public void setRightChild(BinNode node){
        this.rightChild = node;
    }

    public void setLeftChild(BinNode node){
        this.leftChild = node;
    }
}