public class InternetAccess implements Resource {
    private String internetAccess;

    public InternetAccess(String internetAccessParam) {
        this.internetAccess = internetAccessParam;
    }

    @Override
    public void borrow() {
        System.out.println(internetAccess + " url accessed by a student.");
    }
}