import java.util.Objects;

public class CatVet {

    String name;
    String color;

    public CatVet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void sayMeow() {
    }

    @Override
    public String toString() {
        return "Cat: " + name + " " + color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof CatVet) {
            CatVet cat = (CatVet) obj;
            if (cat.hashCode() != this.hashCode()) return false;
            return this.name.equals(cat.name) && this.color.equals(cat.color);
        }
        return false;
    }
}
