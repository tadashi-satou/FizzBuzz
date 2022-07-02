
public class FizzBuzz {
	public static void main(String[] args) {
		//1から100までの数値をループで処理する
        for (int number = 1; number <= 100; number++) {
    		if (number % 3 == 0 && number % 5 == 0) {
    			//3と5で割り切れたら「FizzBuzz」を出力
    			System.out.println("FizzBuzz");
    		}else if(number % 3 == 0) {
    			//3で割り切れたら「Fizz」を出力 System.out.println("Fizz");
    		}else if(number % 5 == 0) {
    			//5で割り切れたら「Buzz」を出力
    			System.out.println("Buzz");
    		}else {
    			//上記以外はそのまま「number」を出力
    			System.out.println(number);
    		}        
        }
	}
}
