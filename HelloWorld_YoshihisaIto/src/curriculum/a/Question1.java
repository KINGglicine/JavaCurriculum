package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		byte byteNum = 0 ;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0L;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;
		
		byteNum = 10 ;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
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
		System.out.println(numStr+":"+numInt+10);
		
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
