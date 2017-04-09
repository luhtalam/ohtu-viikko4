/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

/**
 *
 * @author luhtalam
 */
public class Course {
    private String name;
    private String term;
    private int week1;
    private int week2;
    private int week3;
    private int week4;
    
    public int[] getWeeks() {
        int w[] = {week1,week2,week3,week4};
        return w;
    }
    
    @Override
    public String toString() {
        return name + ", " + term;
    }
}
