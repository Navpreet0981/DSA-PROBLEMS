package INTERVIEW_150;

import java.util.*;

public class P12 {
//    Implement different operation on a list
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

    /*
    Example 1:

Input
["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
[[], [1], [2], [2], [], [1], [2], []]
Output
[null, true, false, true, 2, true, false, 2]

Explanation
RandomizedSet r= new RandomizedSet();
r.insert(1); // Inserts 1 to the set, Returns true as 1 was inserted successfully.
r.remove(2); // Returns false as 2 does not exist in the set.
r.insert(2); // Inserts 2 to the set, returns true.
Set now contains [1,2].
r.getRandom(); // getRandom() should return either 1 or 2 randomly.
r.remove(1); // Removes 1 from the set, returns true.
Set now contains [2].
r.insert(2); // 2 was already in the set, so return false.
r.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
     */
}
