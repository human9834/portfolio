package Portfolio1;

public class 値分岐 {

	public static void main(String[] args) {

//		①String型の変数strの値がABCの場合「値はABCです」と出力
		String str = "1";
		switch(str) {
		case "ABC" : 
			System.out.println("値はABCです");
			break;
		
//		②String型の変数strの値がDEFの場合「値はDEFです」と出力
		case "DEF" : 
			System.out.println("値はDEFです");
		    break;
		
//		③②の条件以外の場合に「それ以外です」と出力
		default : 
			System.out.println("それ以外です");
		}
		
	
	}

}
