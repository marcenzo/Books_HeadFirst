package br.com.headfirstjava.chapter03;

class SpeakingOfVariables{
    void callMethod(){

   	//int x = 34.5; don't convert int to float
   	//boolean boo = x;
   	int g = 10;
   	int y = g;
   	//y = y;don't convert short to byte
   	short s = 1;
   	//s = y;
   	byte b = 3;
   	byte v = b;
   	short n = 12;
   	//v = n; don't convert short to byte
   	//byte k = 128; very big

   	System.out.println("Show values of variables = " + " " + g + " " + y + " " + s + " " + b + " " + v + " " + n);
       }
}
public class SpeakingOfVariablesTestDrive {
    public static void main(String[] args) {
	SpeakingOfVariables s = new SpeakingOfVariables();
	s.callMethod();

     }

}
 