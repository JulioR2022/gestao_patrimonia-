package interprises;

public class Patrimony {
    private String name;
    private double value;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    public Patrimony(){
        
    }

    public Patrimony(String name) {
        setName(name);
    }

    public Patrimony(String name, double value) {
        this.setName(name);
        this.setValue(value);
    }
}
