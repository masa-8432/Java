package classMethod.human;

public class Human05 {
	
//	変数宣言、private変数なので直接参照できない
	private String name;
	private int age;
	
//	ここで参照できるように作る
	public Human05() {
		name = "山田";
		age = 20;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
