public abstract class Animal {
    public String name;
    public void wake() {
        System.out.println("I am awake");
    }
    public abstract void noise();
    public void eat() {
        System.out.println("I am eating");
    }
    public abstract void roam();
    public void sleep() {
        System.out.println("I am going to sleep");
    }
}
