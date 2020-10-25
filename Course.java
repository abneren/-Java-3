package text3;

public class Course {
	int number;
    String Coursename;
    String place;
    float time;
    float score;


    public Course(String coursename, int number, String place, float time, float score) {
        this.Coursename = coursename;
        this.number = number;
        this.place = place;
        this.time = time;
        this.score = score;

    }

    public String toString() {
        return   Coursename+    "(课程信息)" + "     课程编号：" + number + "   上课地点：" + place
                + "    课程时间：" + time + "小时" + "     课程学分：" + score + "分";
    }
}
