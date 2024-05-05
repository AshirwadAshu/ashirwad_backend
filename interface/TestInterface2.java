package abstraction;

interface Banks{  
float rateOfInterest();  
}  
class SBIMyosre implements Banks{  
public float rateOfInterest(){
	return 9.15f;
	}  
}  
class Hdfc implements Banks{  
public float rateOfInterest(){
	return 9.7f;
	}  
}  
class TestInterface2{  
public static void main(String[] args){  
Banks b=new Hdfc();  
System.out.println("ROI: "+b.rateOfInterest());  
}
}
