/**
 * Created by 75293 on 2017/9/30.
 */
public class main {
    public static void main(String[] args){
        int a=0;
        int b=0;
        int c=0;
        for(int i=100;i<1000;i++){
            a=i/100;
            b=(i-(100*a))/10;
            c=i-(100*a)-(10*b);
            if((a*a*a)+(b*b*b)+(c*c*c)==i)
            {
                System.out.println(i+"为水仙花数");
            }
        }
    }
}
