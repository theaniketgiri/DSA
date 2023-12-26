
public class oops{
    public static void main(String arg[]){
        
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "Gel";
        pen1.write();
        
        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Gel";
        pen2.write();

        pen1.printColor();
        pen2.printColor();
        
    }
}


class Pen{
        String color;
        String type;
    
        public void write(){
            System.out.println("Write something");
        }
    
        public void printColor(){
            System.out.println(this.color);
        }
    
        public void printType(){
            System.out.println(this.type);
        }
    
}