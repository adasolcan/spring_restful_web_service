package hello;

public class Greeting {

    private final long id;
    private final String value;

    public Greeting(long id, String value) {
        this.id = id;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
