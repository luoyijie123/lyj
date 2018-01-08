package main;

/**
 * Created by 75293 on 2017/9/30.
 */
public class test {
    public static void main(String[] args){
        main a=new main();
        System.out.println("调用公有成员:"+a.a);
        System.out.println("调用保护成员:"+a.c);
        System.out.println("调用默认成员:"+a.d);

        a.test();
        a.test1();
        a.texs3();
    }
}
