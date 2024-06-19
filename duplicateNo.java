import java.util.*;
public class duplicateNo
{
    public static void main(String args[])
    {
        int[] arr = {2,1,4,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i]!=i+1)
            {
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex])
                    swap(arr, i, correctIndex);
                else
                    return arr[i];
            }
            else
                i++;
        }
        return -1;
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
