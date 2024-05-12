package com.anavla777;

import java.util.LinkedList;
import java.util.Queue;

public class Stock {
    Queue <String> option;

    public Stock() {
        option = new LinkedList<String>();
    }
    public void addOption(String value) {
        option.add(value);
    }
    public void removeOption(String value) {
        for (String item : option) {
            if (item.equals(value)) {
                option.remove(item);
                System.out.println("Option removed: " + value);
                System.out.println("Available options: "+ option);
            }
        }
    }
    public void getFirstOption() {
        System.out.println(option.peek());
    }
}
