package Task_22String;

class Removechar {
	public void removeString(String line1, String line2) {
		String result = new String(line1);

		for (int index = 0; index < line2.length(); ++index)

		{
			String temporary = Character.toString(line2.charAt(index));
			result = result.replaceAll(temporary, "");
		}

		System.out.println(" Given stringinput1 : " + line1);
		System.out.println(" Given stringinput2 : " + line2);
		System.out.println(" String Result : " + result);
	}
}

public class RemoverString {
	public static void main(String args[]) {
		Removechar task = new Removechar();
		String line1 = "Sky is Blue";
		String line2 = "sb";
		line1 = line1.toLowerCase();
		line2 = line2.toLowerCase();
		task.removeString(line1, line2);

	}
}
