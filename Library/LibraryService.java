package Library;

import java.util.ArrayList;

public interface LibraryService {
	void addBook(Book book);//책 추가
	void searchBook(String keyword);//도서 검색
	void removeBook(String isbn);//도서 삭제
	ArrayList<Book> getAllBooks();//도서 전체 조회

}
