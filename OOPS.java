import java.util.*;

public class OOPS {
    /*public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }*/

    /*public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Pragya";
        myAcc.setPassword("abcdefg"); 
        System.out.println(myAcc.username);
        System.out.println(myAcc.password);
    }*/

    /*public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Becky";
        System.out.println(s1.name);
        s1.roll = 456;
        System.out.println(s1.roll);
        s1.password = "abcd";
        System.out.println(s1.password);
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
    }*/

    /*public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }*/

    /*public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }*/

    /*public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1, 2, 3));
    }*/

    /*public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }*/

    /*public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }*/

    /*public static void main(String[] args) {
        Mustang myHorse = new Mustang();
    }*/

    /*public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }*/

    /*public static void main(String[] args) {
        Bear b = new Bear();
        b.eats();
    }*/

    /*public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "OPJS";
        System.out.println(s1.schoolName);
        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }*/

    /*public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }*/

    public static void main(String[] args) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }

}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    Student(){
    }
    Student(Student s1){
    this.name = s1.name;
    this.roll = s1.roll;
    this.password = s1.password;
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        super.color = "brown";
        System.out.println("horse constructor called");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}

class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}

class Dog extends Mammal{
    String breed;
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}

interface Herbivore{
    void eats();
}

interface Carnivore{
    void eats();
}

class Bear implements Herbivore, Carnivore{
    public void eats(){
        System.out.println("eats plants and flesh");
    }
}

class Complex{
    int real;
    int imag;
    public Complex(int r, int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real), (a.imag+b.imag));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)), ((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(real!=0 && imag==0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}