package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		byte byteNum = 10 ;
		short shortNum = 100;
		int intNum = 1000;
		long longNum = 10000;
		float floatNum = 9.5f;
		double doubleNum = 10.5;
		char letter = 'a';
		String letters = "ハロー";
		boolean isBoolean = true;
		
		System.out.println(byteNum+shortNum+intNum+longNum);
		System.out.println(byteNum*2);
		System.out.println(letter+letters+isBoolean);
		System.out.println(byteNum+shortNum+intNum+longNum+floatNum+doubleNum);
		System.out.println(byteNum*shortNum*intNum*longNum);
		System.out.println(doubleNum/shortNum);
		System.out.println(byteNum-shortNum);
		
		
		String name = "山田太郎";
		System.out.println("こんにちは、"+name+"さん！");
		
		
		int age = 25;
		System.out.println("年齢："+age+"歳");
		
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		
		int score = 80;
		score = score +20;
		System.out.println("最終スコア:"+score);
		
		double price =99.99;
		int priceInt = (int)price;
		System.out.println("整数価格："+priceInt);
		
		String numStr = "123";
		int numInt = Integer.parseInt(numStr);
		System.out.println(numInt+":"+numStr+10);
		
		int num = 50;
		String numString = String.valueOf(num);
		System.out.println("得点:"+numString+"点");
		
		int a = 10;
		int b = 20;
		boolean result = a < b;
		System.out.println(result);
		
		int x = 15;
		String resultX = (x >= 10) ? "OK" : "NG" ;
		System.out.println(resultX);
		
		String text = "私はJavaが好きです。Javaは楽しい！";
		String replace = text.replace("Java", "Python");
		System.out.println(replace);

	}

}
