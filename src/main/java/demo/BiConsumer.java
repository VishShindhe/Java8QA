package demo;
import java.util.HashMap;
import java.util.Map;

public class BiConsumer {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"IronMan");
        map.put(2,"SpiderMan");
        map.put(3,"Hulk");

        //Using Entryset
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() +" : " + entry.getValue());
        }

        //Using keySet
        for(Integer key:map.keySet()){
            System.out.println(key +" : " +map.get(key));
        }
        //Using Lambda
        map.forEach((k,v) -> System.out.println(k+ " : "+v));

        //OR we can use Lambda with KeySet/EntrySet
        map.keySet().forEach(k-> System.out.println(k+" : "+map.get(k)));
    }
}
