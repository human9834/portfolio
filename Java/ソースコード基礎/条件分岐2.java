package Portfolio1;

public class 条件分岐2 {

	public static void main(String[] args) {

//		①int型変数xが100以上の場合に「100以上です」と出力
		int x = 100;
		if(x >= 100) {
			System.out.println("100以上です");
			
//		②①の条件に加え、50以上の場合に「50以上、100未満です」と出力
		}else if(x >= 50) {
			System.out.println("50以上100未満です");
			
//		③②の条件意外の場合に「それ以外です」と出力
		}else{
			System.out.println("それ以外です");
		}
			
		
	}

}
