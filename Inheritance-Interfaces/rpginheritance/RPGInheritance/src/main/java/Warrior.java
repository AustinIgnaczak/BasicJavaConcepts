public class Warrior extends  Constable {
    //Warrior has a new int value, so we add it here
    int shieldStrength;
    @Override
    public void setName() {
        name = "Sir Night";
    }

    @Override
    public void setStrength() {
        strength = 60;
    }

    @Override
    public void setHealth() {
        health = 100;
    }

    @Override
    public void setStamina() {
        stamina = 60;
    }

    @Override
    public void setSpeed() {
        super.setSpeed();
    }

    @Override
    public void setAttackPower() {
        attackPower = 10;
    }
    public void shieldStrength(){
        shieldStrength = 100;
    }

    @Override
    //Shares some methods with previous classes, but has some
    //Personal ones. So we add them here
    public void run() {
        super.run();
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void heal() {
        super.heal();
    }

    @Override
    public void decreaseHealth(int a) {
        super.decreaseHealth(a);
    }

    @Override
    public void increaseStamina(int a) {
        super.increaseStamina(a);
    }

    @Override
    public void decreaseStamina(int a) {
        super.decreaseStamina(a);
    }
    public void decreaseShieldStrength(int a){
        shieldStrength = shieldStrength -a;
    }

}
