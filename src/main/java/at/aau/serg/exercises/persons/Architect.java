package at.aau.serg.exercises.persons;

public class Architect extends Person {
    private ArchitectureStyle style;

    public Architect(String fullName, int age, ArchitectureStyle style) {
        super(fullName, age);
        this.style = style;
    }

    @Override
    public String getJobDescription() {
        return "Designs the project architecture";
    }

    // Additional getters and setters
}
