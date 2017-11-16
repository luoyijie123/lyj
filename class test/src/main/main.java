package main;

/**
 * Created by 75293 on 2017/9/30.
 */
public class main {
     public int a=10;
     private int b=20;
     protected int c=30;
     int d=40;

     public void test1(){
         System.out.println("调用公有方法");
     }
     private void test2(){
         System.out.println("调用私有方法");
     }
     protected void texs3(){
         System.out.println("调用保护方法");
     }
      void test(){
         System.out.println("调用默认方法");
     }

}
