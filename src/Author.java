public class Author {
    private String name;
    private String email;
    private char gender;

    // initialise instance attributes through constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // toString() override method for custom output
    @Override
    public String toString() {
        return "Author: " + name + ", email: " + email + ", Gender: " + gender + "\n";
    }
}
