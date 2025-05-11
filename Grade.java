
    public class Grade {
        private String name;
        private int marks;
    
        public Grade(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    
        public String calculateGrade() {
            if (marks >= 90) {
                return "A";
            } else if (marks >= 80) {
                return "B";
            } else if (marks >= 70) {
                return "C";
            } else if (marks >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    
        public void displayStudentDetails() {
            System.out.println("Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
        }
    
        public static void main(String[] args) {

            Grade student1 = new Grade("Mahesh", 95);
            Grade student2 = new Grade("Suraj", 76);
            Grade student3 = new Grade("Deepesh", 58);
            // Display student details
            student1.displayStudentDetails();
            student2.displayStudentDetails();
            student3.displayStudentDetails();
        }
    }

