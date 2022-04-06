import java.util.*;

public class Treesort {
    public static void main(String[] args) {

        DictBinTree DB = new DictBinTree();
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            DB.insert((sc.nextInt()));
            n++;
           }
    
        System.out.println();
        ArrayList<Integer> liste = DB.orderedTraversal();
        int i = 0;


        while (i < n){
            System.out.println((liste.get(i).intValue()));
            //System.out.println(DB.getKey());
            i++;
        }
       }
    
}
