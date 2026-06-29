class Vehicle {

    public double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Car {

    @Override
    public double fuelCost(int km) {
        return km * 2;
    }
}

public class transportCompany {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        int km = 10;

        for (Vehicle v : fleet) {

            System.out.println("Fuel Cost = " + v.fuelCost(km));

            if (v instanceof Car) {
                System.out.println("This is a Car.");
            }

            if (v instanceof Bus) {
                System.out.println("This is a Bus.");
            }

            if (v instanceof Bike) {
                System.out.println("This is a Bike.");
            }

            if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("This is an Electric Car.");
            }

            System.out.println("-----------------------");
        }
    }
}