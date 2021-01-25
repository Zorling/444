public class Main {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Шруся", 5);
        catArray[1] = new Cat("Хель", 10);
        catArray[2] = new Cat("Пират", 15);

        Plate plate1 = new Plate(100);

        for (int i = 0; i < 3; i++) {
            catArray[i].eat(plate1);
            System.out.println("Котик " + catArray[i].getName() + " сытый? = " +  catArray[i].getHungry());

        }
        plate1.fill();

    }
}
