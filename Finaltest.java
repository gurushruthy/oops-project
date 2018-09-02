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
import java.util.Scanner;
public class Finaltest{
    final void numofcar()
    {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("\n enter the number of cars needed");
        int num=input.nextInt();
        System.out.println("\n no of cars needed="+num);
    }
    
}
