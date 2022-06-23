package doubtsClarified;

public class thisKeyword {

	int a = 100;

	// this keyword is used to refer instance variable instead of local variable.
	int m1(int x) {

		return this.a;
	}

	public static void main(String[] args) {
		thisKeyword m = new thisKeyword();

		System.out.println(m.m1(99));//100
	}

}
