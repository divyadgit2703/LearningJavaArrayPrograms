package DuplicateElementsInArrayList;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(5);
        list.add(10);
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
