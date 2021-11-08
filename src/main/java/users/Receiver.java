package users;

public class Receiver implements User {
    private static int uniqueId=1;
    private int id;
    public Receiver() {
        this.id = uniqueId;
        uniqueId++;
    }
    @Override
    public void update(String status) {
        System.out.println("Receiver " + id + ": " + status);
    }
}
