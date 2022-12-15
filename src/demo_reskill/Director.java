package demo_reskill;

public class Director extends Employee implements AbstractCommonMethod<Director>{

    String name = "Alex";

    int age;

    @Override
    public int getRank() {
        return 10;
    }

    public static void main(String[] args) {
        Director d = new Director();
        d.changeNameToJohn(d);

        System.out.println(d.getName());

        int aOutSide = 7;
        aOutSide = d.changeSth(aOutSide);

        System.out.println(aOutSide);
    }

    public void changeNameToJohn(Director director){
        director.setName("John");
    }

    public int changeSth(int a){
        return a *3;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Director generateRandom() {
        return null;
    }

    @Override
    public void doSomething(Director param) {

    }

    @Override
    public void saveToDb(Director director) {

    }
}
