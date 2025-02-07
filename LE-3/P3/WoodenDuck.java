class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Mute();
        swimBehavior = new SwimDefault();
    }

    public void display() {
        System.out.println("I am a Wooden Duck.");
    }
}