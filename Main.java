
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[]args)
    {
        int i = 0;
        Triki triki = new Triki();
        while(i == 0)
        {
            triki.reinicio();
            if(triki.marco.isVisible() == false)i = 1;
        }
    }           
}
