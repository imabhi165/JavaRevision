//classes and objects ->
// Classes -> It  is like a blueprint or template that defines the structure and behaviour (method and variables) of objects.
//Object -> It is an Instance of a class.It represents a real world entity.

package OOps;

 class student{
    int id;
    String name;
    void display(){
        System.out.println(id+ "" +name);
    }

}  

public class TestStudent{
    public static void main(String[] args){
        student s1 = new student(); //object creation
        s1.id = 1;
        s1.name = "Alice";
        s1.display();
    }

}
