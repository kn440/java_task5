package Java_base;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class HW5_1__Stepanova {
     
       
       public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivan", 1111, bookPhone);
        addNumber("Ivan", 22222, bookPhone);
        addNumber("Ivan", 33333, bookPhone);
        addNumber("Petr", 121212, bookPhone);
        addNumber("Anton", 500000, bookPhone);
        addNumber("Ivan", 444444, bookPhone);
        addNumber("petr", 787897, bookPhone);
        printBook(bookPhone);
       }
}
