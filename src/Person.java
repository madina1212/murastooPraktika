public class Person {
  private   String name;
   private String surNAme;
   private int age;
  private   String cloThes;
  private   int expeRience;
  private int salary;

    public Person(String name, String surNAme, int age, String cloThes, int expeRience, int salary) {
        this.name = name;
        this.surNAme = surNAme;
        this.age = age;
        this.cloThes = cloThes;
        this.expeRience = expeRience;
        this.salary = salary;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurNAme() {
        return surNAme;
    }

    public void setSurNAme(String surNAme) {
        this.surNAme = surNAme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCloThes() {
        return cloThes;
    }

    public void setCloThes(String cloThes) {
        this.cloThes = cloThes;
    }

    public int getExpeRience() {
        return expeRience;
    }

    public void setExpeRience(int expeRience) {
        this.expeRience = expeRience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void  work(){
        System.out.println(getSalary());

    }
    public  void  wear(){
        System.out.println("The color of the police uniform is black");
        System.out.println("Children's doctor costume - white and blue t-shirt");
        System.out.println("The color of the firefighter's uniform is red");
    }
}
