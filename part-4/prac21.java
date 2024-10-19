class Degree
{
    void getdegree()
    {
      System.out.println("I got a degree");
    }
}
class undergraduate extends Degree{
    void getundergraduate()
    {
    System.out.println("I am undergraduate");
    }
}
class postgraduate extends Degree{
    void getundergraduate()
    {
    System.out.println("I am postgraduate");
    }
}
public class prac21 {
    public static void main(String[] args) {
        Degree d1=new Degree();
        //d1.getdegree();
        undergraduate u1=new undergraduate();
        u1.getundergraduate();
        
         postgraduate p1=new  postgraduate();
      p1.getundergraduate();
        
    }
}
