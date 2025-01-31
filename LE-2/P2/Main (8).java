

class Voice {
    public void prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        hear(animals);
    }

    public void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}

class Voice2 extends Voice {
    public void templateMethod() {
        prepareVoice();
    }

    @Override
    public void prepareVoice() {
        super.prepareVoice();
    }
}

public class Main {
    public static void main(String[] args) {
        Voice2 voice = new Voice2();
        voice.templateMethod();
    }
}
