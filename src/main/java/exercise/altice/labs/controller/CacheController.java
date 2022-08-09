package exercise.altice.labs.controller;

import exercise.altice.labs.entity.Cache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CacheController {
    static Deque<Integer> deque = new LinkedList<>();
    static Map<Integer, Cache> map = new HashMap<>();

    int CACHE_SIZE = 10;

    public String getElement(int key) {
        if(map.containsKey(key)) {
            Cache current = map.get(key);

            deque.remove(current.getKey());
            deque.addFirst(current.getKey());

            return current.getValue();
        } else {
            return "Not exist";
        }
    }

    public void putElement(int key, String value) {

        if(map.containsKey(key)) {
            Cache current = map.get(key);
            deque.remove(current.getKey());

        } else if (deque.size() == CACHE_SIZE) {
            int aux = deque.removeLast();
            map.remove(aux);
        }
        Cache newElement = new Cache(key, value);
        deque.addFirst(newElement.getKey());
        map.put(key, newElement);
    }
}
