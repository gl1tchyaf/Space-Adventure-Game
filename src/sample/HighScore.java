package sample;

import java.io.*;
import java.lang.*;
import java.util.*;
class CreateFile2{
    private Formatter x;
    public void openFile(){
        try{
            x= new Formatter("Xd.txt");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    public void addRecords(){
        x.format("%d",10);
    }


    public void closeFile(){
        x.close();
    }
}
class readfile2{
    static int v;
    private Scanner x;

    public void openFile(){
        try{
            x=new Scanner(new File("Xd.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
    public void readFile(){

        int a= x.nextInt();
        System.out.println(a);
        v=a;
        System.out.println(v);
        if(v==10){
            System.out.println("xD");
        }

    }
    public void closeFile(){
        x.close();
    }
}

public class HighScore{
    public static void main(String[] args) {
        
    }
}
