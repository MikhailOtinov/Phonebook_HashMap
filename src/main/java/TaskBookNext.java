import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskBookNext {
    // Метод добавляет номера
    public static void addNumber(String key, long value, Map<String, ArrayList<Long>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Long> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    // Метод для печати контактов
    public static void printBook(Map<String, ArrayList<Long>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (long el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Long>> bookPhone = new HashMap<>();
        addNumber("Вася", 89925777799L, bookPhone);
        addNumber("Вася", 88005522891L, bookPhone);
        addNumber("Петя", 87451872, bookPhone);
        addNumber("Юля", 860852731, bookPhone);
        addNumber("Коля", 875412688, bookPhone);
        addNumber("Юля", 890063392, bookPhone);
        printBook(bookPhone);
    }
}
