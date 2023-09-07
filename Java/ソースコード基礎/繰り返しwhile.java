package Portfolio2;

public class 繰り返しwhile {

	public static void main(String[] args) {

		int i = 0;
		while(i < 5) {
			System.out.println("iの値は" + i);
			i++;
		}
//		下の数値は1以上にしておかないと、０で掛け算しても永遠に０になるので注意。
		int h = 1;
		while(h < 50) {
			System.out.println("hの値は" + h);
			h = h * 2;
		}
//		出力までの記述だったら無限ループになる
		boolean b = true;
		while(b) {
			System.out.println("bの値は" + b);
//	　　以下で無限ループを終わらせる(1回で終わる)
			b = false;
		}
	}

}
