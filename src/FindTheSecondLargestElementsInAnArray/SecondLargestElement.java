package FindTheSecondLargestElementsInAnArray;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array ={3,5,8,9,2};
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                if(array[i]<array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.print("Second Largest Element in Array is "+array[array.length-2]);
    }
}
