/**
 * Created by 75293 on 2017/10/14.
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        //super();
        prepare();
        bake();
        cut();
        box();
        System.out.println("PepperoniPizza制作完成");
    }

    @Override
    public void prepare() {
        System.out.println("PepperoniPizza正在准备材料中");
        System.out.println("准备完成");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza正在烘培中");
        System.out.println("烘培完成");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza正在切割中");
        System.out.println("切割完成");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza正在包装中");
        System.out.println("包装完成");
    }
}
