package com.vetias.workshop.basics;

import com.java.workshop.basics.WordCount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountTest {

   @Test
   public void testWordCount(){
    WordCount wordCount = new WordCount();
    int count = wordCount.count("this is the first prg to test");
    assertEquals(7, count);
   }

   @Test
   public void testWordCountWithEmptyString(){
    WordCount wordCount = new WordCount();
    int count = wordCount.count("hello guys welcome to the java workshop");
    assertEquals(7, count);
   }
}