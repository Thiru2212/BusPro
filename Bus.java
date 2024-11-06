public  class Bus{
     private int busno;
     private int capacity;
     private String ac;
      Bus(int busno,int capacity,String ac)
        {
         this.busno=busno;
         this.capacity= capacity;
         this.ac=ac;
         }
       public int getBusno()
         {
          return busno;
         }
        public void setBusno(int busno)
         {
          this.busno=busno;
         }
      public int getCapacity()
         {
          return capacity;
         }
        public void setCapacity(int capacity)
         {
          this.capacity=capacity;
         }
        public String getAc()
         {
          return ac;
         }
        public void setAc(String ac)
         {
          this.ac=ac;
         }
      public void displayBusInfo()
          {
           System.out.println("Busno:"+ busno+"*"+ " Total Capacity:"+capacity+"*" + "  Ac/non Ac:"+ac);
           }

      }