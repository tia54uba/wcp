
public class ClassMethod01 {
	
	public static void main(String[] args) {
        Human01 yamamoto = new Human01(); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + yamamoto.name + "で、年齢は" + yamamoto.age + "です。");

        Human01 saito = new Human01("斉藤", 28); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + saito.name + "で、年齢は" + saito.age + "です。");
    }

}
