class Vegrest
{
	public static void vegItems(int item)
	{
	switch(item)
	{
	case 1:
	    System.out.println("pongal");
	    break;
	case 2:
	     System.out.println("Dosa");
	     break;
	case 3:
	     System.out.println("idly");
	     break;
	case 4:
	     System.out.println("chapathi");
	     break;
	case 5:
	     System.out.println("vada");
	     break;
	     default:
	     System.out.println("food items");

	}
	}
	public static void main(String[] args)
	{
	vegItems(5);
	}
}