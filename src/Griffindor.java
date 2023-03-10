public class Griffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor; //честь
    private int bravery; //храбрость

    public Griffindor(String firstName, String lastName, int witchcraft, int distance, int nobility, int honor, int bravery) {
        super(firstName, lastName, witchcraft, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public int sum(){
        return nobility+honor+bravery;
    }

    @Override
    public String toString() {
        return ", Благородство=" + nobility +
                ", Честь=" + honor +
                ", Храбрость=" + bravery;
    }
}
