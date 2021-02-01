
public class Chapter03 {
	public static void main(String[] args) {
		
		long l = 111111111111L;
		double d = 3.14;
		boolean b = true;
		System.out.println(l);
		System.out.println(d);
		System.out.println(b);
		
		Integer i = 100;
		Float f = 1.13f;
		Character c = 'あ';
		System.out.println(i);
		System.out.println(f);
		System.out.println(c);
		
		int[] array = { 0,10,20,30,40 };
		System.out.println(array[3]);
		
		int val = 2 + 5;
		System.out.println(val);
		
		val++;
		System.out.println(val);
		
		val *= 5;
		System.out.println(val);
		
		boolean bool = (val == 50);
		System.out.println(bool);
		
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}
}
