package composition;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimesnsions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimesnsions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimesnsions = dimesnsions;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimesnsions() {
        return dimesnsions;
    }
}
