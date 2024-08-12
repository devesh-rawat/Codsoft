package Task2;

import java.util.Scanner;

public class studentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("Student Grade Calculator");
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        int total=0;
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter Marks in Subject "+(i+1)+" : ");
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
       double per=(float)total/5;
        System.out.println("Total Marks : "+total);
        System.out.println("Percentage  : "+per);
       if(per>=90 && per<=100){

           System.out.println("Grade       : A");
       }else if(per>=75 && per<90){
           System.out.println("Grade       : B");
       }else if(per>=60 && per<75){
           System.out.println("Grade       : C");
       }else if(per>=45 && per<60){
           System.out.println("Grade       : D");
       }else if(per>=0 && per<45){
           System.out.println("Fail");
       }else{
           System.out.println("Invalid Input !!");
       }
    }
}
