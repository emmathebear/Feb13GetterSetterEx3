public class Auto {
    private String cv, plate, brand, model;

    public Auto(String plate, String brand, String model, String cv) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.cv = cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getCv() {
        return cv;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getPlate() {
        return plate;
    }

    public String toString() {
        return plate + " " + brand + " " + model + " " + cv;

    }


}
