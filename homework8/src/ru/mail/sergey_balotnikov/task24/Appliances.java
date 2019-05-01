package ru.mail.sergey_balotnikov.task24;

 public abstract class Appliances {
    private boolean status;
    private String description;
    private int price;



    public String getDescription() {
        return description;
    }

     public boolean getStatus() {
         return status;
     }
     public String getStatus(boolean plugUnplag) {
         String s = "";
         if(plugUnplag == true){s = "on";} else {s = "off";}
         return s;
     }

     public int getPrice() {
        return price;
    }

     public void setStatus(boolean status) {
         this.status = status;
     }

     public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return getDescription() +" is " + getStatus(getStatus());
    }
}

