package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;
	
	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー";
	}
	
//	string型の戻り値を返す引数なしのメソッドを定義
	public String getProfile() {
		return "年齢は" + this.age + "、職業は" +this.profession;
	}
	
//	greet→挨拶
//	String型のfriendという変数を作る
	public void greet(String friend) {
		if (friend == null) {  //string型はnullの場合があるのでチェックする	
			System.out.println("挨拶する友達が分かりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
