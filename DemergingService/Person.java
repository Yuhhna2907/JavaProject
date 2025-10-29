package DemergingService;

public class Person {
    private String name;
    private String gender;
    private String dateOfBirth; // ngày sinh

    public Person(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return name + " - " + gender + " - " + dateOfBirth;
    }
}

