public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Smith", 45, "Cardiology");
        Patient pat = new Patient("John Doe", 30, "Flu");

        doc.showDetails();
        pat.showDetails();
    }
}
