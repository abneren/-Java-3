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
        return   Coursename+    "(�γ���Ϣ)" + "     �γ̱�ţ�" + number + "   �Ͽεص㣺" + place
                + "    �γ�ʱ�䣺" + time + "Сʱ" + "     �γ�ѧ�֣�" + score + "��";
    }
}
