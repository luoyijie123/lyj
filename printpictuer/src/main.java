/**
 * Created by 75293 on 2017/9/30.
 */
public class main {
    public static void main(String[] args){
        //int i;
        int num=3;
        for(int i=1;i<=4;i++) {
           //System.out.print("    ");
            for(int k=num;k>0;k--){
                System.out.print(" ");
            }
            for (int j = 0; j < i + i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            num--;
        }
          num=1;
        for(int i=3;i>0;i--){
            for(int k=num;k>0;k--){
                System.out.print(" ");
            }
            for (int j = 0; j < i + i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            num++;
        }
    }
}
