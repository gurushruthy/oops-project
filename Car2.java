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
import java.lang.String;
public class Car2 extends Car1{
    public int milage;
    public Car2(String person,String nameofcar,int seat,int milage)
    {
        super(person,nameofcar,seat);
        this.milage=milage;
    }
    public void setmilage(int milage)
    {
        this.milage=milage;
    }
    public int getmilage()
    {
        return milage;
    }
    @Override
    public String tostring()
    {
        return String.format("%s %s:%d\n",super.tostring(),"milage required",getmilage());
    }
}
