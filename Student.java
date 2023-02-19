package Ch4;

public class Student {
    private String name;
    private int korean;
    private int english;

    public Student(String name, int korean, int english) {
        this.name = name;
        this.korean = korean;
        this.english = english;
    }

    public void print(){
        System.out.println("이름 : "+ name);
        System.out.println("국어 : "+ korean);
        System.out.println("영어 : "+ english);
        System.out.println();
    }
}
