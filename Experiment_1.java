// exp1 PROGRAM ON CLASSES AND OBJECT
// NAME: Aryan Khedekar
// UIN: 251P107
class Student{
    String uin = "251P107";
    String name = "Aryan Khedekar";

    void display(){
        System.out.println("UIN = "+uin);
        System.out.println("NAME = "+name);

    }
}

class Database{
    public static void main(String args[]){
        Student n1 = new Student();
        n1.display();
    }
}