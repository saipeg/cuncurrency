package com.epam.lesson1;

public class ProcessorCounter {
    public static void main(String[] args) {
        int processorCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processors: " + processorCount);
    }
}
