// Tat Putjorn 672115024 //

import java.util.List;

public class CovidVaccine {
    private int sid;
    private String firstName;
    private String lastName;
    private List<String> previousVaccines;

    public CovidVaccine(int sid, String firstName, String lastName, List<String> previousVaccines) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.previousVaccines = previousVaccines;
    }

    public int getSid() {
        return sid;
    }

    @Override
    public String toString() {
        return "SID: " + sid + ", Name: " + firstName + " " + lastName + ", Vaccines: " + previousVaccines;
    }
}
