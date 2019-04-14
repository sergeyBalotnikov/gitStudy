public class Car {
    int carPriceStart;//Цена тачки
    int carPriceSold;//Тачка продана за
    int carNomber;//abbreviated car-body number
    String carBrand;// brend of car
    String carModel;//model of car
    String carColor;//car color
    char transmission;//transmission automatic or manual ('a'/'m')
    boolean isDamaged;//car damage false/true
    boolean carInStock = true;

    public Car(){//simple constructor
        System.out.println("Create car: Nomber="+carNomber+"; Brand="+carBrand+
                "; Model="+carModel+"; price ="+carPriceStart+"; Color="+
                carColor+"; Transmission="+transmission+"; isDamaged="+isDamaged+"; In Stock="+carInStock);
    }
    public Car(int carNomber, int price){
        this.carNomber=carNomber;
        carPriceStart=price;
        System.out.println("Create car: Nomber="+carNomber+"; Brand="+carBrand+
                "; Model="+carModel+"; price ="+carPriceStart+"; Color="+
                carColor+"; Transmission="+transmission+"; isDamaged="+isDamaged+"; In Stock="+carInStock);
    }
    public Car(int nomber, int price, String brand, String model, String color){//difficalt constructor
        carNomber=nomber; carPriceStart = price;
        carBrand=brand; carModel=model; carColor=color;
        System.out.println("New car created. nomber is "+carNomber+", price = "+carPriceStart+", brand is "+carBrand+ ", " +
                "model "+carModel+", color - "+carColor+".");
    }
    public Car(int nomber, boolean damage, int price){//constructor for damaged car
        carPriceStart=price;
        carNomber=nomber;
        isDamaged=damage;
        carColor = "red";
        System.out.println("АЛЯРМА!!! damaged car added. quickly to sold!!!");
    }


        public void damageCar(){//car get damage
            isDamaged=true;
        }
        public void damage() {//is car damaged?
            System.out.println("Car has damage = "+isDamaged);
        }
        public void rePainting(String newColor){//repainting color
            carColor = newColor;
        }
        public void sold(int carPriceSold){
        this.carPriceSold = carPriceSold;
        carInStock = false;
        }
        public void inStock(){
            System.out.println("stock availability = "+carInStock);
        }
        public void carInfo(){//type car information
            System.out.println("car: Nomber="+carNomber+"; Brand="+carBrand+"; Model="+carModel+"; Color=" +
                    carColor+"; Transmission="+transmission+"; isDamaged="+isDamaged+"; In Stock="+carInStock);
        }
        public int benefit(){
        int benefit = carPriceSold-carPriceStart;
        return benefit;
        }
        public void soldCarInfo(){
            if (carPriceSold!=0){
            System.out.println("car: Nomber="+carNomber+"; Brand="+carBrand+"; Model="+carModel+"; benefit="+this.benefit()+
                    "; in stock="+carInStock);}
            else {
                System.out.println("cars not yet sold");
            }
        }


}
