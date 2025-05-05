class Book extends Publication {
    private String publisher;
    private int pages;

    public Book(int id, String title, String author, int year, String category, String publisher, int pages) {
        super(id, title, author, year, category);
        this.publisher = publisher;
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + " | Publisher ";
    }
    }