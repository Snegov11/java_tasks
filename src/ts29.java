import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class ts29 {


    public static int findIt(int[] a) {
        int odd = 0;
        int num = 0;

        //Инициализируем мап для коллекции - значение : кол повторений
        Map<Integer, Integer> repeat = new HashMap<>();

        //Мапим значения и количество их повторений в массиве
        for (int i: a) {
            int value = repeat.getOrDefault(i,0) + 1;
            repeat.put(i, value);
        }

        //Инициализирауем список и помещаем в него количество повторений от каждого значения из массива, сортируем по возрастанию
        List<Integer> repeatValues = new ArrayList<>(repeat.values());
        Collections.sort(repeatValues);

        //Находим не четное значение количества повторений из списка (заведомо знаем что такое значение только одно)
        for (int i=0; i<repeatValues.size(); i++) {
            if (repeatValues.get(i)%2!=0) {
                num = repeatValues.get(i);
            }
        }

        int finalNum = num;

        //Находим по найденному не четному кол-ву повторений, соответствующее ему значение из мапа
        for (int key: repeat
                .entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), finalNum))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet())){
            odd = key;
        }

        return odd;
    }

    public static void main(String[] args) {
        findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5});
    }
}
