/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saiji rabari
 */
import java.util.*;
class thread1 extends Thread {

public void run()
{
 System.out.println("hello world");
}
   
}
public class NewClass{
   public static void main(String []args)
   {
       thread1 t=new thread1();
       t.run();
   }
}

