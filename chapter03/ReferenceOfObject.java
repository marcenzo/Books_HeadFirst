package br.com.headfirstjava.chapter03;




public class ReferenceOfObject {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
	
	 ReferenceOfObject r = new ReferenceOfObject();  
	 ReferenceOfObject s = new ReferenceOfObject();
	 
	 ReferenceOfObject a = r;
	 
	 int [] nums;
	 nums = new int[7];
	 
	 System.out.println(nums);
    }

}
