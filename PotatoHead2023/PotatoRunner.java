
public class PotatoRunner
{
    public static void main (String[] args)
    {
        PotatoHead russet = new PotatoHead();
        PotatoHead jhb = new PotatoHead("James \"Hash\" Brown", 34, "I PEEL Good!", 3, 4, 3, 6, 3, 5, 0);
        PotatoHead jeff = new PotatoHead("Jeff", 21, "It'd be a shame if someone fried me.");

        russet.setAge(100);
        jeff.setAge(23);
        
        System.out.println(russet.getAge());
        System.out.println(jeff.getAge());

        System.out.println(russet.haveBirthday());
        System.out.println(jeff.haveBirthday());

        System.out.println(russet.toString());
        System.out.println(jeff.toString());
        System.out.println(jhb.toString());
    }
    
}
