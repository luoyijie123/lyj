import java.io.File;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class main {

    public static void main(String[] args){
        main m=new main();
        System.out.println("请输入文件目录");
        Scanner sc=new Scanner(System.in);
        String path=sc.nextLine();
        File f=new File(path);
        System.out.println(f.getName()+"("+"文件夹的最近修改日期为"+m.date_display(f)+")");

        m.tree(f,1);
    }
    //E:\
    public void tree(File f,int level){
        String preStr="";
        for(int i=0;i<level;i++){
            preStr +="   ";
        }

        File[] childs=f.listFiles();
        List<File> list=new ArrayList<File>();
        for(int i=0;i<childs.length;i++){
            list.add(childs[i]);
        }


        Collections.sort(list, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                if(o1.isDirectory() && o2.isFile())
                    return  -1;
                if(o1.isFile() && o2.isDirectory())
                    return 1;

                return o1.getName().compareTo(o2.getName());
            }
        });
        for(int i=0;i<list.size();i++){
            if(list.get(i).isDirectory()){
                System.out.println(preStr+list.get(i).getName()+" "+"("+"文件夹的最近修改日期为"+date_display(f)+")");
                tree(list.get(i),level+1);
            }
            else{
                System.out.println(preStr+list.get(i).getName()+"("+"文件的最近修改日期为"+date_display(f)+" "+"文件的大小为:"+childs[i].length()+")");
            }
        }
        list.clear();
    }

    public static String date_display(File f){
        java.text.SimpleDateFormat df=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateTime=df.format(new Date(f.lastModified()));
        return dateTime;
    }

}
