public class Zoo {
    public static void main (String args[])
    {
        Cat Chi = new Cat("Chi");
        Cat Cold = new Cat("Cold");
        Lion Lee = new Lion("Lee");
        Lion Lin  = new Lion("Lin");
        Zookeeper b = new Zookeeper();
        b.feed(Lin);
        b.rollcall(Lin);
        b.exercise(Chi);
        b.wakeup(Chi);
        b.feed(Cold);
        b.exercise(Lee);

    }
}
