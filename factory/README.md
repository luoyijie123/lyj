   ����ģʽ��ϰ
��PizzaStore�����̵�Ҫ������������������������
Public Pizza orderPizza(String type)������������type�������������������һ��Pizzaʵ��(ʵ����Ҫ����һ��������ʵ��)���������̰�����pizza.prepare(); pizza.bake(); pizza.cut(); pizza.box()��
Pizza�Ǹ������࣬������������ʵ�֣�CheesePizza,PepperoniPizza��ClamPizza��Pizza�еĳ��󷽷���
prepare();//׼������
bake();//�決����
cut();//�и�����
box();//����װ��
SimplePizzaFactory��һ�������������ɡ������������ݲ�ͬ��type���ɲ�ͬ��Pizzaʵ������ʵ�� CheesePizza,PepperoniPizza, ClamPizza �е�һ�֣�������public Pizza createPizza(String type)�������ɾ����Pizzaʵ�������type�ǡ�cheese������CheesePizza���ǡ�pepperoni������PepperoniPizza���ǡ�clam������ClamPizza��
PizzaStore�Ĺ��캯����Ҫ����SimplePizzaFactoryʵ����������orderPizza����������SimplePizzaFactoryʵ����������һ�������Pizza����ʵ����Ȼ�������������������pizza.prepare; pizza.bake(); pizza.cut(); pizza.box()����󷵻ظ�Pizza����ʵ����
