package PrintArrayElementsWhichAppearTwiceOrMore;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementsWhichAppearTwiceOrMore {
    public static void main(String[] args) {
        int[] array ={1,1,2,3,4,5,6,7,7,8,8,8};
        Map<Integer,Integer> dupMap = new HashMap<>();
        for(int num:array )
        {
            if(dupMap.containsKey(num))
            {
                dupMap.put(num,dupMap.get(num)+1);
            }
            else
            {
                dupMap.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:dupMap.entrySet())
        {
            if(entry.getValue()>=2)
                System.out.println(entry.getKey());
        }
        }
    }

