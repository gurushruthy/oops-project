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
public class Abscost extends Cost {
    @Override
    public int costmethod(String name)
    {
        if("maruthi".equals(name))
        {
        
            return 5;
        }
        else if("xylo".equals(name))
        {
            return 10;
        }
        else if("festa".equals(name))
        {
            return 15;
        }
        else
        {
            return 20;
        }    
    
}
}
