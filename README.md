## 判断闰年
    编写Java程序，输出从公元1990年到2007年所有
    闰年的年号，每输出两个年号换一行。判断年号是
    否为闰年的条件是：
     （1）若年号能被4整除，而不能被100整除，则是闰年；
      （2）若年号能被400整除也是闰年。    
    
        
            
                
                    
                        
                            
                                
                                    
 ## 百分制成绩转化为等级成绩
     实现方法ToGradeScore，将百分制成绩转化为等级成绩。要求对一组数据，实现批量转化。
     等级与百分制对照
     优：[90,100]
     良：[89,80]
     中：[79,70]
     及格：[69,60]
     不及格:[0,59]
    







## 打印图案
    利用for循环编写一个程序，将如下图案分别打印输
    出。
          *
         ***
        *****
       *******
        *****
         ***
          *


## 水仙花数
    编写程序找出所有的水仙花数；水仙花数是三位数，它的各位数字的立方和等于这个三位数本身。

  
    
    
## JAVA访问权限修饰符的掌握
    编写一个具有public、private、protected、default访问权限的数据成员和成员函数的class。为它产生一个对象并进行观：当你尝试取用所有class成员时、会     产生什么类型的编译消息。
    
    
## 单例模式——使用单例模式完成下面描述的类
    Choc-O-Holic公司有一个巧克力锅炉，用来把巧克力和牛奶融合在一起生产巧克力棒。定义这个巧克力锅炉类为ChocolateBoiler
    ChocolateBoiler有两个私有的成员变量，empty和bolied，用来判断锅炉是否为空，以及锅炉内混合物是否已煮沸。注意两个成员变量恰当的初始值。
    private boolean empty;
    private boolean boiled;
    ChocolateBoiler有三个方法来控制锅炉生产巧克力棒。
    public void fill() {…} 向锅炉填满巧克力和牛奶的混合物。首先要判断锅炉是否为空，只有空的锅炉才能填充巧克力和牛奶（填充过程打印一条语句即可）。填     充之后empty为false
    public void boil() {…} 将炉内煮沸。首先判断标志位，只有锅炉是满的，并且没有煮过，才能进行该操作（煮沸操作打印一条语句即可）。煮沸后boiled标志       位设置为true。
    public void drain() {…} 排出煮沸的巧克力和牛奶。首先要进行标志位判断，只有锅炉是满的，并且锅炉已经煮沸之后，才能排出混合物（排出混合物的动作       打印一条语句即可），排出混合物之后设置empty为true。
    isEmpty和isBoiled方法来获取empty和boiled标志位的值
    
 ## 附加：工厂模式练习
     类PizzaStore披萨商店要接收披萨订单生产披萨，其
     Public Pizza orderPizza(String type)根据披萨类型type完成披萨制作，并返回一个Pizza实例(实际上要返回一个其子类实例)。制作过程包括                  （pizza.prepare(); pizza.bake(); pizza.cut(); pizza.box()）
     Pizza是个抽象类，其有三个子类实现：CheesePizza,PepperoniPizza和ClamPizza。Pizza中的抽象方法有
     prepare();//准备材料
     bake();//烘焙披萨
     cut();//切割披萨
     box();//披萨装包
     SimplePizzaFactory是一个披萨对象生成“工厂”，根据不同的type生成不同的Pizza实例（其实是 CheesePizza,PepperoniPizza, ClamPizza 中的一种）。        利用public Pizza createPizza(String type)方法生成具体的Pizza实例，如果type是”cheese”生成CheesePizza，是”pepperoni”生成PepperoniPizza，      是”clam”生成ClamPizza。
     PizzaStore的构造函数需要传入SimplePizzaFactory实例，并且在orderPizza方法中利用SimplePizzaFactory实例首先生成一个具体的Pizza子类实例，然后        进行披萨生产，包括pizza.prepare; pizza.bake(); pizza.cut(); pizza.box()，最后返回该Pizza子类实例。




            
                
                    
                    
