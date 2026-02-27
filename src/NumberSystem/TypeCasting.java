public class TypeCasting {
  public static void main(String[] args) {
    /*
     * TypeCasting :- TypeCasting means converting one data type to another data
     * type.
     * There are two types of TypeCasting in Java :-
     * 1.Implicit TypeCasting (Widening) -> small type to big type.
     * Ex:- byte->short->int->long->float->double.
     * int x = 10;
     * double y = x;
     * -------------------------------------------------------------------------
     * 2.Explicit TypeCasting (Narrowing) -> big type to small type.
     * Ex:- double->float->long->int->short->byte.
     * double x = 10.76;
     * int y = int(x); manually TypeCasting
     */

    int a = 10;
    double y = a;
    System.out.println(y);

    double x = 10.75;
    int b = (int) x;
    System.out.println(b);
  }
}
