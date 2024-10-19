import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;

class Car {
    private String make;
    private String model;
    private String licensePlate;
    private boolean isRented;

    public Car(String make, String model, String licensePlate) {
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
        this.isRented = false;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        isRented = true;
    }

    public void returnCar() {
        isRented = false;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + licensePlate + ")";
    }
}

class Customer {
    private String name;
    private String id;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

class ParkingSpot {
    private String spotNumber;
    private boolean isOccupied;
    private Car parkedCar;

    public ParkingSpot(String spotNumber) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void parkCar(Car car) {
        this.parkedCar = car;
        isOccupied = true;
    }

    public Car removeCar() {
        Car temp = parkedCar;
        parkedCar = null;
        isOccupied = false;
        return temp;
    }

    @Override
    public String toString() {
        return spotNumber + (isOccupied ? " (Occupied by " + parkedCar + ")" : " (Available)");
    }
}

class Rental {
    private List<Car> availableCars;
    private List<Car> rentedCars;

    public Rental() {
        availableCars = new ArrayList<>();
        rentedCars = new ArrayList<>();
    }

    public void addCar(Car car) {
        availableCars.add(car);
    }

    public void rentCar(Customer customer, String licensePlate) {
        for (Car car : availableCars) {
            if (car.getLicensePlate().equals(licensePlate) && !car.isRented()) {
                car.rent();
                rentedCars.add(car);
                availableCars.remove(car);
                System.out.println(customer + " rented " + car);
                return;
            }
        }
        System.out.println("Car not available for rent.");
    }

    public void returnCar(String licensePlate) {
        for (Car car : rentedCars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                car.returnCar();
                availableCars.add(car);
                rentedCars.remove(car);
                System.out.println(car + " has been returned.");
                return;
            }
        }
        System.out.println("Car not found in rented list.");
    }

    public void showAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : availableCars) {
            System.out.println(car);
        }
    }

    // Method to get the list of rented cars
    public List<Car> getRentedCars() {
        return rentedCars;
    }
}

class Parking {
    private List<ParkingSpot> spots;

    public Parking(int numberOfSpots) {
        spots = new ArrayList<>();
        for (int i = 1; i <= numberOfSpots; i++) {
            spots.add(new ParkingSpot("Spot " + i));
        }
    }

    public void parkCar(Car car) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied()) {
                spot.parkCar(car);
                System.out.println(car + " parked in " + spot.getSpotNumber());
                return;
            }
        }
        System.out.println("No available parking spots.");
    }

    public void removeCar(String licensePlate) {
        for (ParkingSpot spot : spots) {
            if (spot.isOccupied() && spot.toString().contains(licensePlate)) {
                Car car = spot.removeCar();
                System.out.println(car + " has been removed from " + spot.getSpotNumber());
                return;
            }
        }
        System.out.println("Car not found in any parking spot.");
    }

    public void showParkingStatus() {
        System.out.println("Parking Status:");
        for (ParkingSpot spot : spots) {
            System.out.println(spot);
        }
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        Rental rental = new Rental();
        rental.addCar(new Car("Toyota", "Corolla", "ABC123"));
        rental.addCar(new Car("Honda", "Civic", "XYZ789"));
        rental.addCar(new Car("Ford", "Focus", "LMN456"));

        Parking parking = new Parking(5); // 5 parking spots

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCar Rental System");
            System.out.println("1. Show Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Park a Car");
            System.out.println("5. Remove a Car from Parking");
            System.out.println("6. Show Parking Status");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    rental.showAvailableCars();
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your ID: ");
                    String id = scanner.nextLine();
                    Customer customer = new Customer(name, id);
                    System.out.print("Enter the license plate of the car to rent: ");
                    String licensePlateRent = scanner.nextLine();
                    rental.rentCar(customer, licensePlateRent);
                    break;
                case 3:
                    System.out.print("Enter the license plate of the car to return: ");
                    String licensePlateReturn = scanner.nextLine();
                    rental.returnCar(licensePlateReturn);
                    break;
                case 4:
                    System.out.print("Enter the license plate of the car to park: ");
                    String licensePlatePark = scanner.nextLine();
                    for (Car car : rental.getRentedCars()) {  // Updated line
                        if (car.getLicensePlate().equals(licensePlatePark)) {
                            parking.parkCar(car);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter the license plate of the car to remove from parking: ");
                    String licensePlateRemove = scanner.nextLine();
                    parking.removeCar(licensePlateRemove);
                    break;
                case 6:
                    parking.showParkingStatus();
                    break;
                case 7:
                    System.out.println("Thank you for using the Car Rental System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
}
}
