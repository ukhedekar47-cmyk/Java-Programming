// EXP.2: Programs on method oveerloading and constructor overloading
// NAME: Aryan Khedekar
// UIN: 251P107
public class Calculation{

    void add(int a){
        System.out.println("A VALUE = "+a);

    }

    void add(int a, int b){
        System.out.println("A VALUE = "+a);
        System.out.println("B VALUE = "+b);

    }
    

    void add(int a, int b, int c){
        System.out.println("A VALUE = "+a);
        System.out.println("B VALUE = "+b);
        System.out.println("C VALUE = "+c);

    }

    
}


class Calculator{
    public static void main(String args[]){
        Calculation c1 = new Calculation();
        c1.add(100);
        c1.add(123, 456);
        c1.add(700, 300, 600);
    }
}
