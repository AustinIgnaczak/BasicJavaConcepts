public class Constable extends Farmer {
    //This will override the values set in farmer, as Constable
    //extends farmer. This still uses the methods from Human
    @Override
    public void setName() {
        name = "Bill";
    }

    @Override
    public void setStrength() {
        strength = 60;
    }

    @Override
    public void setStamina() {
        stamina = 60;
    }

    @Override
    public void setSpeed() {
        speed = 20;
    }

    @Override
    public void setAttackPower() {
        attackPower = 5;
        }
    public void jurisdiction(){

    }

    @Override
    //While Constable shares some methods of farmer,
    //It has a few person ones, so we add them here.
    public void run() {
        super.run();
    }
    public void arrest(){
        System.out.println("Stop right there, criminal scum!");
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

}
