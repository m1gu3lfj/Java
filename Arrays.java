package paquete;

public class Arrays {

	public Arrays() {
	}

	public static void main(String[] args) {
        //declares an array of integers
        int[] array;
        //allocates memory for 10 integers
        array = new int[10];
        //initializes array elements
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        
        //displays array items
        for (int i = 0; i < array.length; i++) {
        	System.out.println("array[" + i + "] = " + array[i] );
        }
        
        //shortcut syntax to create and initialize an array
        int[] array2 = { 1, 6, 7, 10, 9, 5, 8, 11, 4, 12 };
        
        //displays array2 items
        for (int i = 0; i < array2.length; i++) {
        	System.out.println("array2[" + i + "] = " + array2[i] );
        }
        
        //Multi-Dimensional Array
        String[][] names = {{"Mr. ", "Mrs. ", "Ms. "},{"Smith", "Jones"}};
        System.out.println(names[0][0] + names[1][0]); // Mr. Smith
        System.out.println(names[0][1] + names[1][1]); // Ms. Jones
        
        //Multi-Dimensional Array Length
        System.out.println("X-Dimension array length = " + names.length);
        System.out.println("Y,[X=0]-Dimension array length = " + names[0].length);
        System.out.println("Y,[X=1]-Dimension array length = " + names[1].length);
        
        //Copying Arrays
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
        
        //Array Manipulations
        char[] copyFrom2 = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};       
        char[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom2, 2, 9);
            
        System.out.println(new String(copyTo2));
        
        //Useful operations provided by methods in the java.util.Arrays class
        int[] a0 = { 1, 6, 7, 10, 9 };
        int[] a1 = { 1, 6, 7, 10, 9 };
        int[] a2 = { 1, 4, 7, 10, 9 };
        int[] a3 = { 1, 2, 8, 6, 10 };
        
        //Comparing two arrays to determine if they are equal or not (the equals method).
        boolean comp1 = java.util.Arrays.equals(a0, a1); //true
        boolean comp2 = java.util.Arrays.equals(a2, a3); //false
        System.out.println("a0=a1 " + comp1);
        System.out.println("a2=a3 " + comp2);
        
        //Filling an array to place a specific value at each index (the fill method).
        java.util.Arrays.fill(a3, 0); //a3 = { 0, 0, 0, 0, 0 };
        for (int i = 0; i < a3.length; i++) {
        	System.out.println("a3[" + i + "] = " + a3[i] );
        }

        //Sorting an array into ascending order.
        java.util.Arrays.sort(a1); //a1 = { 1, 6, 7, 9, 10 };
        for (int i = 0; i < a1.length; i++) {
        	System.out.println("a1[" + i + "] = " + a1[i] );
        }
        
        //Searching an array for a specific value to get the index at which it is placed (the binarySearch method).
        System.out.println(java.util.Arrays.binarySearch(a1, 1)); //0
        System.out.println(java.util.Arrays.binarySearch(a1, 6)); //1
        System.out.println(java.util.Arrays.binarySearch(a1, 7)); //2
        System.out.println(java.util.Arrays.binarySearch(a1, 10)); //4
        System.out.println(java.util.Arrays.binarySearch(a1, 9)); //3
	}
}
