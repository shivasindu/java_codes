// Superclass 
class Bird {
    void sound() {
        System.out.println("Some bird makes a sound");
    }
}

// Subclass 1
class Sparrow extends Bird {
    @Override
    void sound() {
        System.out.println("Sparrow chirps");
    }
}

// Subclass 2
class Parrot extends Bird {
    @Override
    void sound() {
        System.out.println("Parrot talks");
    }
}

// Main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        Bird b1 = new Sparrow();  // Upcasting
        Bird b2 = new Parrot();   // Upcasting

        b1.sound(); // Calls Sparrow's version
        b2.sound(); // Calls Parrot's version
    }
}
