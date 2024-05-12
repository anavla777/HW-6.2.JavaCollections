package com.anavla777;


public class Main {

  public static void main(String... args) {
    Device apple = new Device("Smartphone");
    apple.addModel("Iphone 15");
    apple.addModel("Iphone 6");
    apple.showModels();
    apple.findModel("Iphone 15");
    apple.removeModel("Iphone 15");

    GraphicsCard amd = new GraphicsCard();
    amd.addGpuModel(2023,"7900XT");
    amd.addGpuModel(2012,"HD7970");
    amd.getGpuModels();
    amd.removeGpuModel(2023);

    Processor qualcomm = new Processor();
    qualcomm.addCPU("Snapdragon 8 gen 3");
    qualcomm.addCPU("Snapdragon 870");
    qualcomm.findCPUModel("Snapdragon 8 gen 3");
    qualcomm.printModels();
    qualcomm.removeCPUModel("Snapdragon 8 gen 3");

    Stock aapl = new Stock();
    aapl.addOption("AAPL240517C00005000");
    aapl.addOption("AAPL240517P00005000");
    aapl.getFirstOption();
    aapl.removeOption("AAPL240517P00005000");

  }
}
