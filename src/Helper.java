import java.util.Random;


public class Helper {

	
	public Helper(){
		
	}
	
	public void p(String in_str){
		System.out.println(in_str);
	}
	
	public boolean randomBoolean(){
	    return Math.random() < 0.5;
	}
	
	public int randmaxminInt(int max, int min) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
		
}
