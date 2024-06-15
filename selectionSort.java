import java.util.*;
public class selectionSort
{
    public static void main(String args[])
    {
        int[] arr = {5,1,4,3,2,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        for(int i =0; i<arr.length; i++)
        {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex, last);
        }
    }
    public static int getMaxIndex(int[] arr, int start, int end)
    {
        int maxIndex = start;
        for(int i = start; i<=end; i++)
        {
            if(arr[maxIndex] < arr[i])
                maxIndex = arr[i];
        }
        return maxIndex;
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
