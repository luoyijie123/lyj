import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException,Exception {
        student_list s_list=new student_list();
        s_list.init_students("E:\\workplace\\file_order\\list.txt");
        s_list.Incominglist();
        SerializeList(s_list.getList());
        List<student> list1=new ArrayList<student>();
        list1=DeserializeList();
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i).getStudentID()+" "+list1.get(i).getName()+" "+list1.get(i).getSex());
        }
    }

    public static void SerializeList(List<student>list) throws FileNotFoundException,IOException{//序列化学生列表
        ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream(new File("E:\\workplace\\file_order\\student.adt")));
        student[] s=new student[list.size()];
        list.toArray(s);
        oo.writeObject(s);
        System.out.println("学生列表对象序列化成功");
        oo.close();
    }

    public static List<student> DeserializeList() throws Exception,IOException{//反序列化学生列表
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("E:\\workplace\\file_order\\student.adt")));
        student[] s=(student[])ois.readObject();
        List<student> list=new ArrayList<student>();
        list= Arrays.asList(s);
        System.out.println("学生列表对象反序列化成功");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getStudentID()+" "+list.get(i).getName()+" "+list.get(i).getSex());
        }
        return list;
    }
}
