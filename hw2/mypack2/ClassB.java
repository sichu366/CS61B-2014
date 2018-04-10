package mypack2;
import mypack1.*;
class ClassB {
  public void method(){
    //ClassA a = new ClassA();
    //a.var1=1;
    //a.printA_data();
    //a.var2=1; //此行出错
    int tencentdata = ClassA.getNumber();
    System.out.println("tencentdata:" + tencentdata);
    boolean isLeap = Date.isLeapYear()
  }
  public static void main(String[] args) {
    System.out.println("gh");
    ClassB b = new ClassB();
    b.method();
  }
}
