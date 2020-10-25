package text3;

import java.util.Scanner;     
public class Test {
    public static void main(String[] args) {
        int flag = 1;
        Course s = null;
        while (flag == 1) {
            Scanner in = new Scanner(System.in);
            Course a = s;  
            Student w = new Student(2019310636, "胡翊翔", '男',a);
            System.out.println("学生信息");
            System.out.println(w);
            Teacher b = new Teacher(1, "张", '男', "java");
            Teacher c = new Teacher(2, "游", '男', "线代");
            Teacher d = new Teacher(3, "于", '女', "大物");
            System.out.println("教师信息");
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            Course e = new Course("java", 1, "202", 2, 2);
            Course f = new Course("线代", 2, "203", 2, 2);
            Course g = new Course("大物", 3, "305", 2, 4);
            System.out.println("课程信息");
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println("请输入1,2,3进行选课: ");
            int x = in.nextInt();
            if (x == 1) {
                a = e;
                System.out.println("已选课: " + e);
                System.out.println(b);
            } else if (x == 2) {
                a = f;
                System.out.println("已选课: " + f);
                System.out.println(c);
            } else if (x == 3) {
                a = g;
                System.out.println("已选课: " + g);
                System.out.println(d);
            } else {
                System.out.println("未查到课程");
            }
            Student n = new Student(2019310636, "胡翊翔", '男',a);
            System.out.println(n);

            System.out.println("请输入1,2,3进行退课: ");
            int y = in.nextInt();
            while (x == 1)  
                if (y == 1) {
                    a = null;
                    System.out.println("已退课: " + e);
                    System.out.println(b);
                    break;
                } else {
                    System.out.println("未查到已选该课程，无法退课");
                    s = e;
                    break;
                }

            while (x == 2)
                if (y == 2) {
                    a = null;
                    System.out.println("已退课: " + f);
                    System.out.println(c);
                    break;
                } else {
                    System.out.println("未查到已选该课程，无法退课");
                    s = f;
                    break;
                }

            while (x == 3)
                if (y == 3) {
                    a = null;
                    System.out.println("已退课: " + g);
                    System.out.println(d);
                    break;
                } else {
                    System.out.println("未查到已选该课程，无法退课");
                    s = g;
                    break;
                }
            Student o = new Student(2019310200, "胡翊翔", '男',a);
            System.out.println(o);

            System.out.println("输入1或者2选择继续选退课或者退出");
            int z = in.nextInt();
            while (z == 1) {
                System.out.println("继续选课");
                break;

            }
            while (z == 2) {
                flag = 0;
                System.out.println("退出");
                break;
            }
        }
    }
}
