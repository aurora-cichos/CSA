public class MenuItem
{
    private String name;
    private double price;
    public MenuItem()
    {
        name = "generic name";
        price = 0.0;
    }
    public MenuItem(String n, double p)
    {
        name = n;
        price = p;
    }
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

} // end class MenuItem