package MaxAndMinElementsArray_java_program;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int[] array = {4,6,1,1,2,7};
        int temp;
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
            if(array[i]>array[j])
            {
             temp= array[i];
             array[i]=array[j];
             array[j]=temp;
            }
        }}
        System.out.println("Minimum element "+array[0]);
        System.out.println("Minimum element "+array[array.length-1]);

    }

}
