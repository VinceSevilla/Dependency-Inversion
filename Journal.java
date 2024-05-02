public class Journal implements Resource{
    private String journalTitle;

    public Journal(String journalTitleParam) {
        this.journalTitle = journalTitleParam;
    }

    @Override
    public void borrow() {
        System.out.println(journalTitle + " has been borrowed by a student.");
    }
}