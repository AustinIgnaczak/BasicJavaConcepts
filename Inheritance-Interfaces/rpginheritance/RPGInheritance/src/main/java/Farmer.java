public class Farmer extends Human {
//Farmer shares all of the methods in human, so we extend it
    //And call the methods from Human
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
    public void setSpeed(){
        speed = 10;
    }
    public void setAttackPower(){
        attackPower = 1;
    }
        //Farmer has some methods that are not available in human, so we all them here
    public void run(){
        System.out.println("*Running noises*");
    }
    public void plow(){
        System.out.println("*Plowing noises*");
    }
    public void harvest() {
        System.out.println("*Harvesting noises*");
    }
        public void attack() {
            System.out.println("*Plowing noises*");
        }
    public void heal() {
        System.out.println("*Plowing noises*");
    }
    public void decreaseHealth(int a){
        health = health - a;
    }
    public void increaseStamina(int a){
        stamina = stamina + a;
    }
    public void decreaseStamina(int a){
        stamina = stamina - a;
    }
    }
