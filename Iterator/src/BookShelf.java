/**
 * 本棚クラス
 * @author jun
 *
 */
public class BookShelf implements Aggregate {

	private Book[] books;
	private int last = 0;

	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	/**
	 * 本のタイトルを取得
	 * @param index 配列のインデックス
	 * @return index番目の本
	 */
	public Book getBookAt(int index) {
		return books[index];
	}
	/**
	 * 本の追加
	 * @param book
	 */
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}

	/**
	 *本の冊数を取得
	 * @return 本の冊数
	 */
	public int getLength() {
		return last;
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
