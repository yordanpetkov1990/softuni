package TU_SOFIA_LABORATORNI_2KURS;

public class Student extends Person{
    private double grade;
    public Student(String name,int age,double grade){
        super(name,age);
        this.grade=grade;
    }
    @Override
    public void introduce(){
        System.out.println(super.getName() + " " + super.getAge() + " " +this.getGrade());
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + super.getName() + ",Age: " + super.getAge() + ",Grade: " + this.grade);
    }
}
