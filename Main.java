package Ch4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library(Arrays.asList(
                new Book("클린코드(Clean Code)"),
                new Book("객체지향의 사실과 오해"),
                new Book("테스트 주도 개발(TDD)")
        ));
        while (true) {
            System.out.println("대여할 책의 번호를 입력하세요.");

            library.printState();

            int number = scanner.nextInt()-1;

            library.borrow(library.getBooks(), number);


        }
    }
}