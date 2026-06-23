class Package{
    private String trackingID;
    private double weight;

    public Package(String trackingID, double weight){
        this.trackingID = trackingID;
        

        if (weight > 0){
            this.weight = weight;
        } else {
            System.out.println("Invalid weight!");
            this.weight = 1.0;
        }
    }
    public String getTrackingID(){
        return trackingID;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        if (weight <= 0){
            System.out.println("Invalid weight!");
            return;
        } 
        this.weight = weight;
    }

}
class ExpressPackage extends Package {

    private String priorityLevel;

    public ExpressPackage(String trackingId,
                          double weight,
                          String priorityLevel) {

        super(trackingId, weight);
        this.priorityLevel = priorityLevel;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void printShippingLabel() {

        System.out.println("===== SHIPPING LABEL =====");
        System.out.println("Tracking ID : " + getTrackingID());
        System.out.println("Weight      : " + getWeight() + " kg");
        System.out.println("Priority    : " + priorityLevel);
        System.out.println("==========================");
    }
}
public class Main {

    public static void main(String[] args) {

        ExpressPackage pkg =
                new ExpressPackage(
                        "EXP101",
                        2.5,
                        "Critical");

        pkg.printShippingLabel();

        pkg.setWeight(-1.5);

        System.out.println("Current Weight: "
                + pkg.getWeight());

        pkg.setWeight(0.0);

        System.out.println("Current Weight: "
                + pkg.getWeight());
    }
}
