public class Article extends Publication {
    private String university;
    private String journal;
    private int volume;

    public Article(int id, String title, String author, int year, String category, String university, String journal, int volume, String additionalInfo) {
        super(id, title, author, year, category, additionalInfo);
        this.university = university;
        this.journal = journal;
        this.volume = volume;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " | University: " + university + " | Journal: " + journal + " | Volume: " + volume;
    }
}