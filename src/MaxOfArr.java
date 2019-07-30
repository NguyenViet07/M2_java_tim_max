import java.util.Scanner;

public class MaxOfArr {
    public static void main(String[] args) {
        int size;
        int [] Arr ;
        Scanner input = new Scanner(System.in);
        do {
            System.out.printf("enter size of arr: ");
            size = input.nextInt();
            if (size>10){
                System.out.println("Size should not exceed 10");
            }
        }while (size>10);

        Arr = new int[size];
        int i = 0;
        while (i<Arr.length){
            System.out.print("Enter element: ");
            Arr[i] = input.nextInt();
            i++;
        }
        System.out.printf("Lit of my arr: ");
        for (int j =0; j<Arr.length; j++){
            System.out.printf(Arr[j]+"\t");
        }
        int maxArr = Arr[0];
        int index = 0;
        for (int j=0;j<Arr.length;j++ ){
            if (maxArr<Arr[j]){
                maxArr = Arr[j];
                index = j+1;
            }
        }
        System.out.print("Max of my arr is: " + maxArr + "at position: " +index);
    }
}
