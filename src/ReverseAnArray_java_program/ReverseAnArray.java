package ReverseAnArray_java_program;

//Reverse An array without using extra array
public class ReverseAnArray {
    public static void main(String[] args) {

    int[] array = {4,6,3,1,9};
    int temp;
    for(int i=0,j=array.length-1;i<j;i++,j--)
    {
        temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    for(int i=0;i<array.length;i++)
    {
        System.out.print(array[i]+" ");
    }
    }
}
