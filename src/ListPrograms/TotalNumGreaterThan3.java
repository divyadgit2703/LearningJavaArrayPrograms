package ListPrograms;

import java.util.*;

public class TotalNumGreaterThan3 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int input=sc.nextInt();
            if(input==0)break;
            else
            {
                num.add(input);
            }
        }
        System.out.println(num);
        Iterator<Integer> list=num.iterator() ;
        int count=0;
        while(list.hasNext())
        {
            int current = list.next();
            if(current >3)
            {
                count=count+current;
            }
        }

        System.out.println(count);

    }
}
