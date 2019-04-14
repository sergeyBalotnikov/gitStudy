public class Main {
    public static void main(String[] args){
        Person man = new Person("Sergey");
        System.out.println(man.age);
        System.out.println(man.santimetre);
        man.grow();
        System.out.println(man.santimetre);
        Person woman = new Person();
        System.out.println(woman.santimetre);
        System.out.println(man.isAlive);
        man.name = "Sergey";
        System.out.println("name = " +man.name);
        System.out.println(man.cells + 1);

    }
}
