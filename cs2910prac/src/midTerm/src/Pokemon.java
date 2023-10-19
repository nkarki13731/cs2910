public class Pokemon {
    private String name;
    private String type;
    private int level;
    private int experience;
    private boolean isFainted;

    Pokemon(String name, String type){
        this.name = name;
        this.type = type;
        this.level = 1;
        this.experience = 0;
        this.isFainted = false;
    }

    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }

    public int getLevel(){
        return  this.level;
    }

    public int getExperience(){
        return this.experience;
    }

    public String isFainted(){
        if (this.isFainted == true){
            return "Pokemon is fainted";
        }
        return "Pokemon is active";

    }

    public void levelUP(int increasedLevel ){
        if ((this.level + increasedLevel) < 100){
            this.level+=increasedLevel;
        }
    }

    public boolean hasLevelledUp(int experiencePoints){
        this.experience+=experiencePoints;
        return this.checkForLevelUp();

    }

    public boolean checkForLevelUp(){
        if(this.experience >= 1000){
            this.level= this.experience/1000;
            this.experience = this.experience%1000;
            return true;
        }
        return false;
    }

    public void revive(){
        this.isFainted = false;
    }
    public void faint(){
        this.isFainted = true;
    }

}
