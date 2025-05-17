package Collection;

// Methods of the List implementing in the class which is ArrayList

import java.util.ArrayList;

class program1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
            al.add(10);
            al.add(20);
            al.add("ppp");
            al.add("qqq");
            al.add("aws123");
        System.out.println(al);

        // Method 1: add an element at last
        al.add("yyy");
        System.out.println(al);

        // Method 2: add element at specific index
        al.add(2, "aaa");
        System.out.println(al);

        // Method 3 : use to update or modify the element at specific index
        al.set(2, "bbb");
        System.out.println(al);

        // Method 4:it is used to remove element direct
        al.remove("bbb");
        System.out.println(al);

        // Method 5 : it return the element at the index  but  one thing is to remember that the return type of it is object
        int s = (int)al.get(0);
        System.out.println(s);

        // Method 6 :  return the no. of elements
        System.out.println(al.size());

    }
    
}
