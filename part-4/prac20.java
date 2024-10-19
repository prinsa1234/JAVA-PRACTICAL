class shape{
void printshap()
 {
   System.out.println("this is shape");
 }
}

class rectangle extends Prac23{
void printrectangle(){
System.out.println("this is rectanglr");
}
}
class circle extends Prac23{
    void printcircle(){
        System.out.println("this is rectangle");
        }
}
class square extends rectangle{
    void printsquare()
    {
        System.out.println("this is square");  
    }
}
public class prac20 {
    public static void main(String[] args) {
         square s1=new square();
         s1.printshap();
         s1.printrectangle();
    }
}
