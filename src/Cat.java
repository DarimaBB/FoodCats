public class Cat {
    private String name;
    private int appetite;
    private boolean eat = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void info() {
        System.out.println("The cat named " + name + " with appetite " + appetite);
        if (eat) {
            System.out.println("He is not hungry ");
        } else {
            System.out.println("He is hungry");
        }
    }

    public void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            eat = true;
        }
    }
}
