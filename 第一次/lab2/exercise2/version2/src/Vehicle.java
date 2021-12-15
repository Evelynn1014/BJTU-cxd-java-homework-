public class Vehicle {
    public double load;
    public double maxload;
    public Vehicle(double max_load){
        this.maxload = max_load;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxload(){
        return maxload;
    }
    public boolean addBox(double weight) {
        this.load += weight;
        if (load > getMaxload()) {
            this.load -= weight;
            return false;
        }
        else return true;
    }
}
