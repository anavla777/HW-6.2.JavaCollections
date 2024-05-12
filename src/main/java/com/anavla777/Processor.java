package com.anavla777;

import java.util.HashSet;

public class Processor {
    public HashSet<String> model;
    public Processor() {
        model = new HashSet<>();
    }
   public void addCPU(String CPU) {
        model.add(CPU);
   }
   public void findCPUModel (String CPU) {
        for (String model : model) {
            if (model.equals(CPU)) {
                System.out.println(model);
            }
        }
   }
   public void printModels() {
        for (String model : model) {
            System.out.println(model);
        }
   }
   public void removeCPUModel(String cpu) {
        for (String item : model) {
            if (item.equals(cpu)) {
                model.remove(cpu);
                System.out.println("CPU removed: " + cpu);
                System.out.println("Available CPUs: "+ model);
            }
        }
   }
}
