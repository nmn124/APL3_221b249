
interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

interface SwimBehavior {
    void swim();
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying with wings!");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak! Squeak!");
    }
}

class Mute implements QuackBehavior {
    public void quack() {
        System.out.println("I am mute, I can't quack.");
    }
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}

class SwimDefault implements SwimBehavior {
    public void swim() {
        System.out.println("I am swimming.");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
        
        System.out.println();

        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.performSwim();

        System.out.println();

        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();

        System.out.println();

        lakeDuck.display();
        lakeDuck.performFly();
        lakeDuck.performQuack();
        lakeDuck.performSwim();
    }
}
