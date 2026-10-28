
package oop_project;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;



public class Oop_Project {

   
    public static void main(String[] args) {
        
        try
        {
           File f=new File("inputt.txt");
           Scanner sc=new Scanner(f);
             double sum=0;
             int n=sc.nextInt(); 
             sc.nextLine();
             if (n<0)
             {
                 System.err.println("Error : the size of the array must be positive");
                 return;
             }
             Drawable [] arr=new Drawable[n];
          
           for(int i=0;i<n;i++) 
           {
               if(!sc.hasNext()){
                   System.err.println("Warning: number of shapes is less than "+n);
                   break;
               }
               String line =sc.nextLine().trim();
               if (line.isEmpty()){
                   i--;
                   continue;
               }
                  
               String shape =line.replaceAll("[0-9.]", "").trim();                 
               double length=Double.parseDouble(line.replaceAll("[^0-9.]", ""));
               
               switch(shape.toLowerCase())
               {
                   case "circle":
                       if(length<0){
                   System.err.println("radius must be positive");
                   continue;
                             }
                      arr[i]=new Circle(length);
                      sum+=((Circle)arr[i]).getArea();
                      System.out.println("The Area Of the Circle = "+((Circle)arr[i]).getArea());
                      break;
                   case "cube" :
                       if(length<0){
                   System.err.println("side must be positive");
                   continue;
                                 }
                       arr[i]=new Cube(length);
                       sum+=((Cube)arr[i]).getArea();
                       System.out.println("The Area Of the Cube = "+((Cube)arr[i]).getArea());
                       break; 
                   default:
                       System.out.println("unknown shape"+shape);
                       break;
                
             }
          }
           if(sc.hasNext()){
               System.err.println("Warning :extra shapes in file were ignored");
           }
           //GUI
           ShapeFrame r=new ShapeFrame(arr);  
           
           //Write to file
           PrintStream p = new PrintStream("sumAreas.txt");
             p.print("Sum Of Areas = ");
             p.println(sum);
             System.out.println("Sum Of Areas Written To File Named sumAreas");
             p.close();
       }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
      
    }
    
}