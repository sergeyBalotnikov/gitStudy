package my.auto;

public class Car {

    int mileage = 0;
    boolean isServiseNead;
    int gas = 0;
    public void driveForward(){
        mileage++;
        System.out.println("Mileage = "+mileage);
    }
    public void driveBackward(){
        mileage--;
        System.out.println("Mileage = "+mileage);
    }
    public void checkServise(){
        String message;
        message = isServiseNead ? "Please go to car service": "No need service";
        System.out.println(message);
    }
    public void checkGasTank(){
        System.out.println("Gas: " + gas + " li.");
    }
}
