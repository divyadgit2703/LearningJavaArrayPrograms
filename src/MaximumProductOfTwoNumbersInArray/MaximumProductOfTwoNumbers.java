package MaximumProductOfTwoNumbersInArray;

public class MaximumProductOfTwoNumbers {
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
        int first = array[array.length-1];
        int second = array[array.length-2];

        System.out.println("Maximum Elements "+first+" and "+second);
        System.out.print("Maximum Product "+(first*second));
    }
}
