package Animals;

public  abstract class Animal {
    String type;
    String name;
    String color;
    int weight;
    int quantity;

    public Animal(String type, String name, String color, int weight, int quantity) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.quantity = quantity;
    }


    public abstract String makeSound();
    public abstract String eat(Animal animal);
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (weight != animal.weight) return false;
        if (quantity != animal.quantity) return false;
        if (!type.equals(animal.type)) return false;
        if (!name.equals(animal.name)) return false;
        return color.equals(animal.color);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + weight;
        result = 31 * result + quantity;
        return result;
    }
}
