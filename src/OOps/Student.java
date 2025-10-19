package OOps;

public class Student {

    int Roll_no = 10;
    String StudentName = "Abhishek";

    public static void main(String[] args) {
        Student obj1 = new Student();
        System.out.println(obj1.Roll_no);
        System.out.println(obj1.StudentName);

     
        Student obj2 = new Student();
        System.out.println(obj2.StudentName);

    }
}
