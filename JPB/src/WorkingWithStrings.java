public class WorkingWithStrings {
    public static void main(String[] args) {
        String greeting = "Hello, World!";

        String message = new String("Welcome to Java Programming!");

        System.out.println(greeting);
        System.out.println(message);

        int lengthOfGreeting = greeting.length();
        System.out.println("Length of greeting: " + lengthOfGreeting);

        char firstChar = greeting.charAt(0);
        System.out.println("First character of greeting: " + firstChar);

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);

        String anotherFullname = String.format("%s %s", firstName, lastName);
        System.out.println("Another full name: " + anotherFullname);

        String anotherFullname2 = firstName.concat(" ").concat(lastName);
        System.out.println("Another full name 2: " + anotherFullname2);

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        System.out.println("str1 equals str2: " + isEqual1);
        System.out.println("str1 equals str3: " + isEqual2);

        String phrase = "Java Programming";

        boolean containsJava = phrase.contains("Java");
        boolean containsPython = phrase.contains("Python");
        System.out.println("Phrase contains 'Java': " + containsJava);
        System.out.println("Phrase contains 'Python': " + containsPython);

        String subString = phrase.substring(5, 16);
        System.out.println("Substring of phrase: " + subString);

        String csv = "John,Doe,30,Engineer";
        String[] parts = csv.split(",");
        System.out.println("CSV parts:");
        for (String part : parts) {
            System.out.println(part);   
        }

        String[] colors = {"Red", "Green", "Blue"};
        String joinedColors = String.join(", ", colors);
        System.out.println("Joined colors: " + joinedColors);

        String lowerCasePhrase = phrase.toLowerCase();
        String upperCasePhrase = phrase.toUpperCase();
        System.out.println("Lower case phrase: " + lowerCasePhrase);
        System.out.println("Upper case phrase: " + upperCasePhrase);

        // trim 
        String paddedString = "   Hello, World!   ";
        String trimmedString = paddedString.trim();
        System.out.println("Padded string: '" + paddedString + "'");
        System.out.println("Trimmed string: '" + trimmedString + "'");

        //replace
        String originalString = "I like Java programming.";
        String replacedString = originalString.replace("Java", "Python");
        System.out.println("Original string: " + originalString);
        System.out.println("Replaced string: " + replacedString);

        
    }
}
