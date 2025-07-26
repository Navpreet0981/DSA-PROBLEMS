package JAVA_FEATURES;

public class MyGeneric {
//
    public static void main(String[] args) {
        Displayer<Integer> obj1 = new Displayer<>();
        obj1.setNum(20);
        obj1.display();

        Displayer<Double> obj2 = new Displayer<>();
        obj2.setNum(20.0);
        obj2.display();
    }
}
class Displayer<T>{
    T num;
    public void setNum(T num){
        this.num = num;
    }
    public void display(){
        System.out.print("Element:- " + num);
    }
}