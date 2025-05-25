class Student {
    private String name; // private = encapsulated

    public void setName(String newName) {
        name = newName; // setter
    }

    public String getName() {
        return name;    // getter
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Sindu");  // Name changed to "Sindu"
        System.out.println("Student name: " + s.getName());
    }
}
