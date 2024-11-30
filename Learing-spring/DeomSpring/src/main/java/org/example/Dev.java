package org.example;

public class Dev {
    private  Computer computer;

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(){

        System.out.println("Starting");
    }
    public Dev(int age){
        this.age=age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void build() {
        System.out.println("Building Dev");
        computer.compile();
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
}
