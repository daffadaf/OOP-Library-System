import java.time.LocalDate;

public class Order {
    private int id;
    private int publicationId;
    private String borrower;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private OrderStatus status;

    public Order(int id, int publicationId, String borrower, LocalDate borrowDate, LocalDate dueDate, OrderStatus status) {
        this.id = id;
        this.publicationId = publicationId;
        this.borrower = borrower;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(int publicationId) {
        this.publicationId = publicationId;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        if (borrowDate != null) {
            this.borrowDate = borrowDate;
        } else {
            throw new IllegalArgumentException("Borrow date cannot be null");
        }
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        if (dueDate != null) {
            this.dueDate = dueDate;
        } else {
            throw new IllegalArgumentException("Due date cannot be null");
        }
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Publication ID: " + publicationId + " | Borrower: " + borrower + " | Borrow Date: " + borrowDate + " | Due Date: " + dueDate + " | Status: " + status;
    }
}

enum OrderStatus {
    PENDING,
    COMPLETED,
    CANCELED
}


//20240215