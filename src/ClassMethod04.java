import classMethod.human.Human04;

public class ClassMethod04 {
	
	public static void main(String[] args) {
		
//		Human04インスタンスを作成、引数の処理が実行される
		Human04 yamada = new Human04("山田");
		
//		
		Human04.staticMethodPrint();
		
		System.out.println(Human04.GREETING);
		
		yamada.instanceMethodPrint();
	}
}