import java.util.*;
public class missingPositive 
{
     public static void main(String args[])
    {
        int[] arr = {7,8,9,0};
        System.out.println(missing(arr));
    }
    public static int missing(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct])
                swap(arr, i, correct);
            else
                i++;
        }
        for(int index = 0; index < arr.length; index++)
            if(arr[index] != index + 1)
                return index + 1;
        return arr.length;
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}   
