package mypack1;
public class ClassA {
  public int var1;
  protected int var2;
  static int var3;
  private int var4;

  public void method(){
  var1=1;
  var2=1;
  var3=1;
  var4=1;

  ClassA a = new ClassA();
  a.var1=1;
  a.var2=1;
  a.var3=1;
  a.var4=1;
  }
  public void printA_data(){
    System.out.println("var1:"+var1);
  }
  public static int getNumber(){
    return var3;
  }
}
