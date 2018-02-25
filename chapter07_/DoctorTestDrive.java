package br.com.headfirstjava.chapter07_;

class Doctor
{
    public boolean workAtHospital;
    
    public void treatPatient() 
    {
	System.out.println("Make Check-Up!");
    }
    
}

class FamilyDoctor extends Doctor
{
    public boolean makesHouseCalls;
    
    public void giveAdvice() 
    {
	System.out.println("From the council!");
    }
}

class Surgeon extends Doctor{
    
    public void treatPatient() 
    {
	
	System.out.println("Make cirurgy");
    }
    
    public void incision() 
    {
	
	System.out.println("Okay");
    } 
}

public class DoctorTestDrive
{
    
    public static void main(String[] args)
    {
	
	Doctor d = new Doctor();
	d.treatPatient();
	d.workAtHospital = false;
	
	Surgeon s = new Surgeon();
	s.treatPatient();
	s.workAtHospital = true;
	
	
	
	
    }
    
}
