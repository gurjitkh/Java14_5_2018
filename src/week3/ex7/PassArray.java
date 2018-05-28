package week3.ex7;

public class PassArray {
    public static void main(String[] args) {
        //array creation
        int[] myArray = {1,2,3,4,5};
        int[] array2 = myArray;
        //provide feedback to the user

        System.out.printf(" Effects of passing the reference to entire Array: %n"
        +"The values of the original array %n%n");

        //itreate through the array
        //tradional
        /*
        for (int i =0; i<myArray.length ;i++){
            System.out.printf("%d%n",myArray[i]);
        }
        */

        //ENHANCED FOR LOOP
        for (int val: myArray){
            System.out.printf("%d",val);
        }

        //modifyElemtnt
        modifyElement(2);

    }

    public static void modifyArray(int [] array2){
        //multiply each element by 2

        for (int val: array2){
            val *=2;
           // System.out.printf("%d",val);
        }
    }

    public static void modifyElement(int element){
        element *= 2;
        System.out.printf("Value of element in modifyElement %d",element);
    }
}
