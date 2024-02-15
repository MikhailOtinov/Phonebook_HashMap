import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskBookNext {
    // Метод добавляет номера
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    // Метод для печати контактов
    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Вася", 899912563, bookPhone);
        addNumber("Вася", 880022891, bookPhone);
        addNumber("Петя", 87451872, bookPhone);
        addNumber("Юля", 860852731, bookPhone);
        addNumber("Коля", 875412688, bookPhone);
        addNumber("Юля", 890063392, bookPhone);
        printBook(bookPhone);
    }
}
