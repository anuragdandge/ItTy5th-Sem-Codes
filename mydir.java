import java.io.*;

class mydir{
     public static void main(String[] args) {
     
        File inFile = new File("C://myjavademo/javapgm");
        if(!inFile.exists()){
            if(inFile.mkdir()){
                System.out.println("Directory is Created");
            }
        }else{
            System.out.println("Directory is already Exists");
        }

    }
}