public class Hellohanusha {
    public static void main(String[] args) {
        // Check if the user actually typed any names
        if (args.length > 0) {
            // Loop through every name in the 'args' array
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        } else {
            // Default message if no names are provided
            System.out.println("Hello, World!");
        }
    }
}