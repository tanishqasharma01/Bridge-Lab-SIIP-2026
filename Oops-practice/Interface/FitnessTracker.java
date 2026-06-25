
interface trackable{
    void logActivity();

    default void resetData(){
        System.out.println("Activity data has been reset.");
    }

}

interface Reportable{
    void generateReport();

}

interface Notifiable{
    void sendAlert();
}

class FitnessDevice implements trackable, Reportable, Notifiable{

    @Override
    public void logActivity(){
        System.out.println("logging daily fitness activity..");
    }

    @Override
    public void generateReport(){
        System.out.println("generating fitness report..");
    }

    @Override
    public void sendAlert(){
        System.out.println("Seding alert..");
    }
}
public class FitnessTracker {
    public static void main(String[] args){
        FitnessDevice device = new FitnessDevice();
        device.logActivity();
        device.generateReport();
        device.sendAlert();

        //callling dafault method
        device .resetData();
    }
    
}
