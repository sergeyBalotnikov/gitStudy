package my.auto;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.driveForward();
        car1.driveForward();
        car1.driveForward();
        car1.driveForward();
        car1.driveBackward();
        car1.driveBackward();

        int i = 13%4;
        System.out.println("i="+1);
        boolean b1 = !true;
        System.out.println("b1 = "+b1);
        boolean b2 = car1 instanceof Car;
        System.out.println("b2 = "+b2);
        System.out.println(15==10);
        String s1 = "s1";
        String s2 = "s1";
        System.out.println("s1==s2"+(s1==s2));
        System.out.println("s1.equals(s2)"+(s1.equals(s2)));


    }
}
