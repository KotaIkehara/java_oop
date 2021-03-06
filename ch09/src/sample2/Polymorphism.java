package sample2;

public class Polymorphism {
	public static void main(String[] args) {
		Bar bar = new Bar();
		Baz baz = new Baz();
		useAny(bar); // Barクラスのインスタンスを使う
		useAny(baz); // Bazクラスのインスタンスを使う
	}

	public static void useAny(Foo foo) {
		foo.show();
	}

}