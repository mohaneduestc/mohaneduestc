
public class Dog {
	
	private int size;
	
	public void setSize(int s){
		size = s;	
	}
	
	public int getSize(){
		return size;	
	}
	
	public void bark(){
		if (size>60)
			System.out.println(name + " says Hao Hao Hao");
		else if (size>14)
			System.out.println(name + " says He He He");
		else
			System.out.println(name + " says H Hao");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Dog mine = new Dog();
//		mine.setSize(200);
		System.out.println("Dog1 : " + mine.getSize());
		
		
		

	}

}
