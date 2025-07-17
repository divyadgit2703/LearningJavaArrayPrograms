package SecondLargestElementInAnArrayWithoutSorting;

public class SecondLargestElementWithoutSort {
    public static void main(String[] args) {
        int[] array = {3,6,7,8,2};
        int max=0;
        int secondMax=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
                max=array[i];
        }
        for(int j=0;j<array.length;j++)
        {
            if(array[j]>secondMax && array[j]!=max)
                secondMax=array[j];
        }
        System.out.println(secondMax);
    }
}
