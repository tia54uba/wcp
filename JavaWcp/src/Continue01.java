
public class Continue01 {
	
	public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            if (count % 3 == 0) {
                // countが2の場合、この後の処理をスキップ
                continue;
            }
            System.out.println("Continue01 = " + count);
        }
    }
	
	

}
