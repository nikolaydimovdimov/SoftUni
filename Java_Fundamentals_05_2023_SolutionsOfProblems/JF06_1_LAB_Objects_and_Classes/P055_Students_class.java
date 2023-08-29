package JF06_1_LAB_Objects_and_Classes;

public class P055_Students_class {
    public static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String homeTown;

        public Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHomeTown(String town) {
            this.homeTown = town;
        }
    }
}

