/**
 * Created by Tom on 4/5/2016.
 */
public class Bed implements Furniture
{
    private String name = "Bed";
    public String getName (){return name;}
    public void design(String style){
        System.out.println ("Designing Bed as " + style);
    }
}
