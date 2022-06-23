package polymorphism;

public class RTP_2 extends RTP_MOverriding{
	
	int marry(){
		System.out.println("red girl");
		return 0;
	}

	public static void main(String[] args){
		new RTP_2().marry();
	}
}
