import java.util.*;
public class insertionSort
{
    public static void main(String args[])
    {
        int[] arr = {5,1,4,3,2,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i + 1; j > 0; j--)
            {
                if(arr[j]<arr[j - 1])
                    swap(arr, j, j - 1);
                else
                    break;
            }
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
