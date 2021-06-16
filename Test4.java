import java.util.*;


public class Test4 {
   public static void main(String[] args) {
         ArrayList<String> Ilist = new ArrayList<String>();
         
         Ilist.add("노는 게 ");
         Ilist.add("좋아");
         
         for(int i=0; i<Ilist.size(); i++) {
            System.out.print(Ilist.get(i));
         }
         System.out.println();
         Ilist.add(1,"나는 ");
         for(int i=0; i<Ilist.size(); i++) {
            System.out.print(Ilist.get(i));
         }
         System.out.println();
         Ilist.add(2,"정말 정말 ");
         for(int i=0; i<Ilist.size(); i++) {
            System.out.print(Ilist.get(i));
         }
         System.out.println();
            
        //  System.out.println(Ilist.getFirst());
        //  System.out.println(Ilist.getLast());
         
         Collections.sort(Ilist);
         for(int i=0; i<Ilist.size();i++) {
            System.out.print(Ilist.get(i)+" ");
         }System.out.println();
         Collections.reverse(Ilist);
         for(int i=0; i<Ilist.size();i++) {
            System.out.print(Ilist.get(i)+" ");
         }System.out.println();
   }
}