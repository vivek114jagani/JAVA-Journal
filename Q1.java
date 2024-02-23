// Q1) WAJP to illustrate example of Command line arguments.

public class Q1 {
    public static void main(String[] args) {
        // Check If any arguments are passed.
        if(args.length == 0) {
            System.out.println("No arguments provided.");
        } else {
            // Print out all the arguments passed
            System.out.println("Arguments provided:");
            for(int i = 0; i < args.length; i++) {
                System.out.println((i+1) + ". " + args[i]);
            }
        }
    }
}
