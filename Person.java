package Ch4;

public class Person {
    private String name;
    private int age;
    private boolean college;
    private double weight;

    public void printInfo(){
        System.out.println("이름: "+ getName());
        System.out.println("나이: "+ getAge());
        System.out.println("대학생인가요? : "+ isCollege());
        System.out.println("몸무게: "+ getWeight());
    }
    public Person(String name, int age, boolean college, double weight) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isCollege() {
        return college;
    }

    public double getWeight() {
        return weight;
    }
}
