package composition;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeScreenResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeScreenResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeScreenResolution = nativeScreenResolution;
    }

    public void drawPixelAt(int x, int y, String Color) {
        System.out.println("Drawing pixel at " + x + " ," + y + " in colour " + Color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeScreenResolution() {
        return nativeScreenResolution;
    }
}
