package HomeWork8;

import java.util.*;

public class RunnerMap {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Кот", "Боб");
        map.put("Пёс", "Сэм");
        map.put("Жук", "Биб");
        map.put("Гусь", "Жора");
        map.put("Огурец", "Аврентий");
        map.put("Корова", "Кека");
        System.out.println(isUnique(map));

        map.put("Жук","Боб");
        System.out.println(isUnique(map));
    }





    private static boolean isUnique(Map<String,String> map){
        Set<String> mapSet = new HashSet<>();
        for (String value : map.values()) {
            mapSet.add(value);
        }
        if (mapSet.size() == map.values().size()) {
            return true;
        } else return false;
    }

}
