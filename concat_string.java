String firstName = "John";
String lastName = "Doe";

// Using the + operator
String fullName = firstName + " " + lastName;
System.out.println(fullName); // Output: John Doe

// Using the concat() method
String greeting = "Hello";
String message = greeting.concat(" " + fullName);
System.out.println(message); // Output: Hello John Doe
