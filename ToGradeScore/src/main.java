/**
 * Created by 75293 on 2017/9/30.
 */
public class main {

    public static void main(String[] args) {
        int score[] = {100, 91, 81, 71, 61, 51, 41, 31, 21, 11};
        main a=new main();
        a.ToGradeScore(score);
    }
    public void ToGradeScore(int num[]) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 90 && num[i] <= 100){ System.out.println(num[i] + "为优秀成绩");}
            else if (num[i] >= 80 && num[i] <= 89){ System.out.println(num[i] + "为良好成绩");}
            else if (num[i] >= 70 && num[i] <= 79){ System.out.println(num[i] + "为中等成绩");}
            else if (num[i] >= 60 && num[i] <= 69){ System.out.println(num[i] + "为及格成绩");}
            else if (num[i] >= 0 && num[i] <= 59){ System.out.println(num[i] + "为不及格成绩");}
        }
    }
}


