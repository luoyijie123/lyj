import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class student_list {
    private student[] students;
    private List<student> list=new ArrayList<student>();

    public student_list(){
        this.students=new student[40];
        for(int i=0;i<students.length;i++){
            this.students[i]=new student();
        }
    }

    public void init_students(String pathname){
        int i=0;
        try{
            Scanner in=new Scanner(new File(pathname));
            while(in.hasNextLine()){
            String str=in.nextLine();
            splitt(str,i);
            i++;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void splitt(String str,int i){
        String strr=str.trim();
        String[] abc=strr.split("[\\p{Space}]+");
        String str1=abc[0];
        String str2=abc[1];
        String str3=abc[2];
        students[i].setStudentID(Long.parseLong(str1));
        students[i].setName(str2);
        students[i].setSex(str3);
    }

    public void Incominglist(){
        for(int i=0;i<students.length;i++){
            list.add(students[i]);
        }
        Collections.sort(list);
    }

    public student[] getStudents() {
        return students;
    }

    public List<student> getList() {
        return list;
    }

    public void setStudents(student[] students) {
        this.students = students;
    }

    public void setList(List<student> list) {
        this.list = list;
    }
}
