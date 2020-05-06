
public class ProofOfMemoryAllocation {
	static int a=20;
	static int b;
	int c;
	int d;
	static {
		System.out.println("i am static block");
		System.out.println(a);
	};
	{
		System.out.println("i aM INSTANCE BLOCK");
		System.out.println(d);
	}

	public static void main(String[] args) {
		ProofOfMemoryAllocation obj=new ProofOfMemoryAllocation();
		ProofOfMemoryAllocation obje=new ProofOfMemoryAllocation();
		ProofOfMemoryAllocation objec=new ProofOfMemoryAllocation();
		ProofOfMemoryAllocation object=new ProofOfMemoryAllocation();
	}
}
