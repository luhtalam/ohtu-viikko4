package ohtu;

import java.util.ArrayList;

public class Submission {
    private String student_number;
    private int week;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private ArrayList<Integer> list;
    private int ENumb;
    

    public String getStudent_number() {
        return student_number;
    }
    
    public int getWeek() {
        return this.week;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getHours() {
        return hours;
    }

    public int getENumb() {
        return ENumb;
    }
    
    
    private boolean[] makeArray() {
        boolean e[] = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15};
        return e;
    }
    
    private void setExercises() {
        int n = 0;
        ArrayList<Integer> list = new ArrayList();
        boolean e[] = makeArray();
        for (int i = 0; i < 15; i++) {
            if(e[i]) {
                list.add(i+1);
                n++;
            }
        }
        this.list = list;
        ENumb = n;
    }

    @Override
    public String toString() {
        setExercises(); 
        String s = "tehtyjä tehtäviä yhteensä: " + ENumb
                + ", aikaa kului: " + hours + " tuntia"
                + ",  tehdyt tehtävät:";
        for (Integer integer : list) {
            s +=" "+ integer; 
        }
        return s;
    }
    
}