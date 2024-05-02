public class Main {
    public static void main(String[] args) throws Exception {
        Capstone capstone = new Capstone("Block Chain Application");
        Student student = new Student();

        student.borrowResource(capstone);
    }
}