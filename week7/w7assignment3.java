import java.util.*;

public class W07_P3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // Input array
      //  System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

       // System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Element to remove
    //    System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Removing element and printing result
        System.out.println("Original Array: " + Arrays.toString(array));
        array = removeAll(array, elementToRemove);
        System.out.print("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
    }

static int[] removeAll(int[] arr, int elementToRemove){
  int count = 0;
  for(int i=0; i<arr.length; i++)
    if(arr[i]==elementToRemove)
      count++;
  int new_arr[] = new int[arr.length-count];
  int j = 0;
  for(int i=0; i<arr.length; i++)
    if(arr[i]!=elementToRemove)
      new_arr[j++] = arr[i];
  return new_arr;
  }

}

}
