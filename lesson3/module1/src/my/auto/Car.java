package my.auto;

public class Car {

    int mileage = 0;
    public void driveForward(){
        mileage++;
        System.out.println("Mileage = "+mileage);
    }
    public void driveBackward(){
        mileage--;
        System.out.println("Mileage = "+mileage);
    }
}
