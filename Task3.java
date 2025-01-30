import java.util.*;

class TravelPlanner {
    static class Destination {
        String name;
        Date date;
        double budget;

        Destination(String name, Date date, double budget) {
            this.name = name;
            this.date = date;
            this.budget = budget;
        }

        @Override
        public String toString() {
            return "Destination: " + name + ", Date: " + date + ", Budget: $" + budget;
        }
    }

    private final List<Destination> destinations = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addDestination() {
        System.out.print("Enter destination: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter date (yyyy-mm-dd): ");
        String dateString = scanner.nextLine();
        Date date = java.sql.Date.valueOf(dateString);
        
        System.out.print("Enter budget: ");
        double budget = scanner.nextDouble();
        scanner.nextLine(); 

        destinations.add(new Destination(name, date, budget));
        System.out.println("Destination added successfully!\n");
    }

    public void displayItinerary() {
        if (destinations.isEmpty()) {
            System.out.println("No destinations added yet.");
            return;
        }
        
        System.out.println("Your Travel Itinerary:");
        for (Destination d : destinations) {
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        TravelPlanner planner = new TravelPlanner();
        while (true) {
            System.out.println("\n1. Add Destination\n2. View Itinerary\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = planner.scanner.nextInt();
            planner.scanner.nextLine(); 
            switch (choice) {
                case 1:
                    planner.addDestination();
                    break;
                case 2:
                    planner.displayItinerary();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
