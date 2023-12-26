public class oops3{
    public static void main(String arg[]){
        Student s1= new Student();
        PrintInfo("Aniket" , 18);
    }
}

class Student{
    String name;
    int RollNo;
    String MObile ;
    public static void PrintInfo(String name, int RollNo ){
        System.out.println(name);
        System.out.println(RollNo);
    }
}
