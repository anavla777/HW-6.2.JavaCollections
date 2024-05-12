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
        if (model.contains(CPU)) {
            System.out.println(CPU);
        }
   }
   public void printModels() {
        System.out.println(model);
   }
   public void removeCPUModel(String cpu) {
        model.remove(cpu);
        System.out.println("CPU removed: " + cpu);
        System.out.println("Available CPUs: "+ model);
   }
}
