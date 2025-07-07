package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class AppTest {
  @Test
  void theTestsWork() {
    assertEquals(true, true);
  }

  @Test
  void testLinearSearch() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();
    
    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    int count = finder.linearSearch(sortedFuzzies);
    
    assertTrue(count == 1, "Linear search should find exactly one 'gold' fuzzy in sorted list");
  }

  @Test
  void testBinarySearch() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();
    
    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    int count = finder.binarySearch(sortedFuzzies);
    
    assertTrue(count == 1, "Binary search should find exactly one 'gold' fuzzy in sorted list");
  }

  @Test
  void testLinearSearchRandom() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();
    
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
    int count = finder.linearSearch(randomFuzzies);
    
    assertTrue(count == 1, "Linear search should find exactly one 'gold' fuzzy in random list");
  }

  @Test
  void testBinarySearchRandom() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();
    
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
    int count = finder.binarySearch(randomFuzzies);
    
    assertTrue(count == 0, "Binary search should find no 'gold' fuzzy in random list");
  }
}
