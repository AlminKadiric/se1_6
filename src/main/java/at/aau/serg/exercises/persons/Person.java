package at.aau.serg.exercises.persons;




    public abstract class Person {
        private String fullName;
        private int age;

        public Person(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }

        public String getFullName() {
            return fullName;
        }

        public int getAge() {
            return age;
        }

        public String getFirstName() {
            if (fullName != null && fullName.contains(" ")) {
                return fullName.split(" ")[0];
            }
            return null; // or throw an exception
        }

        public String getLastName() {
            if (fullName != null && fullName.contains(" ")) {
                return fullName.split(" ")[1];
            }
            return null; // or throw an exception
        }

        public boolean isOfLegalAge() {
            return age > 18;
        }

        public abstract String getJobDescription();
    }

