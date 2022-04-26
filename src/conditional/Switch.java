package conditional;

public class Switch {
	public static void main(String[] args) {
		int remote  = 8;
		switch (remote) {
		case 1:
			System.out.println("SunTV");
			break;
		case 2:
			System.out.println("VijayTV");
			break;
		case 3:
			System.out.println("KTV");
			break;
		case 4:
			System.out.println("ColoursTV");
			break;
		case 5:
			System.out.println("MoonTV");
			break;
		default:
			System.out.println("Enter Valid number");
			break;
		}
	}

}
