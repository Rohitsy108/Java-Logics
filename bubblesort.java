// --------------------This is a program of bubblesort it will sort the arrays------------------

import java.util.Arrays;

public class bubblesort 
{
    public static void main(String[] args) 
    {
        int a [] = {9,8,7,6,5,4,3,2,1};

        System.out.println("Before sorting the array :" + Arrays.toString(a));
        int b = a.length;

        for (int i=0; i<b; i++)
        {
            for(int j=0; j<b-1; j++)
            {
                if(a[j]>a[j+1])
                {
                int c = a[j];
                a[j] = a[j+1];
                a[j+1] = c;
                }
            }
        }
        System.out.println("After sorting the array : " + Arrays.toString(a));
    }
}
