import java.util.Random;
public class Cat extends Feline {
    //default constructor
    public Cat(String name) {
        this.name = name;
    }
    public void noise() {
        System.out.println("Meow");
    }
    public void roam() {
        System.out.println("Meow Meow Meow");
    }
    //choose random action for cat correspond to each remainder
    public void random() {
        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        if (rand_int % 5 == 0) {
            this.wake();
        }
        else if (rand_int % 5 ==1) {
            this.noise();
        }
        else if (rand_int % 5 ==2) {
            this.eat();
        }
        else if (rand_int % 5 ==3) {
            this.roam();
        }
        else {
            this.sleep();
        }
    }
}
