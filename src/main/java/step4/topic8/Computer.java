package step4.topic8;

public class Computer {
    private String brand = "";
    private String model = "";
    private int ram;

    public Computer(String brand, String model, int ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
    }
    public void displaySpecs(){
        System.out.println(brand+ " " + model + " " + ram);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
