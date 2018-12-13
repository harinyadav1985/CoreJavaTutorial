package oopConceptsPart1;

public class CallByValueAndCallByReference {
    int p,q;
	public static void main(String args[]){
	CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
	int x =10, y=20;
	obj.sum(x, y); //call by value or pass by value
	
	obj.p=100;
	obj.q=200;
	obj.swap(obj);
	//after swap
	System.out.println(obj.p);
	System.out.println(obj.q);
	}
//call by value or pass by value
	public void sum(int a , int b){
		int c = a+b;
		System.out.println(c);
	}
	//Call by reference (we are the passing the value of obj reference)
	public void swap(CallByValueAndCallByReference t){
		int temp = t.p;
		t.p=t.q;
		t.q=temp;
	}
	
}
