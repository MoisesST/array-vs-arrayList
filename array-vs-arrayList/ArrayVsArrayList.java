import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Create 
        // {
            String[] friendsArray1 = new String[4];
            String[] friendsArray2 = { "John", "Chris", "Eric", "Luke" };
        // } 
        
        // Access element 
        // {
            System.out.println("Access element:");
            System.out.println(friendsArray1[0]); // output: null
            System.out.println(friendsArray2[3]); // output: Luke
            System.out.println(); // Line break
        // }

        // Amount of elements
        // {
            System.out.println("Amount of elements:");
            System.out.println(friendsArray1.length); // output 4
            System.out.println(friendsArray2.length); // output 4
            System.out.println(); // Line break
        // }

        // Add an element
        // {
            System.out.println("Add an element:");
            friendsArray1[0] = "Mitch";
            System.out.println(friendsArray1[0]); // output Mitch
            System.out.println(friendsArray1.length); // output 4
            System.out.println(); // Line break
        // }

        // Set an element
        // {
            System.out.println("Set an element:");
            System.out.println(friendsArray2[0]); // output John
            friendsArray2[0] = "Carl";
            System.out.println(friendsArray2[0]); // output Carl
            System.out.println(); // Line break
        // }

        // Remove an element
        // {
            System.out.println("Remove an element:");
        // Can't remove elements due to fixed size
            System.out.println(); // Line break
        // }

        // Print
        // {
            System.out.println("Print:");
            System.out.println(friendsArray2); // output: [Ljava.lang.String;@7ad041f3
            System.out.println(); // Line break
        // }

        System.out.println("//////////////////////////////////////////////////////////\n");

        // Create 
        // {
            ArrayList<String> friendsArrayList3 = new ArrayList<>();
            ArrayList<String> friendsArrayList4 = new ArrayList<String>();
            ArrayList<String> friendsArraylist5 = 
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
        // } 

        // Access element
            System.out.println("Access element:");
            // System.out.println(friendsArrayList3.get(0)); // output: Exception
            // System.out.println(friendsArrayList4.get(2)); // output: Exception
            System.out.println(friendsArraylist5.get(0)); // output: John
            System.out.println(); // Line break
        // }

        // Amount of elements 
        // {
            System.out.println("Amount of elements:");
            System.out.println(friendsArrayList3.size()); // output: 0
            System.out.println(friendsArrayList4.size()); // output: 0
            System.out.println(friendsArraylist5.size()); // output: 4
            System.out.println(); // Line break
        // }

        // Add an element
        // {
            System.out.println("Add an element:");
            friendsArrayList3.add("Mitch");
            System.out.println(friendsArrayList3.get(0)); // output: Mitch
            System.out.println(friendsArrayList3.size()); // output: 1
            System.out.println(); // Line break
        // }

        // Set an element
        // {
            System.out.println("Set an element:");
            System.out.println(friendsArraylist5.get(0)); // output: John
            friendsArraylist5.set(0, "Carl");
            System.out.println(friendsArraylist5.get(0)); // output: Carl
            System.out.println(); // Line break
        // }

        // Remove an element
        // {
            System.out.println("Remove an element:");
            System.out.println(friendsArraylist5); // output: [Carl, Chris, Eric, Luke]
            friendsArraylist5.remove("Carl"); // object
            System.out.println(friendsArraylist5); // output: [Chris, Eric, Luke]

            friendsArraylist5.remove(2); // index
            System.out.println(friendsArraylist5); // output: [Chris, Eric]
            System.out.println(); // Line break
        // }

        // Print
        // {
            System.out.println("Print:");
            System.out.println(friendsArraylist5); // output: [Chris, Eric]
        // }
    }
}