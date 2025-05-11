public class Details {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Details(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void displayContactDetails() {
        if (emailAddress != null && !emailAddress.isEmpty()) {
            System.out.println("Name: " + name);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email Address: " + emailAddress);
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        
        Details contact1 = new Details("Abhishek", "9766254532", "abhishek1@gmail.com");
        Details contact2 = new Details("Mahesh", "9845896324", "mahesh2@gmail.com");
        Details contact3 = new Details("Nima", "9863453214", "nima3@gmail.com");

        contact1.displayContactDetails();
        contact2.displayContactDetails();
        contact3.displayContactDetails();
    }
}