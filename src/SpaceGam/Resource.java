package SpaceGam;

public abstract class Resource {
    private double amount;
    private double harvestRate;

    public Resource(double amount, double harvestRate) {
        this.amount = amount;
        this.harvestRate = harvestRate;
    }
    public  void harvest(){
        this.amount-=harvestRate;
    }

    public double getAmount() {
        return amount;
    }


}
