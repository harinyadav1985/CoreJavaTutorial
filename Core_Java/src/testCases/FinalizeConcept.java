package testCases;

public class FinalizeConcept {
	
	public void finalize(){
		System.out.println("finalize method");
	}
public static void main(String args[]){
/*finalize is a method and it will be
 * will be automatically called in main method and do some cleanup processing just 
 * before the garbage collected method System.gc perform*/
FinalizeConcept f1=new FinalizeConcept();
FinalizeConcept f2=new FinalizeConcept();
f1=null;
f2=null;
System.gc();//it is garbage collection method
}}
