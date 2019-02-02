public class Cat {
    private String name;
    public int appetite;

    private boolean Full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        Full = false;
    }

    public void eat(Plate p) {
        if(p.getFood() >= appetite){
            p.decreaseFood(appetite);
            Full = true;
        }else {
            System.out.println(name + " не хватило еды");
            Full = false;
        }
    }

    boolean getFull(){
        return Full;
    }

    String getName() {
        return name;
    }

}

class Plate {
    private int food;

    public Plate(int food) {

        this.food = food;
    }

    public void info() {

        System.out.println("plate: " + food);
    }

    int getFood(){
        return food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }

    void addFood(int addFood){
        food += addFood;
    }
}

class Main {
    public static void main(String[] args) {

        Cat[] cat = {new Cat("Barsik", 50),
                new Cat ("Murzik", 70),
                new Cat("Tom", 30)};

        Plate plate = new Plate(100);
        plate.info();

        for(Cat c : cat){
            c.eat(plate);
            System.out.println(c.getName() + " сыт?" + (c.getFull() == true ? " да" : " нет"));
        }
        plate.info();
        plate.addFood(40);
        plate.info();

    }
}