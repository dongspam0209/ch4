package Ch4;

public class Book {

    private String name;
    private boolean isBorrowed;

    public Book(String name) {
        this.name = name;
        this.isBorrowed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String printBorrow(){
        if(isBorrowed()==false){
            return ("대여 가능");
        }else {
            return ("대여 중");
        }
    }

}