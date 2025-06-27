import java.util.Scanner;

public class p3 {
    public static void main(String[] args) 
    {
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
        
        // Input the pivot index
        System.out.print("Enter pivot index: ");
        int a = sc.nextInt();
        
        
        int[] pdata = new int[s];
        int index = 0;
        for (int i = 0; i < data.length; i++) 
        {
            if (i >= a) {
                // Store the pivot in pdata
                pdata[index] = data[i];
                index++;
            }
        }

        for(int i = 0; i < data.length; i++){
            if (i < a) {
                // Store the pivot in pdata
                pdata[index] = data[i];
                index++;
            }
        }


        // Input the target number to find
        System.out.print("Enter num which you find: ");
        int n = sc.nextInt();
        
        // Search for the target number in pdata
        boolean found = false;
        for (int i = 0; i < pdata.length; i++) {
            if (pdata[i] == n) {
                System.out.println("Match found at index " + i);
                found = true;
                break;
            }
        }
        
        // If no match found, print -1
        if (!found) {
            System.out.println("-1");
        }
    }
}
