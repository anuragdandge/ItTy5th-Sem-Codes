import java.io.*;

class mydirpro{

     public static void main(String[] args) {
       File inFile = new File("C://Users//bsc//Desktop//Anurag//Java Programs");
       String [] paths;
       try{
           paths = inFile.list();
           for(String path:paths){
               System.out.println(path);
           }
       }  
       catch(Exception e){
          e.printStackTrace();
       }
    }
}