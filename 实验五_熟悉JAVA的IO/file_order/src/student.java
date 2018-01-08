import java.io.Serializable;

public class student implements Serializable,Comparable<student>{
    //public static long a=123012015000L;
    private long studentID;
    private String name;
    private String sex;

    public long getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public int compareTo(student o) {
        //return this.studentID-o.studentID;
        if(this.studentID<o.studentID){
            return -1;
        }
        else {
            return 1;
        }

    }
}

