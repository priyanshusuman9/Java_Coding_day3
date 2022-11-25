package Day3Problems;


public class Reverse
{
    public static void main(String args[])
    {

        int arr[] = {34, 55, 33, 33, 30};

        int n=arr.length;
        for(int i=n-1; i>=0; i--)
            System.out.print(arr[i]+" ");
    }
}
