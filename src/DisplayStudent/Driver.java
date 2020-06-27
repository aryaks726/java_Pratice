package DisplayStudent;

public class Driver {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.storeInformation();
        service.displayInformation();
    }
}
