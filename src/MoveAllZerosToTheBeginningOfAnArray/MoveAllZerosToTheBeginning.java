package MoveAllZerosToTheBeginningOfAnArray;

public class MoveAllZerosToTheBeginning {
    public static void main(String[] args) {
        int[] array = {2,3,0,4,5,0,9};
        int index=0;
        int[] result = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==0)
                result[index++]=array[i];
        }
        for(int j=0;j<array.length;j++)
        {
            if(array[j]!=0)
                result[index++]=array[j];
        }
        for(int k=0;k<result.length;k++)
        {
            System.out.print(result[k]+" ");
        }
    }
}
