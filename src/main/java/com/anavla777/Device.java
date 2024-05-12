package com.anavla777;

import java.util.ArrayList;
import java.util.List;

public class Device {
    private String type;
    public List<String> model;

    public Device(String type) {
        this.type = type;
        this.model = new ArrayList<>();
    }
    public void showModels() {
        System.out.println("Number of devices: " + model.size());
        int i = 0;
        while (i < model.size()) {
            System.out.println(model.get(i));
            i++;
        }
    }
    public void addModel(String value){
        model.add(value);
    }
    public void removeModel(String value){
        for (int i = 0; i < model.size(); i++) {
            if (model.get(i).equals(value)) {
                model.remove(i);
                System.out.println("Device " + i + " has been removed");
            }
        }
    }
    public void findModel(String value){
        for (int i = 0; i < model.size(); i++) {
            if (model.get(i).equals(value)) {
                System.out.println(model.get(i));
            }
        }

    }
}
