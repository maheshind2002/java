package Collection;

// Program statement : finding out unique number from all of the registered number for the enquiry  

import java.util.*;

class program2 {

    public static void main(String[] args) {
     /*  List<Integer> l = new ArrayList<Integer>();
        l.add(1111);
        l.add(2222);
        l.add(3333);
        l.add(4444);   // Here from line 9 to 17 we are adding element in the Arraylist which is lengthy process 
        l.add(5555);   // so that we can add all of the above using one concept "Collection factory method added in java 9 version"
        l.add(6666);
        l.add(2222);
        l.add(5555);
        l.add(9999);*/
       // List<Integer> l = List.of(1111,2222,3333,4444,5555,6666,7777,5555,1111,3333,4444); // error on these line bcz of method introduced in java 9
       List<Integer> l = Arrays.asList(1111, 2222, 3333, 4444, 5555, 6666, 7777, 5555, 1111, 3333, 4444);

    System.out.println(l);

    Set s = new LinkedHashSet();
    s.addAll(l);
    System.out.println(s);

    }
    
}
