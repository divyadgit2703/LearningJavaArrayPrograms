package MoveAllZerosTotheEndOfAnArray;

public class MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        int[] array = {0,0,0,0,1,2,3,4};
        int midIndex =array.length/2;
        int result[] = new int[array.length];
        int index=0;
        for(int i=midIndex;i<array.length;i++)
        {
            result[index++]=array[i];
        }
        for(int j=0;j<midIndex;j++)
        {
            result[index++]=array[j];
        }
        for(int k=0;k<array.length;k++)
        {
            System.out.print(result[k]+" ");
        }
    }
}
