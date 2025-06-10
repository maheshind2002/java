import java.util.ArrayList;
import java.util.*;

class traverse_coll {
    public static void main(String[] args) {
        List <String>fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        System.out.println(fruits);

        // Ways of traversing on collection
        //using traditional for loop
        for(int i =0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }
        System.out.println("*******************************");
        // using enhanced for loop(java 5)
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        System.out.println("*******************************");
        // using for each loop
        fruits.forEach(fruit-> System.out.println(fruit));
        System.out.println("*******************************");

        // using method reference
        fruits.forEach(System.out :: println);

    }
    
}
