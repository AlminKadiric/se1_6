package at.aau.serg.exercises.persons;

public class Developer extends Person {
    private String preferredProgrammingLanguage;
    private IDE ide;
    private boolean hasDatabaseExperience;

    public Developer(String fullName, int age, String preferredProgrammingLanguage, IDE ide, boolean hasDatabaseExperience) {
        super(fullName, age);
        this.preferredProgrammingLanguage = preferredProgrammingLanguage;
        this.ide = ide;
        this.hasDatabaseExperience = hasDatabaseExperience;
    }

    @Override
    public String getJobDescription() {
        return "Writes and tests code";
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    public String getPreferredProgrammingLanguage() {
        return preferredProgrammingLanguage;
    }

    public void setPreferredProgrammingLanguage(String preferredProgrammingLanguage) {
        this.preferredProgrammingLanguage = preferredProgrammingLanguage;
    }

    public IDE getIde() {
        return ide;
    }

    public void setIde(IDE ide) {
        this.ide = ide;
    }

    public boolean isHasDatabaseExperience() {
        return hasDatabaseExperience;
    }

    public void setHasDatabaseExperience(boolean hasDatabaseExperience) {
        this.hasDatabaseExperience = hasDatabaseExperience;
    }
}

