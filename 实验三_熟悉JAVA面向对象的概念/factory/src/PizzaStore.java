/**
 * Created by 75293 on 2017/10/14.
 */
public class PizzaStore {
    public Pizza orderPizza(String type){
        SimplePizzaFactory factory=new SimplePizzaFactory(type);
        return factory.createPizza();
    }
    public static void main(String[] args){
        String a="CheesePizza";
        String b="ClamPizza";
        String c="PepperoniPizza";
        PizzaStore pizzaStore = new PizzaStore();
        System.out.println("顾客一订购"+a);
        pizzaStore.orderPizza(a);
        for(int i=0;i<3;i++){
            System.out.println();
        }
        System.out.println("顾客二订购"+b);
        pizzaStore.orderPizza(b);
        for(int i=0;i<3;i++){
            System.out.println();
        }
        System.out.println("顾客三订购"+c);
        pizzaStore.orderPizza(c);
    }
}
