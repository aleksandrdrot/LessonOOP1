public class Puffendu extends Hogwarts{
    private int industriousness; //трудолюбие
    private int loyalty; //верность
    private int honor; //честь

    public Puffendu(String firstName, String lastName, int witchcraft, int distance, int industriousness, int loyalty, int honor) {
        super(firstName, lastName, witchcraft, distance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }

    @Override
    public int sum(){
        return industriousness+loyalty+honor;
    }

    @Override
    public String toString() {
        return ", Трудолюбие=" + industriousness +
                ", Верность=" + loyalty +
                ", Честь=" + honor ;
    }
}

