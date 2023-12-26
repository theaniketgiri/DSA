import java.util.*;
public class oops1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.Name = "Aniket";
        s1.MObile_No = "902811753";
        s1.Roll_no = sc.nextInt();
        s1.printMobileno();
        s1.printName();
        s1.printRollno();
    }
}

class Student{
    int Roll_no ;
    String Name ;
    String MObile_No ;
    
    public void printRollno(){
        System.out.println(this.Roll_no);
    }
    public void printName(){
        System.out.println(this.Name);
    }
    public void printMobileno(){
        System.out.println(this.MObile_No);
    }
    // Non peremetrized constructor
    Student(){
        System.out.println("Constructor Called");
    }
}
