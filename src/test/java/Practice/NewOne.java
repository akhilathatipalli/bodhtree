package Practice;

public class NewOne {

       public static void main (String args[]) {
           exp();
           NewOne n1=new NewOne();
            n1.add();
            bottle();
          // NewOne n2=new NewOne();
            n1.pens();
       }
       static void exp(){
           int age=30;
           String name="AAA";
           System.out.println("name AAA and age 30");
       }
       private void add(){
           int a=1,b=4,c;
           c=a+b;
           System.out.println(c);

       }
       static void bottle(){
           String colour="red";
           System.out.println(colour);
       }
       protected void pens(){
          int p=5;
          System.out.println("number of pens are"+p);
       }
   }











