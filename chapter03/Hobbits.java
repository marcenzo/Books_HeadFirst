package br.com.headfirstjava.chapter03;

class HobbitsTest{
    String name;
}

public class Hobbits {
    public static void main(String[] args) {

	HobbitsTest [] h = new HobbitsTest[3];

	int z  = 0;
	z = z - 1;

	while (z < 2) {
	    z = z + 1;

	    h[z] = new HobbitsTest();
	    h[z].name = "Enzo";

	    if (z == 1) {
		h[z].name = "Marcenzo";
	    }

	    if(z == 2)
		h[z].name = "Maisenzo";	
	}
	System.out.println(h[z].name + " ïs a ");
	System.out.println("Good hobbits name ");
    }
}


