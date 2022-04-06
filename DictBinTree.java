/*
    Jacsc21@student.sdu.dk  Jacob Schmidt
    Julso21@student.sdu.dk  Julian Sørensen
    Jaali21@student.sdu.dk  Jan Alian
*/
import java.util.*;

public class DictBinTree implements Dict{
    
    //Class variable
    private BinNode root;

    //Constructor for the class
    public DictBinTree(){
        this.root = null;
    }

    //Metod for inserting a new node into the dictionary tree 
    public void insert(int k){
        BinNode z = new BinNode(k);
        BinNode y = null;
        BinNode x = this.root;
        while(x != null){
            y = x;
            if(z.getData() < x.getData()){
                x = x.getLeftChild();
            
            }
            else x = x.getRightChild();
        }
        if(y == null){
            this.root = new BinNode(k);
        }
        else if(k < y.getData())
        y.setLeftChild(z);
        else y.setRightChild(z);
    }

    //Public method for determining whether integer is present within the tree
    public boolean search(int k){
        return treeSearch(this.root, k);
        
    }

    //Actual method for determining whether integer is present within the tree
    private boolean treeSearch(BinNode x, int k){
        Boolean result = false;
        while(k != x.getData() || x == null){
            if(x == null)
            result = false;
            if(k == x.getData())
            result = true;
            if(k < x.getData())
            x = x.getLeftChild();
            else x = x.getRightChild();
        }
        return result; 
    }

    //Public method for creating a list over the data of the nodes within the tree
    public ArrayList<Integer> orderedTraversal(){
        ArrayList<Integer> liste = new ArrayList<Integer>();
        BinNode x = this.root;
        return inorderTreeWalk(x, liste);

    }

    //Actual method for creating a list over the data of the nodes within the tree
    private ArrayList<Integer> inorderTreeWalk(BinNode x, ArrayList<Integer> liste){
        if(x != null){
            inorderTreeWalk(x.getLeftChild(), liste);
            liste.add(Integer.valueOf(x.getData()));
            inorderTreeWalk(x.getRightChild(), liste);
        }
        return liste;
    }
}
