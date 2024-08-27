package com.collections;

import java.util.List;

public class Lists {
    public static int indexOf(String color, List<String> colors) {
        int i = 0;
        for (String element : colors) {
            if (element == color) {
                return i;

            } else {
                i++;
            }
        }
        return -1;
    }

    public static int indexOfByIndex(String color, List<String> colors, int index) {
        for (int i = index; i < colors.size(); i++) {
            if (color == colors.get(i)) {
                return i;
            }
        }
        return -1;

    }
    public static int indexOfEmpty(List<String> colors){
        for (int i = 0; i < colors.size(); i++){
            if (colors.get(i) == ""){
                return i;
            }
        }
        return -1;
    }
    public static int put(String color, List<String> colors){
        for (int i = 0; i < colors.size(); i++){
            if (colors.get(i) == ""){
                colors.add(i, color);
                return i;
            }
        }
        return -1;

    }
    public static int remove(String color, List<String> colors){
        int count = 0;
        for (int i = 0; i < colors.size(); i ++){
            if (color == colors.get(i)) {
                colors.set(i, "");
                count++;
            }
        }
        return count;
    }
}
