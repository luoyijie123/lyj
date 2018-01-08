/**
 * Created by 75293 on 2017/11/5.
 */
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Random;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        try{
             File writename=new File("E:\\workplace\\FCFS\\data.txt");
             writename.createNewFile();//创建新文件
             BufferedWriter out = new BufferedWriter(new FileWriter(writename));
             int[] times={6,2,1,3,9};
             for(int i=0;i<100;i++){
                 out.write(i+1 + " "+i+" "+ times[random.nextInt(times.length)]+"\r\n");
             }
             out.flush();
             out.close();
        }catch (Exception e){
             e.printStackTrace();
        }
          FCFS fcfs=new FCFS();
          fcfs.initialize_task();

          for(int i=0;i<fcfs.getTasks().length;i++)
          {
              System.out.println(fcfs.getTasks()[i].getTaskID()+" "+fcfs.getTasks()[i].getArrivalTime()+" "+fcfs.getTasks()[i].getServiceTime());
          }
         fcfs.Incominglist();
         fcfs.dealtask();


    }
}
