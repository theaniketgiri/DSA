// There are teo type of poly,... 1; complie time 2; Run time 

public class polymorphism {
    public static void main(){
        
    }
}
class Student{
    int Roll_no ;
    String Name ;
    String MObile_No ;
    
    public void printInfo(int Roll_no){
        System.out.println(this.Roll_no);
    }
    public void printInfo(String Name){
        System.out.println(this.Name);
    }
    public void printInfo(){
        System.out.println(this.MObile_No);
    }
    // Non peremetrized constructor
    Student(){
        System.out.println("Constructor Called");
    }
}
