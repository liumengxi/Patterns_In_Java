package mementoPatterns;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		bookCopy bc = new bookCopy();
		bc.setName("jvm");
		bc.setPrice("11");
		
		book b = new book();
		
		b = new book(bc);
		
		System.out.println(b.name);
		System.out.println(b.price);
		
		
		

	}

}
