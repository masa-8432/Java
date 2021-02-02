package classMethod.human;

//インスタンスを作成するとこの処理が実行される
public class Human04 {
	
//	static変数で人数を0に設定
	static public int HumanCount = 0;
	public String name;
//	定数を作る
	public static final String GREETING = "こんにちは！";

	public Human04(String name) {
		this.name = name;
//		インスタンス生成ごとにstatic変数をインクリメントする（１足す）
		Human04.HumanCount++;
	}
	
//	staticメソッドからインスタンス変数は使用できない、コンパイルエラーになる
	static public void staticMethodPrint() {
		System.out.println("人の数は" + Human04.HumanCount);
	}
	
	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
		System.out.println("人の数は" + Human04.HumanCount);
	}
}
