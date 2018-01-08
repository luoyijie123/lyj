import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;

public class main {

    public static void main(String[] args) throws IOException{
        String data="";
        String read="";
        System.out.println("请输入数据");
        InputStreamReader is =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(is);
        try{
            data=br.readLine();
            //System.out.println("所输入的数据" + data);
       }catch (IOException e){
            e.printStackTrace();
       }
       try{
           File writername=new File("E:\\workplace\\base_io\\src.txt");
           writername.createNewFile();
           BufferedWriter out =new BufferedWriter(new FileWriter(writername));
           out.write(data);
           out.flush();
           out.close();
       }catch (Exception e){
             e.printStackTrace();
       }

       FileWriter fw=new FileWriter("E:\\workplace\\base_io\\dest.txt");
       FileReader fr=new FileReader("E:\\workplace\\base_io\\src.txt");
       int ch;
       while((ch=fr.read())!=-1){
           fw.write(ch);
       }
       fw.close();
       fr.close();

       try{
           Scanner in=new Scanner(new File("E:\\workplace\\base_io\\dest.txt"));
           while(in.hasNextLine()){
               read=in.nextLine();
           }
       }catch (IOException e){
           e.printStackTrace();
       }
       System.out.println(read);
    }
}
