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


        while (n > 0){
            System.out.println((liste.get(0).intValue()));
            liste.remove(0);
            //System.out.println(DB.getKey());
            n--;
        }
       }
    
}
