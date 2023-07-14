package mammels;

public class Lion extends Mammel {
    public Lion(String name, int age) {
        super(name, age, "Lion", "ROAAAAAR!!!");
    }

    public void move(String location){
        if (location == "Brazil"){
            throw new IllegalArgumentException("Its not allowed lions in Brazil");
        }
    }
}
