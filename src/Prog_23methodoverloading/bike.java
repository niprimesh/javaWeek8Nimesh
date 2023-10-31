package Prog_23methodoverloading;
//creating a child class
class Bike extends Vehicle {
    public void run(){
        //defining the same method as in the parent class
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Bike obj = new Bike(); // creating object
        obj.run(); // calling method
    }
}