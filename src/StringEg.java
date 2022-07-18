
public class StringEg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Sentence = "A cloudless plain blue sky is like a flowerless garden";
		String Sentence2 = "A cloudless plain blue sky is like a flowerless garden";
		String Text = "Hi\nEveryone";
		System.out.println("Convert to uppercase: " + Sentence.toUpperCase());
		System.out.println("Convert to Lowercase: " + Sentence.toLowerCase());
		System.out.println(Sentence.indexOf("blue"));
		System.out.println("Print the total number of strings present: " + Sentence.length());
		System.out.println(Text);
		System.out.println(Sentence.concat(Sentence2));
		System.out.println(Sentence + " " + Sentence2);
		System.out.println(Sentence.charAt(5));
		System.out.println(Sentence.contains("is"));
		System.out.println(Sentence.contains("are"));
		System.out.println(Sentence.replace("is", "was"));
		
	}
}