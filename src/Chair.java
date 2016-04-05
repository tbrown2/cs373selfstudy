/**
 * Created by Tom on 4/5/2016.
 */
public class Chair implements Furniture
{
    private String name = "Chair";
    public String getName (){return name;}
    public void design(String style){
        System.out.println ("Designing Chair as " + style);

    }
}
