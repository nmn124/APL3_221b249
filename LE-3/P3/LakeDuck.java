class LakeDuck extends Duck {
    public LakeDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new SwimDefault();
    }

    public void display() {
        System.out.println("I am a Lake Duck.");
    }
}