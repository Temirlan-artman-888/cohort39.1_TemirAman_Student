package HomeWork30;

import java.util.*;

public class HomeWork30 {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("apple", "red");
        stringMap.put("banana", "yellow");
        stringMap.put("banana", "yellow");
        stringMap.put("pearl", null);
        stringMap.put("pear", null);

        System.out.println("\nOriginal values are : ");
        displayAllValues(stringMap);

        catchDuplicateValues(stringMap);

        System.out.println("\nUnique values are : ");
        displayAllValues(stringMap);

    }

    public static void catchDuplicateValues(Map<String, String> map) {
        // Here we create a set to store unique values
        Set<String> uniqueValues = new HashSet<>();

        // This list for storing duplicate values;
        List<String> keysToRemove = new ArrayList<>();

        boolean nullValueEncountered = false;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String stringMapValue = entry.getValue();
            if (stringMapValue == null) {
                if (nullValueEncountered) {
                    keysToRemove.add(entry.getKey());
                } else {
                    nullValueEncountered = true;
                }
            } else {
                if (uniqueValues.contains(stringMapValue)) {
                    keysToRemove.add(entry.getKey());
                } else {
                    uniqueValues.add(stringMapValue);
                }
            }

            for (String key : keysToRemove) {
                map.remove(key);
            }

        }
    }

    public static void displayAllValues(Map<String, String> map){
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}