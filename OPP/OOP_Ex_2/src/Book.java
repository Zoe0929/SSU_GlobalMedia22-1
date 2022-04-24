public class Book {
    String title;
    String author;
    void show(){System.out.print(title+" : "+author);}

    public Book(String title, String author){
        this.title=title; this.author=author;
    }
    public Book(String title){
        this.title=title;
        this.author="작가 미상";
    }
    public Book(){
        this("","");
        System.out.println("생성자가 호출됨.");
    }

    public static void main(String[] args) {
        Book book=new Book();
    }
}
