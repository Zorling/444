
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();


}
    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "кот", "лампа", "фонарь",
                "бессмысленный", "и", "тусклый",
                "кот", "лампа", "фонарь",
                "бессмысленный", "и", "тусклый",
                "кот"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Вася", "8999123321");
        directory.add("Костя", "8912155326");
        directory.add("Петя", "8917155552");
        directory.add("Коля", "8913455672");
        directory.add("Петя", "899999999");
        directory.add("Игорь", "899111111");
        directory.add("Вася", "89923231999");
        directory.add("Степан", "8888123113");
        directory.add("Игорь", "8324325234");

        System.out.println(directory.get("Вася"));
        System.out.println(directory.get("Степан"));
        System.out.println(directory.get("Игорь"));
        System.out.println(directory.get("Петя"));
    }


}
