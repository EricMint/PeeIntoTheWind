package language;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add("test1");
        testList.add("test2");
        testList.stream().forEach(System.out::println);
        testList.stream().forEach(x -> System.out.println(x));
        List<String> linkedList = new LinkedList<>();
        linkedList.add("testLink1");
        linkedList.add("testLink2");
        linkedList.add("testLink3");
        linkedList.add("testLink4");
        linkedList.add("testLink5");
        linkedList.stream().forEach(System.out::println);

        System.out.println(linkedList.get(3));

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> next = entryIterator.next();
            System.out.println("key=" + next.getKey() + "; value=" + next.getValue());
        }
        

    }
}