package br.com.headfirstjava.chapter03;


class ArraysTest{

    void callmethod() {
	int y = 0;
	int ref;

	while( y < 4) {

	    int [] index = new int [4]; 
	    index[0] = 1;
	    index[1] = 3;
	    index[2] = 0;
	    index[3] = 2;

	    ref = index[y];

	    String [] islands = new String[4];
	    islands [0] = "Bermuda"; 
	    islands [1] = "Fiji"; 
	    islands [2] = "Azores"; 
	    islands [3] = "Cozumel"; 

	    y = y + 1;

	    System.out.print("island = ");
	    System.out.println(islands[ref] );

	}
    }
}

public class ArraysTestDrive {
    public static void main(String[] args) {
	ArraysTest at = new ArraysTest();
	at.callmethod();

    }
}
