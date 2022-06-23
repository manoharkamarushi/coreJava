package doubtsClarified;

public class constructor {

	int eid=10;
//	int eid;
	public constructor(int eid){
//		this.eid=eid;
		System.out.println(this.eid);
	}
	void disp(){
		System.out.println(eid);
	}
public static void main(String[] args){
	constructor c=new constructor(120);
	c.disp();
	constructor c1=new constructor(400);
	c1.disp();
}
}
