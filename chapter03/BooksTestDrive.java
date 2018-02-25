package br.com.headfirstjava.chapter03;

class Books{
    String title;
    String author;
}

public class BooksTestDrive {
    public static void main(String[] args) {
	int x = 0;

	Books [] mybooks = new Books[3];
	
	mybooks[0] = new Books();
	mybooks[1] = new Books();
	mybooks[2] = new Books();

	mybooks[0].title = "The Grapes of Java ";
	mybooks[1].title = "The Java Gatsby ";
	mybooks[2].title = "The Java cookBook ";
	mybooks[0].author = "Bob";
	mybooks[1].author = "Sue";
	mybooks[2].author = "Ian";

	while (x < mybooks.length) {
	    System.out.print("Output = " + mybooks[x].title);
	    System.out.print("by ");
	    System.out.println(mybooks[x].author);

	    x = x + 1;

	}
    }

}

