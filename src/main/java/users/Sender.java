package users;

public class Sender implements User {
    private static int uniqueId=1;
    private int id;
    public Sender() {
        this.id = uniqueId;
        uniqueId++;
    }
    @Override
    public void update(String status) {
        System.out.println("Sender " + id + ": " + status);
    }
}
