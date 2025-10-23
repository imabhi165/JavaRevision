package Optional;

import java.util.Optional;

public class OPTDemo {
    public static void main(String[] args) {
        // String name1 = null;
        // System.out.println(name.length());
        // String name = "java";
        // if (name != null)
        // System.out.println(name.length());
        // else
        // System.out.println("No name value");

        // Optionals in java 8 -> java.util.Optional
        // Creating optional method 1
        /*
         * 
         * Optional<String> name1 = Optional.of("java");
         * // System.out.println(name1.get().length());
         * System.out.println(name1.isPresent()); // true
         * System.out.println(name1.isEmpty()); // false
         * System.out.println(name1.get());
         * // System.out.println(name1.get().length());
         */

        // Creating optional method 2 -> hardcoded
        /*
         * Optional<String> optionalString = Optional.ofNullable(null);
         * System.out.println(optionalString.isPresent()); // false
         * System.out.println(optionalString.isEmpty()); // true
         * // System.out.println(optionalString.get());
         */

        // Creating optional method 3 -> using ofNullable
        /*
         * Optional<String> name3 = Optional.ofNullable("java");
         * System.out.println(name3.isPresent());
         * System.out.println(name3.isEmpty());
         * System.out.println(name3.get());
         */

        // Safer way to retrive the value -> orElse()
        String name4 = null;
        System.out.println(name4.length());
    }

}
