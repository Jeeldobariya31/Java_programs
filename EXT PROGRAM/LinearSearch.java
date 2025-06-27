import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter total elements: ");
        int s = sc.nextInt();

        int[] data = new int[s];
        
        // Input the elements of the array
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter element no " + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        // Input the number to search for
        System.out.print("Enter number to search: ");
        int n = sc.nextInt();

        boolean isFound = false;

        // Perform the linear search
        for (int i = 0; i < data.length; i++) {
            if (data[i] == n) {
                System.out.println("Match found at index " + i);
                isFound = true;

                // Prompt the user to continue searching
                System.out.println("Do you want to continue searching?");
                System.out.println("Enter 1 to continue or any other key to end:");
                int temp = sc.nextInt();

                if (temp != 1) {
                    break; // Exit the loop if user does not want to continue
                }
            }
        }

        // If no match was found
        if (!isFound) {
            System.out.println("Not found");
        }
    }
}
