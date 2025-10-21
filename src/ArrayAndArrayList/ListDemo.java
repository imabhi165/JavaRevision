import java.util.ArrayList;
import java.util.Collections;

public class ListDemo { 
  public static void main(String[] args) {
//In Arraylist there is a 4 methods which is add,set,get,remove

//Understanding the add method

System.out.println("**********Add Method***********");
ArrayList<String> fruits = new ArrayList<String>();
fruits.add("Mango");
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Grapes");   
for(String fruit : fruits)System.out.println(fruit);
// System.out.println(fruits);

System.out.println("**********Get Method***********");
for(int i=0; i<fruits.size(); i++) {
    System.out.println(fruits.get(i));
}

System.out.println("**********Set Method***********");
fruits.set(1, "Pineapple"); // it will replace the Apple with Pineapple
for(String fruit : fruits)System.out.println(fruit);    

System.out.println("**********Remove Method***********");
fruits.remove(0); // it will remove the Mango from the list
for(String fruit : fruits)System.out.println(fruit);


System.out.println("**********Sorting the ArrayList***********");
    //This is all about how to sort an ArrayList in Java 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("Audi");
    
    Collections.sort(cars);

    for (String i : cars) {
      System.out.println(i);
    }
  } 
}
