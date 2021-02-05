public class Jump extends Prep {
    private int heigth;

    public Jump(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Main.Actions actions) {
        System.out.println("Препятствие " + super.getName() + " высотой: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("Смог перепрыгнуть");

            return true;
        } else {
            System.out.println("Не смог перепрыгнуть");

            return false;
        }
    }
}
