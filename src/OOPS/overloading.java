package OOPS;
public class overloading {
    public int add(int a,int b){
        return a+b;
        
    }
    public double add(double a, double b){
        return a+b;
    }
    public void displayInfo(){
        System.out.println("");
        System.out.println();
    }
    public static void main(String[] args) {
        overloading m1 = new overloading();

        int sum1 = m1.add(2,5);
        System.out.println("Sum Of Integers:- "+sum1);
        double sum2 = m1.add(2.5,5.5);
        System.out.println("Sum Of Double:- "+sum2);
    }
}
