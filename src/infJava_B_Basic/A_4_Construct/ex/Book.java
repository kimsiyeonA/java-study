package infJava_B_Basic.A_4_Construct.ex;

// 문제 - Book 과 생성자 - 참조 클래스

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    // TODO 코드를 완성하세요.

    Book(){
        this("","",0);
    }

    Book(String title, String author){
        this(title, author, 0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }

}
