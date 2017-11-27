package Playground1.Program3;

public class Player {

    String name;
    int keeper;
    int defending;
    int playmaking;
    int wing;
    int passing;
    int scoring;
    int setPieces;

    public Player(String name, int keeper, int defending, int playmaking, int wing, int passing, int scoring, int setPieces) {
        this.name = name;
        this.keeper = keeper;
        this.defending = defending;
        this.playmaking = playmaking;
        this.wing = wing;
        this.passing = passing;
        this.scoring = scoring;
        this.setPieces = setPieces;
    }

    public int getKeeper() {
        return keeper;
    }

    public void setKeeper(int keeper) {
        this.keeper = keeper;
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    public int getPlaymaking() {
        return playmaking;
    }

    public void setPlaymaking(int playmaking) {
        this.playmaking = playmaking;
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getScoring() {
        return scoring;
    }

    public void setScoring(int scoring) {
        this.scoring = scoring;
    }

    public int getSetPieces() {
        return setPieces;
    }

    public void setSetPieces(int setPieces) {
        this.setPieces = setPieces;
    }

    public void printSkills() {
        System.out.println("The player " + name + " has these skills: " + "\n Keeper: " + keeper + "\n Defending: " + defending + "\n Playmaking: " + playmaking + "\n Wing: " + wing +
                            "\n Passing: " + passing + "\n Scoring: " + scoring + "\n Set Pieces: " + setPieces);
    }
}
