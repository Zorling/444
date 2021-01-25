public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (n < food) {
            food -= n;
            return(true);
        }
        else {
            System.out.println("В миске мало еды");
            return (false);
        }
    }
    public void fill() {
        food = 100;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

}
