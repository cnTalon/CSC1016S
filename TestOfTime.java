// Assignment 3
// Exercise 1
// 16 August 2022

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestOfTime {

   @Test
   public void Test1 (){
   //test 1
   Time t = new Time("11:22:33");
   Assert.assertEquals("11:22:33", t.toString());
   }
   
   @Test
   public void Test2 (){
   //test 2
   Time t = new Time("11:22:33");
   Time t2 = new Time("12:30:20");
   Assert.assertEquals(1, t2.subtract(t).intValue("hour"));
   }
   
   @Test
   public void Test3 (){
   //test 3
   Time t = new Time("11:22:33");
   Assert.assertEquals(0, t.subtract(t).intValue("minute"));
   }
   
   @Test
   public void Test4 (){
   //test 4
   Duration d = new Duration("second", 30);
   Assert.assertEquals(30000 , d.intValue("millisecond"));
   }
   
   @Test
   public void Test5 (){
   //test 5
   Duration d2 = new Duration("millisecond", 30000);
   Assert.assertEquals(30, d2.intValue("second"));
   }
   
   @Test
   public void Test6 (){
   //test 6
   Duration d3 = new Duration("second", 60);
   Assert.assertEquals(1, d3.intValue("minute"));
   }
   
   @Test
   public void Test7 (){
   //test 7
   Duration d4 = new Duration("minute", 120);
   Assert.assertEquals(2, d4.intValue("hour"));
   }
}
