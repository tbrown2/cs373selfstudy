import java.util.ArrayList;
/**
 * Created by Tom on 4/5/2016.
 */
public class Room implements Furniture
{
    private String name="";
    private ArrayList<Furniture> decorations = new ArrayList<Furniture>();

    public String getName (){return name;}

    public Room(String name){
        System.out.println("Created a new Room called " + name);
        this.name = name;
    }
    public void design(String style){
        System.out.println("Designing " + name + " furniture...");
        for (Furniture f: decorations){
            f.design(style);
        }
    }
    public void decorate(Furniture f){
        System.out.println("Decorate " + name + " with " + f.getName());
        decorations.add(f);
    }
    public void remove (Furniture f){
        System.out.println("Removed " + f.getName() + " from Room");
        decorations.remove(f);
    }
    public void trash (){
        decorations.clear();
    }
}
