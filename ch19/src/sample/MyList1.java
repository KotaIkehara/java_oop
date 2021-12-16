package sample;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import jp.kwebs.Input;

public class MyList1 {
	// リストアップを実行
	public static void main(String[] args) {
		List<Book> list = Arrays.asList(
				new Book("120", "german", "Janssen", LocalDate.of(2017, 9, 18), 1500),
				new Book("310", "japanese", "田中宏", LocalDate.of(2018, 3, 5), 5500),
				new Book("400", "english", "Alcott", LocalDate.of(2018, 2, 11), 4500),
				new Book("100", "japanese", "森下花", LocalDate.of(2018, 1, 10), 2200),
				new Book("410", "english", "Hunter", LocalDate.of(2017, 12, 1), 5500));

		// 
		int price = Input.getInt("価格上限");
		listup(list, book -> book.getPrice() <= price);
	}

	// リストアップメソッド
	public static void listup(List<Book> list, Predicate p) {
		for(Book book : list) {
			if(p.test(book)) {	// インタフェースのメソッドで判定する
				System.out.println(book);
			}
		}
	}

	
}
