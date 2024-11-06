import java.io.*;
import java.util.*;
public class BusPro{
     public static void main(String[]args)throws Exception{
             ArrayList<Bus> buses=new ArrayList<Bus>();
             buses.add(new Bus(1,2,"ac"));
             buses.add(new Bus(2,5,"non ac"));
             buses.add(new Bus(3,4,"non ac"));
             buses.add(new Bus(4,5,"ac"));
             System.out.println("*******************************************");
             System.out.println("            KARAIKAL TO CHENNAI            ");         
             System.out.println("*******************************************");
             System.out.println("****************BUS DETAILS****************");
                for(Bus b:buses)
                 {
                  b.displayBusInfo();
                   }
             System.out.println("********************************************");
             ArrayList<Booking> book=new ArrayList<Booking>();
             Scanner ob=new Scanner(System.in);
             int op;
            do{
               System.out.println("1.TICKET TO BOOK");
               System.out.println("2.TICKET TO CANCEL");
               System.out.println("3.AVAILABLE TICKET");
               System.out.println("4.BOOKED TICKET");
               System.out.println("5.EXIT");
               System.out.println("********************************************");
               System.out.println("Enter Your Option:");
               op=ob.nextInt();
            switch(op)
               {
                case 1:
                    Booking bookings=new Booking();
                    if(bookings.isAvailable(book,buses))
                      {
                        book.add(bookings);
                        bookings.showBook();
                        System.out.println("Your Booking Is Confirmed..");
                        System.out.println("********************************************");
                       }
                    else
                        System.out.println("Sorry Your Bus is Full,Try Another Day");
                        System.out.println("********************************************");
                break;
                case 2:
                     Scanner ob1=new Scanner(System.in);
                     System.out.println("Enter Booking ID:");
                     int input=ob1.nextInt();
                     ob1.nextLine();
                     System.out.println("Enter Passenger Name:");
                     String pName=ob1.nextLine();
                     for(int i=0;i<book.size();i++)
                      {
                       if(input==(book.get(i).bookId)&& pName.equalsIgnoreCase(book.get(i).pasName))
                         {
                           book.remove(i);
                           System.out.println("Your Ticket is Canceled.");
                          }
                       }
                      System.out.println("********************************************");
                      break;
                case 3:
                     if(book.size()<2)//here 2 is capacity Size
                        {
                         System.out.println("Ticket is Available.");
                         System.out.println("********************************************");
                        }
                     else
                       {
                        System.out.println("Ticket is Not Availabe.");
                        System.out.println("********************************************");
                       }
                     break;
                case 4:
                     if(book.isEmpty())
                       {
                        System.out.println("Tickets Not Booked");
                        System.out.println("********************************************");
                        }
                      else
                       {
                       int count=0;
                       System.out.println("Booked Tickets:");
                      for(Booking b:book)
                        {
                         b.booked();
                         count++;
                         }
                       System.out.println("********************************************");
                       System.out.println("TOTAL BOOKED TICKET:"+count);
                       System.out.println("********************************************");
                       }
                     break;
                case 5:
                    System.out.println("Exited.....");
                    ob.close();
                    break;
               default:
                    System.out.println("Invalid option");
                    System.out.println("********************************************");
                 break;
            }       
          }
           while(op>0);      
   }
 }
