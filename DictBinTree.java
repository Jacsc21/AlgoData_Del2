import java.util.*;

public class DictBinTree implements Dict{
    
    private BinNode root;

    public DictBinTree(){
        BinNode root = null;
    }

    public void insert(int k){
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
        y.setLeftChild(new BinNode(k));
        else y.setRightChild(new BinNode(k));
    }

    public boolean search(int k){
        BinNode x = this.root;
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

    public ArrayList<Integer> orderedTraversal(){}
}
