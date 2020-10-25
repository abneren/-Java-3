package text3;

public class Student extends Personnel {
    public Student(int number, String name, char sex,Course a){
        super(number,name,sex);
        this.a = a;
    }
    public String toString(){
        return  "\n" + "Student(学生信息):  姓名：" + name
                + "    学号：" + number + "   性别：" + sex + "\n" + "所选课程信息:   " + a;
    }
    }
