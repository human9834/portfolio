
package Portfolio2;

public class whileforまとめ {
	public static void main(String[] args) {
		
		for (int o = 0; o < 5; o++) {
			for(int j = 0; j < 5; j++)
				System.out.print("■ ");
			System.out.println();
		}

		boolean b = true;
		int i = 1;
		while(b) {
			if(i == 7) {
//				↓終わらせる
				break;
			}
			System.out.println("iの値は" + i);
			i++;
		}

		int[] ary = {1,2,3,19,100,26};
	    for(int num : ary) {
	    	if(num % 2 == 0) {
//	    		上記は2で割って0になった数字は出力という意味
	    		System.out.println("配列の値は" + num);
	    	}
	    }
	}
}