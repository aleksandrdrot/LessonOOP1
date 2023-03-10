public class Slizerin extends Hogwarts{
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int power; //власть

    public Slizerin(String firstName, String lastName, int witchcraft, int distance, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(firstName, lastName, witchcraft, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    @Override
    public int sum(){
        return cunning+determination+ambition+resourcefulness+power;
    }

    @Override
    public String toString() {
        return ", Хитрость=" + cunning +
                ", Решительность=" + determination +
                ", Амбициозность=" + ambition +
                ", Находчивость=" + resourcefulness +
                ", Власть=" + power;
    }
}

