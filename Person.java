public class Person {

    // Instance Variables (Fields)
    private String name;
    private int age;
    private boolean employed;

    // Constructor
    public Person(String name, int age, boolean employed) {
        this.setName(name);
        this.setAge(age);
        this.employed = employed;
    }

    // Getter for 'name'
    public String getName() {
        return this.name;
    }

    // Setter for 'name'
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            System.out.println("Error: Name cannot be null or empty.");
        }
    }

    // Getter for 'age'
    public int getAge() {
        return this.age;
    }

    // Setter (Mutator) for 'age'
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid age provided (" + age + "). Age must be between 0 and 120.");
        }
    }

    // Getter for 'employed' (boolean)
    public boolean isEmployed() {
        return this.employed;
    }

    // Setter for 'employed'
    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

}