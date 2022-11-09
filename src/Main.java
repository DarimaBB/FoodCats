public class Main {
    public static void main (String[] args) {
        Cat cat1 = new Cat("Bonnie", 40);
        Cat cat2 = new Cat("Tom", 25);
        Cat cat3 = new Cat("Jerry", 60);

        Cat[] cats = {cat1, cat2, cat3};
        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }
}
