public class NavajoWayBlessing
{
	public void chant()
	{
		System.out.println("In beauty I walk");
    chorus(4);
    System.out.println("It has become beauty again");
  }

	public void chorus(int count)//add parameters
	{
    for (int i = 0; i < count; i++) {
      System.out.println("With beauty before me I walk");
    }
  }

	public static void main(String[] args)
	{
		NavajoWayBlessing prayer = new NavajoWayBlessing();
		prayer.chant();
	}
}
