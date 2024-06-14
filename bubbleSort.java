import java.util.*;
public class bubbleSort
{
    public static void main(String args[])
    {
        int[] arr = {2, 1, 4, 3, 6, 5};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
    public static int[] sortArray(int[] arr)
        {
        boolean swapped;
        for(int i = 0; i < arr.length; i++)
        {
            swapped = false;
            for(int j = 1; j < arr.length - i; j++)
            {
                if(arr[j] < arr[j - 1])
                {
                    // swap
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return arr;
    }
}
