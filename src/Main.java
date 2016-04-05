/**
 * Created by Tom on 4/5/2016.
 */
public class Main {
    public static void main (String args[]) throws Exception {
        Furniture c = new Chair();
        Furniture t = new Table();
        Furniture b = new Bed();

        Room room1 = new Room("Kitchen");
        Room room2 = new Room("Bedroom");

        room1.decorate(c);
        room1.decorate(t);

        room2.decorate(b);

        room1.design("Gothic");
        room2.design("Blue");

    }
}
