public class Human {
    //These are base items that all of our classes will have, so we can make them the first base class.
    public String name;
    public int strength;
    public int health;
    public int stamina;
    public int speed;
    public int attackPower;

    public void setName(){
        name = "Tim";
    }
    public void setStrength(){
        strength = 75;
    }
    public void setHealth(){
        health = 100;
    }
    public void setStamina(){
        stamina = 75;
    }

    public Human(){

}
    public Human(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public void setSpeed(){
        speed = 10;
    }
    public void setAttackPower(){
        attackPower = 1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
