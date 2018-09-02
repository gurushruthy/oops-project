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

public class Car1 implements Interfacetest
    {
    public String person;
    public String nameofcar;
    public int seat;
    public int cost;
    public Car1(String person,String nameofcar,int seat)
    {
        this.person=person;
        this.nameofcar=nameofcar;
        this.seat=seat;
        Abscost a=new Abscost();
       cost= a.costmethod(nameofcar);
      
    }
    @Override
    public void display()
    {
        System.out.println("\ninterface is implemented");
    }
    public void setperson(String person)
    {
        this.person=person;
    }
    public void setcar(String nameofcar)
    {
        this.nameofcar=nameofcar;
    }
    public void setseat(int seat)
    {
        this.seat=seat;
    }
    public String getperson()
    {
        return person;
    }
    public String getcar()
    {
        return nameofcar;
    }
    public int getseat()
    {
        return seat;
    }
    public String tostring()
    {
        return String.format("%s:%s\n%s:%s\n%s:%d\n%s:%d\n","name of the person",getperson(),"name of the car",getcar(),"number of seats needed",getseat(),"cost of the car",cost);
    }
}
