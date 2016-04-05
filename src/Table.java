/**
 * Created by Tom on 4/5/2016.
 */
public class Table implements Furniture {
    private String name = "Table";
    public String getName (){return name;}
    public void design(String style){
        System.out.println ("Designing Table as " + style);

    }
}
