import java.util.*;
public class salaryslip {
    private String a;
    private int b;
    private float c;
    private float hra;
    private float da;
    private float ta;
    private float ma;
    private float pf;
    private float gs;
    public void takeinput()
    {
        Scanner vanshika=new Scanner(System.in);
        System.out.println("enter name");
        a=vanshika.nextLine();
       System.out.println("enter Id");
       b=vanshika.nextInt();
       System.out.println("enter basic salary");
        c=vanshika.nextFloat();
    }
    public void calculations()
    {
        hra=50*c/100;
        da=15*c/100;
        ta=20*c/100;
        ma=20*c/100;
        pf=5*c/100;
        gs=c+hra+da+ta+ma;
    }
    public void print()
    {
        System.out.println("SALARY SLIP:");
        System.out.println("ID= "+b);
        System.out.println("Name:"+a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase());
        System.out.println("HOUSE RENT ALLOWANCE= "+hra);
        System.out.println("DEARANCE ALLOWANCE= "+da);
        System.out.println("TRAVEL ALLOWANCE= "+ta);
        System.out.println("MEDICAL ALLOWANCE= "+ma);
        System.out.println("PROVIDENT FUND= "+pf);
        System.out.println("GROSS SALARY= "+gs);
        float tax;
       if(c>500000)
       {
            tax=10*c/100;
            System.out.println("TAX= "+tax);
       }
       else if(c>700000)
       {
           tax=20*c/100;
           System.out.println("TAX= "+tax);
       }
       else if(c>900000)
       {
           tax=30*c/100;
           System.out.println("TAX= "+tax);
       }
       else
       {
           System.out.println("No tax on salary less than 500000");
       }
    }
   public static void main(String[] args) {
      salaryslip obj=new salaryslip();
      obj.takeinput();
      obj.calculations();
      obj.print();
   } 
}
