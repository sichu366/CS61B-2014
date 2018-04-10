import java.io.*;

class show{

  private int id;
  private int number;
  static int count = 0;

  show(int id_p,int num_s){
    id = id_p;
    number = num_s;
    count++;
  }
  static void print_count(){
    System.out.println("this class has " + count + " objects");
  }
  public int getNumber(){
    return this.number;
  }
  public static boolean isGoodNumber(int num){
    if(num > 0){
      return true;
    }
    return false;
  }
  public void print_show(){
    show s1 = new show(1,2);
    s1.print_count();
    System.out.println("id:" + this.id + " num:" + this.number);
  }

  public static void main(String[] args){
    //System.out.println(args[0]);
    //System.out.println(args[1]);
    System.out.println("hello");
    //show s = new show();
    show s1 = new show(1,2);
    s1.print_show();
    show s2 = new show(3,4);
    s2.print_show();
    System.out.println(isGoodNumber(s2.number));
    s2.print_count();

  }
}
