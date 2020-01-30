import java.util.Objects;

public class NumberGenerator implements Runnable {
    public String name;
    public int hashcode;

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(i+": "+this.name+" "+hashcode);
        }
    }

    public NumberGenerator(String name) {
        this.name = name;
        this.hashcode = hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberGenerator)) return false;
        NumberGenerator that = (NumberGenerator) o;
        return hashcode == that.hashcode &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hashcode);
    }

}