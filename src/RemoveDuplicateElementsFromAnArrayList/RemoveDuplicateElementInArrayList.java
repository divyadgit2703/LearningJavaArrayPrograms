package RemoveDuplicateElementsFromAnArrayList;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(5);
        list.add(10);
//        List<Integer> newArrayList = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }

}
