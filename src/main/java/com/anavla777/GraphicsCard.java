package com.anavla777;
import java.util.HashMap;
import java.util.Map;

public class GraphicsCard {
    public Map<Integer, String> gpuModels;
    public GraphicsCard() {
        gpuModels = new HashMap<Integer, String>();
    }
    public void addGpuModel(int model, String name) {
        gpuModels.put(model, name);
    }
    public void removeGpuModel(int model) {
        gpuModels.remove(model);
        System.out.println("Removed gpu model: " + model);
        System.out.println("Available GPU models: " + gpuModels);
    }
    public void getGpuModel(int model) {
        for (Map.Entry<Integer, String> entry : gpuModels.entrySet()) {
            if (entry.getKey() == model) {
                System.out.println("Retrieving gpu model: "+ entry.getValue());
            }
        }
    }
    public void getGpuModels() {
        for (Map.Entry<Integer, String> entry : gpuModels.entrySet()) {
            System.out.println("Retrieving gpu model: " + entry.getKey() + " " + entry.getValue());
        }
    }
}
