public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }
    public void eat(Plate p) {
        hungry = p.decreaseFood(appetite);

    }
    public  boolean getHungry(){
        return hungry;
    }
    public  String getName() {
        return name;
    }

    }
