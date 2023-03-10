public class Kogtevran extends Hogwarts {
    private int mind; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creation; //творчество

    public Kogtevran(String firstName, String lastName, int witchcraft, int distance, int mind, int wisdom, int wit, int creation) {
        super(firstName, lastName, witchcraft, distance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public int sum(){
        return mind+wisdom+wit+creation;
    }

    @Override
    public String toString() {
        return ", Ум=" + mind +
                ", Мудрость=" + wisdom +
                ", Остроумие=" + wit +
                ", Творчество=" + creation;
    }
}

