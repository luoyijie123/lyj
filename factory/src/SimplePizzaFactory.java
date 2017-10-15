/**
 * Created by 75293 on 2017/10/14.
 */
public class SimplePizzaFactory {
    public String type;
    public SimplePizzaFactory(String type){
        this.type=type;
    }
    public  Pizza createPizza(){
        if(type=="CheesePizza"){
            return new CheesePizza();
        }
        else if(type=="ClamPizza"){
            return new ClamPizza();
        }
        else if (type=="PepperoniPizza"){
            return new PepperoniPizza();
        }
        return null;
    }
}
