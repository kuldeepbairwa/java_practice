package OOPs;

public class MethodOverriding {



    public static void main(String[] args) {
        class Vehicle {
            void run(){
                System.out.println("Vehicle is running");
            }


        }
        class Bike extends Vehicle{

            void run(){

                System.out.println("Bike is running");
            }
        }
        class Bicycle extends Bike{
            @Override
            void run(){
                System.out.println("In the bicycle class");
                super.run();
            }

        }

        Bicycle bicycle = new Bicycle();
        bicycle.run();

    }

}
