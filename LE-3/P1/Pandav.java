class Pandav extends Bharatvanshi {
    private boolean isKind;

    public Pandav(String name, boolean isKind) {
        super(name);
        this.isKind = isKind;
    }

    public void obey() {
        System.out.println(name + " obeys.");
    }

    public void kind() {
        if (isKind) {
            System.out.println(name + " is kind.");
        } else {
            System.out.println(name + " is less kind.");
        }
    }

    @Override
    public void fight() {
        System.out.println(name + " is a skilled fighter.");
    }
}
