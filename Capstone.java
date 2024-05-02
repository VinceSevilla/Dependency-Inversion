public class Capstone implements Resource{
    private String capstoneTitle;

    public Capstone(String capstoneTitleParam) {
        this.capstoneTitle = capstoneTitleParam;
    }

    @Override
    public void borrow() {
        System.out.println(capstoneTitle + " project details borrowed by a student.");
    }
}