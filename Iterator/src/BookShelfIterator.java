
/**
 * BookShelfクラスのスキャンを行うクラス
 * @author jun
 *
 */
public class BookShelfIterator implements Iterator {

	/** iteratorがスキャンする本棚 */
	private BookShelf bookShelf;
	/** 現在注目している本を指す添え字 */
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	/**
	 * Iteratorと本の冊数を比べる
	 */
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 現在注目している本を返し、さらに次へ進めるためのメソッド
	 */
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
