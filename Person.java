// Assignment 7
// 26 September 2022

public class Person {
    protected int age;
    protected String name;
    protected String gender;

    public Person(Person p) {
        this(p.name, p.age, p.gender);
    }
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
}
