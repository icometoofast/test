package entities;

public class Person {
    public  String name;
    protected boolean sex ;//1 为男，0为女
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    protected Person(boolean sex) {
        this.sex = sex;
    }

    private Person(int age) {
        this.age = age;
    }

    public Person(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
       System.out.println("i am eating");
    }

    protected void sleep(){
        System.out.println("i am sleeping");
    }

    private void speak(){
        System.out.println("i am speaking");
    }

    private String hasmoney(String name,int money){
        String words = name + " has "+money +" yuan";
        return words;
    }



}
