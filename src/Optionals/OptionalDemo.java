package Optionals;

import java.util.Optional;

/**
 * Demonstrates basic usage and common pitfalls of java.util.Optional (Java 8+).
 *
 * <p>
 * The examples in this class (some commented out) compare traditional null checks with
 * Optional-based approaches. They illustrate three common ways to create an Optional:
 * <ul>
 *   <li>Optional.of(value) — for non-null values (throws NPE if value is null)</li>
 *   <li>Optional.ofNullable(value) — produces an empty Optional for null values</li>
 *   <li>hardcoded Optional instances for demonstration purposes</li>
 * </ul>
 * </p>
 *
 * <p>
 * The class shows how to inspect an Optional using isPresent() and isEmpty(), how to
 * retrieve values with get(), and safer alternatives such as orElse(). It intentionally
 * highlights the runtime hazard that calling get() on an empty Optional will throw a
 * NoSuchElementException, and therefore recommends using orElse, orElseGet, or
 * orElseThrow, and functional accessors like ifPresent or map when appropriate.
 * </p>
 *
 * <p>
 * Best practices illustrated:
 * <ul>
 *   <li>Avoid unguarded Optional.get() calls; prefer orElse/orElseGet/orElseThrow.</li>
 *   <li>Use Optional to make nullable intent explicit rather than relying on raw null checks.</li>
 *   <li>Use functional methods (map, flatMap, filter, ifPresent) to operate safely on values.</li>
 * </ul>
 * </p>
 *
 * @see java.util.Optional
 * @since 1.0

public class OptionalDemo {
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
        // String name4 = null;
        // // System.out.println(name4.length());
        // Optional<String> optionalString2 = Optional.ofNullable(name4);
        // System.out.println(optionalString2.get()); // NoSuchElementException
        // System.out.println(optionalString2.orElse("No name value"));    

        // System.out.println("********** Optional Demo Completed **********");

    }

}
*/


