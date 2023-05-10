package mammels;

public class Mammel implements Animal{

    private String name;
    private int age;
    private String species;
    private String noise;

    public Mammel(String name, int age, String species, String noise){
        this.name = name;
        this.age = age;
        this.species = species;
        this.noise = noise;
    }

    @Override
    public String sayMyName() {
        return this.name;
    }

    @Override
    public String noise() {
        return this.noise;
    }
}
