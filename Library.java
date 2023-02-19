package Ch4;

import java.util.List;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void borrow(List<Book> books, int number){
        if(books.get(number).isBorrowed()==false){
            System.out.println("정상적으로 대여가 완료되었습니다.");
            books.get(number).setBorrowed(true);
        }else {
            System.out.println("대여 중인 책은 대여할 수 없습니다.");
        }
    }


    public void printState(){
        for (int i=0;i<books.size();i++){
            System.out.println( (i+1)+". "+books.get(i).getName()+" -"+books.get(i).printBorrow());

        }
    }
}