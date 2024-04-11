
/**
 * Write a description of class Device here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Device
{
    private String color;
    private int memory;

    /**
     * Constructor for objects of class Device
     */
    public Device(String color, int memory)
    {
        this.color = color;
        this.memory = memory;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        return "This device is a " + color + " device with " + memory + " GB of memory";
    }
}
