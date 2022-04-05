public class BinNode

    private int data;
    private Node rightChild;
    private Node leftChild;

    public Node(int data){
        this.data = data;
        this.rightChild = null;
        this.leftChild = null;
    }

    public int getData(){
        return this.data;
    }

    public Node getRightChild(){
        return this.rightChild;
    }

    public Node getLeftChild(){
        return this.leftChild;
    }

    public void setRightChild(Node node){
        this.rightChild = node;
    }

    public void setLeftChild(Node node){
        this.leftChild = node;
    }