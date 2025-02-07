class Kaurav extends Bharatvanshi {
    private boolean isObedient;

    public Kaurav(String name, boolean isObedient) {
        super(name);
        this.isObedient = isObedient;
    }

    public void disobey() {
        System.out.println(name + " disobeys.");
    }

    public void cruel() {
        System.out.println(name + " is cruel.");
    }

    @Override
    public void fight() {
        System.out.println(name + " is a fighter.");
    }
}
