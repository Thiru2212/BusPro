import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Booking{
     static int id=1;
     String pasName;
     int busno;
     int bookId;
     Date date;
     int ticket;//booked method() variable
     static int tid=1;//booked() method variable
     Booking()
       {
       this.ticket=tid++;
       this.bookId=id++;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your Name:");
       pasName=sc.nextLine();
       System.out.println("Enter BusNo:");
       busno=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter your date like this dd-mm-yyyy:");
       String d=sc.nextLine();
       SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
       try{
       date=sdf.parse(d);
       }
      catch(Exception e)
        {
          e.printStackTrace();  
     }
     System.out.println("*******************************************");
   }
    public void showBook()
     {
      System.out.println("Booking Id      :"+bookId+"\nPassenger Name  :"+pasName);
                       
      }
    public void booked()
         {
          System.out.println("Ticket No:"+ticket+"\nPassenger Name  :"+pasName);
         }
          
   public boolean isAvailable(ArrayList<Booking> book,ArrayList<Bus> buses)
         { 
           int capacity=0;
           for(Bus b:buses)
             {
            if(b.getBusno()==busno)
             {
               capacity=b.getCapacity();
             }
            }
          int booked=0;
          for(Booking bk:book)
            {
             if(bk.busno==busno && bk.date.equals(date))
              {
                booked++;
              }
          }
          return booked<capacity?true:false;
         }
}