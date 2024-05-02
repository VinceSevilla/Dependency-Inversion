public class Theses implements Resource{
    private String thesisTitle;

    public Theses(String thesesTitleParam) {
        this.thesisTitle = thesesTitleParam;
    }

    @Override
    public void borrow() {
        System.out.println(thesisTitle + " borrowed by a student.");
    }
}