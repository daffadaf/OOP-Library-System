import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final Scanner SCANNER = new Scanner(System.in);

    private Map<Integer, Publication> publications;
    private Map<Integer, Order> orders;

    public Main() {
        this.publications = new HashMap<>();
        this.orders = new HashMap<>();

        // Add sample publications
        addPublication(1, "Java Programming", "John Doe", 2020, "Programming", "TechBooks", 400, "Book");
        addPublication(2, "Machine Learning in Education", "Jane Smith", 2021, "Education", "EduPublish", 350, "Book");
    }

    public void addPublication(int id, String title, String author, int year, String category, String publisher, int pages, String type) {
        if ("Book".equalsIgnoreCase(type)) {
            publications.put(id, new Book(id, title, author, year, category, publisher, pages));
        } else if ("Article".equalsIgnoreCase(type)) {
            // Adjusted to include volume and pages parameters
            publications.put(id, new Article(id, title, author, year, category, "", "", 0, 0, ""));
        }
    }


    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to Ceria Library");
            System.out.println("1. Display Publications");
            System.out.println("2. Add a Publication ");
            System.out.println("3. Make an Order");
            System.out.println("4. Manage Orders");
            System.out.println("5. Exit Program");
            System.out.print("Please enter your choice: ");
            int choice = SCANNER.nextInt();
            SCANNER.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayPublications();
                    break;
                case 2:
                    addPublication();
                    break;
                case 3:
                    makeOrder();
                    break;
                case 4:
                    manageOrders();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void displayPublications() {
        System.out.println("List of Publications:");
        for (Publication publication : publications.values()) {
            System.out.println(publication);
        }
    }

    public void addPublication() {
        System.out.println("Enter the publication ID:");
        int id = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.println("Enter the publication title:");
        String title = SCANNER.nextLine();

        System.out.println("Enter the author's name:");
        String author = SCANNER.nextLine();

        System.out.println("Enter the year of publication:");
        int year = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.println("Enter the publication category:");
        String category = SCANNER.nextLine();

        System.out.println("Enter the type (Book/Article):");
        String type = SCANNER.nextLine();

        if ("Book".equalsIgnoreCase(type)) {
            System.out.println("Enter the publisher's name:");
            String publisher = SCANNER.nextLine();

            System.out.println("Enter the number of pages:");
            int pages = SCANNER.nextInt();
            SCANNER.nextLine();

            addPublication(id, title, author, year, category, publisher, pages, type);
        } else if ("Article".equalsIgnoreCase(type)) {
            System.out.println("Enter the university:");
            String university = SCANNER.nextLine();

            System.out.println("Enter the journal name:");
            String journal = SCANNER.nextLine();

            System.out.println("Enter the volume:");
            int volume = SCANNER.nextInt();
            SCANNER.nextLine();

            addPublication(id, title, author, year, category, "", "", volume, 0, university);
            System.out.println("Article added successfully!");
        }
    }

    public void addPublication(int id, String title, String author, int year, String category, String university, String journal, int volume, int pages, String additionalInfo) {
        publications.put(id, new Article(id, title, author, year, category, university, journal, volume, pages, additionalInfo));
    }


    public void makeOrder() {
        System.out.println("Enter the publication ID you want to order:");
        int id = SCANNER.nextInt();
        SCANNER.nextLine();

        if (publications.containsKey(id)) {
            System.out.println("Enter the borrower's name:");
            String borrower = SCANNER.nextLine();

            System.out.println("Enter the current date (yyyyMMdd):");
            String date = SCANNER.nextLine();
            LocalDate borrowDate = LocalDate.parse(date, DATE_FORMATTER);

            System.out.println("Enter the due date (yyyyMMdd):");
            String due = SCANNER.nextLine();
            LocalDate dueDate = LocalDate.parse(due, DATE_FORMATTER);

            // Adjusted the order of parameters in the Order constructor
            int orderId = orders.size() + 1;
            orders.put(orderId, new Order(orderId, id, borrower, borrowDate, dueDate, OrderStatus.PENDING));
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Invalid publication ID.");
        }
    }


    public void manageOrders() {
        System.out.println("List of Orders:");
        for (Order order : orders.values()) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        Main library = new Main();
        library.run();
    }
}
