
public class If01 {
	public static void main(String[] args) {
		int number = 5;
		if (number < 5) {
			System.out.println(number + "は5未満です");
		}
		if (number < 10) {
			System.out.println(number + "は10未満です");
		}
		if (number < 15) {
			System.out.println(number + "は15未満です");
		}
		
		int val = 2;
		switch(val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("普通でした！");
			break;
		default:
			System.out.println("頑張ろう！");
		}
		
		int num = 12;
		if (num <= 5) {
			System.out.println("とても近いです");
		} else if(num <= 10) {
			System.out.println("近いです");
		} else if(num <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String color = "blue";
		switch(color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
