package turkey.wild.springboot.domain;

public class Film {
    private String name;

    public Film(String name) {
        this.name = name;
    }

    public Film() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
