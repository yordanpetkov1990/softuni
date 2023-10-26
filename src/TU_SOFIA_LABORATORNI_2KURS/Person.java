package TU_SOFIA_LABORATORNI_2KURS;

public class Person implements Printable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println(this.name + " " + this.age);
    }
    @Override
    public void printDetails() {
        System.out.println("Name: " + this.name + ",Age: " + this.age);
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


}
