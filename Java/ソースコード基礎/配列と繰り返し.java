package Portfolio2;

public class 配列と繰り返し {

    public static void main(String[] args) {

        int[] ary = {10,11,12};
        System.out.println("配列の要素は" + ary.length);
        // ary.lengthで、配列が何個あるのかを確認できる
        for(int i = 0; i < ary.length; i++) {
            System.out.println("配列の値は" + ary[i]);
        }
    }
}   