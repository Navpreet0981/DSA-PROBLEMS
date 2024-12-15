package INTERVIEW_150;

import java.util.*;

public class P12 {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random random;

    public P12() {
         map= new HashMap<>();
         list = new ArrayList<>();
         random = new Random();

    }

    public boolean insert(int val) {
        if (map.containsKey(val)){
            return false;
        }
        else {
            map.put(val, list.size());
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        list.set(index, lastElement);
        map.put(lastElement, index);

        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}
