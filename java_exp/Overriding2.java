class Bank{  
int getRateOfInterest(){return 0;}  
}  
  
class SBI extends Bank{  
int getRateOfInterest(){return 6;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 5;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 7;}  
}  
  
class Overriding2{  
public static void main(String args[]){  
SBI s= new SBI();  
ICICI i= new ICICI();  
AXIS a= new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
} 