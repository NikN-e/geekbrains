public class Animal {
    protected int maxRace;
    protected double maxSwim;
    protected double maxHeight;

    public Animal(){

    }
    public Animal(int maxRace, double maxHeight){
        this.maxRace = maxRace;
        this.maxHeight = maxHeight;
    }

    public Animal(int maxRace, double maxHeight, double maxSwim) {
        this.maxRace = maxRace;
        this.maxSwim = maxSwim;
        this.maxHeight = maxHeight;

    }
}

class Cat extends Animal{

    public Cat(int maxRace, double maxHeight){
        super(maxRace, maxHeight);
        if(maxRace > 0 && maxRace <= 200){
            System.out.println("maxRace Cat " + true);
        }else
            System.out.println("maxRace Cat " + false);
        if(maxHeight > 0 && maxHeight <= 2){
            System.out.println("maxHeight Cat " + true);
        }else
            System.out.println("maxHeight Cat " + false);

    }
}

class Dog extends Animal{
    public Dog(int maxRace, double maxSwim, double maxHeight){
        super(maxRace, maxSwim, maxHeight);
        if(maxRace > 0 && maxRace <= 500){
            System.out.println("maxRace Dog " + true);
        }else
            System.out.println("maxRace Dog " + false);

        if(maxHeight > 0 && maxHeight <= 0.5){
            System.out.println("maxHeight Dog " + true);
        }else
            System.out.println("maxHeight Dog " + false);

        if(maxSwim > 0 && maxSwim <= 10){
            System.out.println("maxSwim Dog " + true);
        }else
            System.out.println("maxSwim Dog " + false);
    }

}

class Main{
    public static void main(String[] args) {
        Animal an = new Animal();
        Cat cat = new Cat(150, 1.3);
        System.out.println();
        Dog dog = new Dog(100, 5, 0.2);

    }
}