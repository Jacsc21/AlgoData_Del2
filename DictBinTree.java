import java.util.*;

public class DictBinTree implements Dict{
    
    private BinNode root;

    public DictBinTree(){
        this.root = null;
    }

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

    public boolean search(int k){
        return treeSearch(this.root, k);
        
    }

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

    public ArrayList<Integer> orderedTraversal(){
        ArrayList<Integer> liste = new ArrayList<Integer>();
        BinNode x = this.root;
        return inorderTreeWalk(x, liste);

    }

    private ArrayList<Integer> inorderTreeWalk(BinNode x, ArrayList<Integer> liste){
        if(x != null){
            inorderTreeWalk(x.getLeftChild(), liste);
            liste.add(Integer.valueOf(x.getData()));
            inorderTreeWalk(x.getRightChild(), liste);
        }
        return liste;
    }
}
