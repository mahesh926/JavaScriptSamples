package test;


class c2 implements I2
{
	public static void main(String[] args) {
		System.out.println(I2.name);
		System.out.println(HCl.s1);
		System.out.println(((HCl)new c2()).name);
	}
}