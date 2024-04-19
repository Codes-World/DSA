import java.util.Scanner;
public class FirstOccurence {

    //firstOccurence() method is used to find the element at first time indexing
    private static int firstOccurence(int[] array, int target){
        int startIndex = 0;
        int endIndex = array.length - 1;

        int result = 0;
        while(startIndex <= endIndex){
            int mid = (startIndex + endIndex)/2;
            if(array[mid] == target){
                result = mid;
                endIndex = mid - 1;
            }
            else if(array[mid] > target){
                endIndex = mid - 1;
            }
            else{
                startIndex = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Getting array size
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        //declare array variable with size
        int[] array = new int[size];

        //Input element in each array
        System.out.print("\nEnter element of the array: ");
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        //Getting target which i want to serach in array
        System.out.print("\nEnter the target value which search in array: ");
        int target = scan.nextInt();

        int result = firstOccurence(array, target);

        System.out.println(target+" is present at "+(result+1)+" index in the array");
    }

}
