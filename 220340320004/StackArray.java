class StackArray{
	int size;
	int tos1,tos2;
	int a[];
	
	StackArray(int size){
		a=new int[size];
		this.size=size; 
		tos1=-1;
		tos2=size;
	
	}
	
	
	void pushArray1(int p)
	{
		if(tos1<tos2-1){
			tos1++;
			a[tos1]=p;
		}
		else{
			System.out.println("stack overflow");
			System.exit(1);
		}
	}
	void pushArray2(int p){
		if(tos1<tos2-1){
			tos2--;
			a[tos2]=p;
		
		}
		else{
			System.out.println("stack overflow");
			System.exit(1);
		}
	
	}
	
	int popArray1(){
		if(tos1>=0){
			int x=a[tos1];
			tos1--;
			return x;
		}
		else{
			System.out.println("stack underflow");
		System.exit(1);
		}
	return 0;
	}
	int popArray2(){
		if(tos2<size){
			int x=a[tos2];
			tos2++;
			return x;
		}
		else{
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
	
	}
	public static void main(String[]args){
		StackArray st=new StackArray(5);
		st.pushArray1(10);
		st.pushArray2(20);
		st.pushArray1(30);
		st.pushArray2(40);
		
		System.out.println("popped element from stack1 is");
		System.out.println(	st.popArray1());
		System.out.println("popped element from stack2  is");
		System.out.println(	st.popArray2());
	}
	
	
	
}