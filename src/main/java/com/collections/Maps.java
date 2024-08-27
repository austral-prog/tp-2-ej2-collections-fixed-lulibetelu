package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        // todo: Implement the logic to create a map that tracks the count of each item in the list
        Map<String, Integer> inventory = new HashMap<>();
        for (String element : items) {
            int count = inventory.getOrDefault(element, 0);
            inventory.put(element, count + 1);
        }

        return inventory;
    }


    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        // todo: Implement the logic to add or increment items in the inventory using elements from the items list
        for (String element: items){
            if (inventory.containsKey(element)){
                inventory.put(element, inventory.get(element) + 1);
            }
            else {
                inventory.put(element, 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        // todo: Implement the logic to decrement items in the inventory using elements from the items list
        for (String element: items){
            int count = inventory.getOrDefault(element, 0);
            if (count == 0){
                inventory.put(element, count);
            }
            else{
                inventory.put(element, count - 1);
            }

        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        // todo: Implement the logic to remove an item from the inventory if it matches the item string
        for (Map.Entry<String, Integer> entry: inventory.entrySet()){
            if (inventory.containsKey(item)){
                inventory.remove(item);
            }
        }
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        // todo: Implement the logic to create a list containing all (item_name, item_count) pairs in the inventory
        List<Map.Entry<String, Integer>> tuplas = new ArrayList<>();
        for (Map.Entry<String, Integer> tupla: inventory.entrySet()){
            if (tupla.getValue() != 0){
                tuplas.add(tupla.getKey(), tupla.getValue());

            }
        }
        return tuplas;
    }
}