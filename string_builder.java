public class StringBuilderExample {
    public static void main(String[] args) {
        // Appending
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World!"); // Appending text at the end
        System.out.println(stringBuilder.toString()); // Output: Hello, World!

        // Inserting
        stringBuilder = new StringBuilder("Hello");
        stringBuilder.insert(5, ", World"); // Inserting text at a specific position
        System.out.println(stringBuilder.toString()); // Output: Hello, World

        // Deleting
        stringBuilder = new StringBuilder("Hello, World");
        stringBuilder.delete(5, 13); // Deleting characters
        System.out.println(stringBuilder.toString()); // Output: Hello

        // Replacing
        stringBuilder = new StringBuilder("Hello, World");
        stringBuilder.replace(7, 12, "Java"); // Replacing a portion of the StringBuilder
        System.out.println(stringBuilder.toString()); // Output: Hello, Java

        // Reversing
        stringBuilder = new StringBuilder("Hello");
        stringBuilder.reverse(); // Reversing the StringBuilder
        System.out.println(stringBuilder.toString()); // Output: olleH
    }
}
