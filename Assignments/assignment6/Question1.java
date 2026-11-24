// Online Java Compiler (Editor)
// Write and run Java online using this editor.


class Student {
    private String studentId;
    private String studentName;
    private double GPA;

    public Student(String id, String name, double gpa) {
        studentId = id;
        studentName = name;
        GPA = gpa;
    }

    public Student(){
        studentId = "000";
        studentName = "Unknown";
        GPA = 0.0;
    }

    public void setId(String id) {
        studentId = id;
    }

    public String getId() {
        return studentId;
    }

    public void setName(String name) {
        studentName = name;
    }

    public String getName() {
        return studentName;
    }

     public void setGPA(double gpa) {
        GPA = gpa;
    }

    public double getGPA() {
        return GPA;
    }

    public boolean isHonorStudent() {
        return GPA > 3.5;
    }
    
}


class Question1 {
    public static void main(String[] args) {
       Student obj1 = new Student("20251043", "Zeiad Basem", 3.8);
       Student obj2 = new Student();

       obj2.setGPA(3.8);
       obj2.setId("384929");
       obj2.setName("Hany Eldeeb");

       System.out.println("Student name: " + obj1.getName() + " Id: " + obj1.getId() + " GPA: " + obj1.getGPA() + " is Honor: " + obj1.isHonorStudent());

         System.out.println("Student name: " + obj2.getName() + " Id: " + obj2.getId() + " GPA: " + obj2.getGPA() + " is Honor: " + obj2.isHonorStudent());
        
    }
}
