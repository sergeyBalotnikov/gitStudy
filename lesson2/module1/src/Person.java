public class Person {
char sex = 'm';
String name;
long cells = 100_000_000;
byte age = 127;
int santimetre = 60;
boolean isAlive;
public Person(){
    isAlive = true;
    System.out.println("Call person");
}
public Person(String nameName){
    this();
    name = nameName;
    System.out.println("call person name");

}
public void grow(){
    santimetre += 5;
}
}

