import java.util.ArrayList;
import java.util.Scanner;
public class VehicleManagement {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Display a list of vehicle details");
            System.out.println("3. Delete a vehicle");
            System.out.println("4. Sort vehicle list by age");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // add vehicle here
                    System.out.print("Enter registration number: ");
                        String regNo = scanner.nextLine();
                    
                    System.out.print("Enter make: ");
                        String make = scanner.nextLine();
                    
                    System.out.print("Enter year of manufacture: ");
                        int yearOfManufacture = scanner.nextInt();
                    
                    System.out.print("Enter value: ");
                        double value = scanner.nextDouble();
                    scanner.nextLine(); 
                    
                    Vehicle newVehicle = new Vehicle(regNo, make, yearOfManufacture, value);
                    vehicleList.add(newVehicle);
                    System.out.println("Vehicle added successfully!");
                    
                    break;
                case 2:
                    // display vehicle list here
                    System.out.println("List of vehicle details:");
                    for (Vehicle vehicle : vehicleList) {
                        System.out.println(vehicle);
                    }
                    
                    break;
                case 3:
                    // delete vehicle
                    System.out.print("Enter index of the vehicle to delete: ");
                    int indexToDelete = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (indexToDelete >= 0 && indexToDelete <= vehicleList.size()) {
                        vehicleList.remove(indexToDelete - 1);
                        System.out.println("Vehicle deleted successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    
                    break;
                case 4:
                    // sort vehicle list by age
                    System.out.println("\nSort vehicle list:");
                    System.out.println("1. Sort by age (ascending)");
                    System.out.println("2. Sort by age (descending)");
                    System.out.println("3. Return to main menu");
                    System.out.print("Enter your choice: ");
                    int sortChoice = scanner.nextInt();
                    scanner.nextLine();

                      switch (sortChoice) {
                          case 1:
                              vehicleList.sort((v1, v2) -> v1.getYearOfManufacture() - v2.getYearOfManufacture());
                              System.out.println("List of vehicle details sorted by age (ascending): ");
                              for (Vehicle vehicle : vehicleList) {
                        
                                    System.out.println(vehicle);
                              }

                              break;
                          case 2:
                              vehicleList.sort((v1, v2) -> v2.getYearOfManufacture() - v1.getYearOfManufacture());
                              System.out.println("List of vehicle details sorted by age (descending): ");
                              for (Vehicle vehicle : vehicleList) {
                        
                                    System.out.println(vehicle);
                              }
                              break;
                          case 3:
                              System.out.println("Returning to main menu...");
                              break;
                          default:
                              System.out.println("Invalid choice. Please try again.");
          }
                    break;
                
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

}