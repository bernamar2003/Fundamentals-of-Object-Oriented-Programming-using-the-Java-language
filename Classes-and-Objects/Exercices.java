public class Exercices {

    public static class Dog {
        // Attributes
        String breed;
        String name;
        int age;
        String color;
        String owner;

        // Methods
        void bark() {
            System.out.println("Woof!");
        }

        void displayDetails() {
            System.out.println("Breed: " + breed +
                               ", \n Name: " + name +
                               ", \n Age: " + age +
                               ", \n Color: " + color +
                               ", \n Owner: " + owner);
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.breed = "Golden Retriever";
        myDog.name = "Buddy";
        myDog.age = 3;
        myDog.color = "Black";
        myDog.owner = "Bernardo Martins";

        myDog.bark();
        myDog.displayDetails();
    }
}