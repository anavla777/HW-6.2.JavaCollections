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
    public String getGpuModel(int model) {
        return gpuModels.get(model);
    }
    public void getGpuModels() {
        System.out.println(gpuModels);
    }
}
