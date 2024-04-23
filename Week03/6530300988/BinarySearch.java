import java.util.*;

/**
 * writen : Phuriphat  Nokkhumthong
 * ID : 6530300988
 */
public class BinarySearch {
        public static int binarySearch(int[] lst , int v) {
            int i = 0;
            int j = lst.length;
            while(i<j)
            {
                int mid = (i + j)/2;
                if(v < lst[mid])
                {
                    j = mid;
                } else if(v > lst[mid])
                {
                    i = mid + 1;
                }else
                {
                    return mid ;
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        int[]  array = new int[]{1 , 2 , 4 , 5 , 7 , 8 , 11 , 13};
        int[]  num  = new int[]{5 , 13 , 10};

        for(int i = 0 ; i < num.length ; i++)
        {
            int Result = binarySearch(array,num[i]);
            System.out.println("Find : " + num[i]); 
            if(Result == -1)
            {
                System.out.println("This number is not found\n");
            }else
            {
                System.out.println("Found the number at Idex : " + Result + "\n");
            }
        }
    }
}