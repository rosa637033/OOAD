public class Zookeeper {
    public Zookeeper() {

    }
    public void wakeup(Animal a) {
        System.out.println("my name is " + a.name + " My type is " + a.getClass());
        if (a instanceof Cat) {
            ((Cat) a).random();
        }
        else {
            a.wake();
        }
    }
    public  void rollcall(Animal a) {
        System.out.println("my name is " + a.name + " My type is " + a.getClass());
        if (a instanceof Cat) {
            ((Cat) a).random();
        }
        else {
            a.noise();
        }
    }
    public void feed(Animal a) {
        System.out.println("my name is " + a.name + " My type is " + a.getClass());
        if (a instanceof Cat) {
            ((Cat) a).random();
        }
        else {
            a.eat();
        }
    }
    public void exercise(Animal a) {
        System.out.println("my name is " + a.name + " My type is " + a.getClass());
        if (a instanceof Cat) {
            ((Cat) a).random();
        }
        else {
            a.sleep();
        }
    }
    public void shut_down(Animal a) {
        System.out.println("I am shutting down the zoo now");
    }
}
