/**
 * Created by 75293 on 2017/9/30.
 */
public class main {
    public static void main(String[] args){
        int j=0;
        for(int i=1990;i<2008;i++){
            if(i%4==0 && i%100!=0){
                System.out.print(i+"年是闰年");
                System.out.print("  ");
                j++;
            }
            else if(i%400==0){
                System.out.print(i+"年是闰年");
                System.out.print("  ");
                j++;
            }
            //else{
               // System.out.print(i+"年不是闰年");
           // }

            if(j==2){
                System.out.println();
                j=0;
            }
        }

    }
}
