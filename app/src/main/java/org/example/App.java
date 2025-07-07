package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        int testOne = finder.linearSearch(sortedFuzzies);
        int testTwo = finder.binarySearch(sortedFuzzies);
        int testThree = finder.linearSearch(randomFuzzies);
        int testFour = finder.binarySearch(randomFuzzies);

        System.out.println("When \"gold\" is the found displays 1, otherwise 0");
        System.out.println("Linear Search for sorted list: " + testOne);
        System.out.println("Binary Search for sorted list: " + testTwo);
        System.out.println("Linear Search for random list: " + testThree);
        System.out.println("Binary Search for random list: " + testFour);
  }
}
