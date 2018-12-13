package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
	// One Dimensional array
int i[] = new int[3];
//static array--- To overcome this problem we use collections - arraylist , vector , hashmap,
// store similar data type
/*i[0]=5;
 i[1]=10;
 i[2]=15;
	for(int j =0;j<i.length;j++){
		System.out.println(i[j]);
	}
	System.out.println(i[2]);*/
	Object obj[] =new Object[4];
	obj[0]='c';
	obj[1]=10;
	obj[2]="221c";
	obj[3]="05/06/2018";
	for(int k=0;k<obj.length-1;k++){
	System.out.println(obj[k]);
	// two dimensional array
	
	int ab[][] = new int[3][3];
	System.out.println(ab.length); // this will given row numbers
	System.out.println(ab[0].length); // column numbers
	
	ab[0][0] = 1;
	ab[0][1] = 11;
	ab[0][2] = 12;
	ab[1][0] = 13;
	ab[1][1] = 111;
	ab[1][2] = 123;
	ab[2][0] = 111;
	ab[2][1] = 156;
	ab[2][2] = 134;
	
	for(int m=0;m<ab.length;m++){
		for(int j=0;j<ab[0].length;j++){
			System.out.println(ab[m][j]);
		}
	}
	
	}}
		
			}


