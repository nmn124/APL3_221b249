class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new SwimDefault();
    }

    public void display() {
        System.out.println("I am a RedHead Duck.");
    }
}