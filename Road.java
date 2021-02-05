public class Road extends Prep {
    int length;


    public Road(String name, int length) {
        super(name);

        this.length = length;
    }
    public int getLength() {
        return length;
    }



    @Override
    protected boolean moving(Main.Actions actions) {
        System.out.println("Дорожка " + super.getName() + " длина: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Дорожка пройдена");

            return true;
        } else {
            System.out.println("Дорожка не пройдена");

            return false;
        }
    }
}
