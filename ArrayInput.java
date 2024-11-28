import java.util.Scanner;
//1. Get array input
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("You entered the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Enter the number of inputs:
// 3
// Enter 3 numbers:
// 10
// 20
// 30

import java.util.Scanner;

public class MultipleArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of arrays:");
        int m = sc.nextInt();

        int[][] arrays = new int[m][];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the size of array " + (i + 1) + ":");
            int size = sc.nextInt();
            arrays[i] = new int[size];

            System.out.println("Enter " + size + " elements for array " + (i + 1) + ":");
            for (int j = 0; j < size; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }

        System.out.println("You entered the following arrays:");
        for (int i = 0; i < m; i++) {
            for (int num : arrays[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// Enter the number of arrays:
// 2
// Enter the size of array 1:
// 3
// Enter 3 elements for array 1:
// 1 2 3
// Enter the size of array 2:
// 4
// Enter 4 elements for array 2:
// 4 5 6 7




//Getting a list of integers from space-separated input
import java.util.Scanner;

public class ListInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a list of integers (space-separated): ");
        String[] input = sc.nextLine().split(" ");
        int[] listInput = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            listInput[i] = Integer.parseInt(input[i]);
        }
        
        System.out.print("You entered the list: ");
        for (int num : listInput) {
            System.out.print(num + " ");
        }
    }
}








// Getting multiple values in a single line
public class MultipleValuesInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three integers separated by spaces: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("You entered: a = " + a + ", b = " + b + ", c = " + c);
    }
}



// Getting a tuple (array) from input
import java.util.Scanner;

public class TupleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a tuple of integers (space-separated): ");
        String[] input = sc.nextLine().split(" ");
        int[] tuple = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            tuple[i] = Integer.parseInt(input[i]);
        }
        
        System.out.print("You entered the tuple: ");
        for (int num : tuple) {
            System.out.print(num + " ");
        }
    }


    // 8. Getting a dictionary (map) from input
import java.util.HashMap;
import java.util.Scanner;

public class DictionaryInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of key-value pairs for the dictionary: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        HashMap<String, Integer> dictionary = new HashMap<>();
        System.out.println("Enter the key-value pairs (e.g., key value):");
        
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            dictionary.put(key, value);
        }
        
        System.out.println("You entered the dictionary: " + dictionary);
    }
}
