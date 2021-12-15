public class Vehicle {
    public double load;
    public double maxload;
    public Vehicle(double max_load){
        this.maxload = max_load;
    }
    public double getLoad(){
        return newtsToKilo(load);
    }

    private double kiloToNewts(double weight) {
        return (weight * 9.8);
    }
    private double newtsToKilo(double weight) {
        return (weight / 9.8);
    }
    public double getMaxload(){
        return kiloToNewts(maxload);
    }
    public boolean addBox(double weight) {
        this.load += kiloToNewts(weight);
        if (load > getMaxload()) {
            this.load -= kiloToNewts(weight);
            return false;
        }
        else return true;
    }
}
