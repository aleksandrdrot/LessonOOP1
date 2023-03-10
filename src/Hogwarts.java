public class Hogwarts {
    private String firstName;
    private String lastName;
    private int witchcraft; //колдовство
    private int distance; //дистанция

    public Hogwarts(String firstName, String lastName, int witchcraft, int distance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.witchcraft = witchcraft;
        this.distance = distance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int sum(){
        return 0;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", witchcraft=" + witchcraft +
                ", distance=" + distance +
                '}';
    }
}

