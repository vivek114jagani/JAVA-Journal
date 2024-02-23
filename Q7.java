// Q7) You are given a sting str =”SDJ International College”. Perform the following operation on it.
//         Find the length of string
//         Replace the character ‘e’ by ‘E’
//         convert all character in uppercase

public class Q7 {
    public static void main(String[] args) {
        String str = "SDJ International College";

        // Find the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Replace 'e' with 'E'
        String replacedStr = str.replace('e', 'E');
        System.out.println("String after replacing 'e' with 'E': " + replacedStr);

        // Convert all characters to uppercase
        String uppercaseStr = str.toUpperCase();
        System.out.println("String in uppercase: " + uppercaseStr);
    }
}
