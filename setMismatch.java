import java.util.*;
public class setMismatch
{
     public static void main(String args[])
    {
        int[] arr = {2,1,4,2};
        System.out.println(Arrays.toString(arrayMismatch(arr)));
    }
    public static int[] arrayMismatch(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else
                i++;
        }
        for(int index = 0; index<arr.length; index++)
        {
            if(arr[index] != index + 1)
                return new int[] {arr[index], index + 1};
        }
        return new int[] {-1, -1};
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
