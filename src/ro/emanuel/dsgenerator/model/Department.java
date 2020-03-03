package ro.emanuel.dsgenerator.model;

public class Department {
    private String specializare;
    private int an;

    public Department() {
    }

    public Department(String specializare, int an) {
        this.specializare = specializare;
        this.an = an;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }
}
