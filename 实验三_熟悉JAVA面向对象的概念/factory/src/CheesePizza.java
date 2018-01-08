/**
 * Created by 75293 on 2017/10/14.
 */
public class CheesePizza extends Pizza {
    public  CheesePizza(){
        prepare();
        bake();
        cut();
        box();
        System.out.println("CheesePizza制作完成");
    }

    @Override
    public void prepare() {
        System.out.println("CheesePizza正在准备材料中");
        System.out.println("准备完成");
    }


    @Override
    public void bake() {
        System.out.println("CheesePizza正在烘培中");
        System.out.println("烘培完成");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza正在切割中");
        System.out.println("切割完成");
    }


    @Override
    public void box() {
        System.out.println("CheesePizza正在包装中");
        System.out.println("包装完成");
    }

}
