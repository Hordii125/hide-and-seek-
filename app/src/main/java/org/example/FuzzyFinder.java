package org.example;

import java.util.ArrayList;


public class FuzzyFinder {
    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        int count = 0;
        for (Fuzzy fuzzy : fuzzies) {
            if (fuzzy.color.equals("gold")) {
                count++;
            }
        }
        return count;
    }

    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int count = 0;
        int left = 0;
        int right = fuzzies.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (fuzzies.get(mid).color.equals("gold")) {
                count++;
                //check left side
                int temp = mid - 1;
                while (temp >= left && fuzzies.get(temp).color.equals("gold")) {
                    count++;
                    temp--;
                }
                //check right side
                temp = mid + 1;
                while (temp <= right && fuzzies.get(temp).color.equals("gold")) {
                    count++;
                    temp++;
                }
                break; //found at least one "gold", exit loop
            } else if (fuzzies.get(mid).color.compareTo("gold") < 0) { //"gold" is greater, search right side
                left = mid + 1;
            } else { //"gold" is less, search left side
                right = mid - 1;
            }
        }
        return count;
    }
}
