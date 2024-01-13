package at.aau.serg.exercises.persons;

public class Tester extends Person {
    private String preferredTestFramework;

    public Tester(String fullName, int age, String preferredTestFramework) {
        super(fullName, age);
        this.preferredTestFramework = preferredTestFramework;
    }

    @Override
    public String getJobDescription() {
        return "Tests code";
    }

    public String getPreferredTestFramework() {
        return preferredTestFramework;
    }

    public void setPreferredTestFramework(String preferredTestFramework) {
        this.preferredTestFramework = preferredTestFramework;
    }
}

