/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Shruthy
 */
public class Car {
   // public String name;
    //public String carname;
    //public int no;
    public void disp(){
        System.out.printf("it contains the main");
    }
    /*public Car(String name,String carname,int no)
            {
                this.name=name;
                this.carname=carname;
                this.no=no;
            }
**/                
 public static void main(String[]args)
 {
     Car1 []array=new Car1[2];
     array[0]=new Car1("raju","maruthi",5);
     array[1]=new Car1("reena","xylo",8);
     Car2 []arr=new Car2[2];
     arr[0]=new Car2("jack","festa",5,300);
     arr[1]=new Car2("rose","zen",5,200);
     String s=arr[0].tostring();
     String t=array[1].tostring();
     System.out.println(s+t);
     arr[0].display();
     Finaltest f=new Finaltest();
     f.numofcar();
     }
}

