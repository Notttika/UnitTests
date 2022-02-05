package Animals;

public class Koala extends Animal {
    private String wool;
    private String nutrition;


    public Koala(String type, String name, String color, int weight, int quantity, String wool, String nutrition) {
        super(type, name, color, weight, quantity);
        this.wool = wool;
        this.nutrition = nutrition;
    }


    @Override
    public String makeSound() {
         return "I say r-r-r";

    }

    @Override
    public String eat(Animal animal) {
        return "I eat leaves from a tree";

    }


    @Override
    public String toString() {
        return "Koala{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", quantity=" + quantity +
                ", wool='" + wool + '\'' +
                ", nutrition='" + nutrition + '\'' +
                '}';
    }


}
