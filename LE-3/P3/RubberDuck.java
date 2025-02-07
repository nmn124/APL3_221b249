class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
        swimBehavior = new SwimDefault();
    }

    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}