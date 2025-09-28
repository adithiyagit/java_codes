abstract class Staff {
private String name;
private double baseSalary;

public Staff(String name,double baseSalary){
this.name=name;
this.baseSalary=baseSalary;
}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public double getBaseSalary(){
return baseSalary;
}

public void setBaseSalary(double baseSalary){
this.baseSalary=baseSalary;
}

public abstract double calculateSalary();
}

class Doctor extends Staff {
private double consultationFees;

public Doctor(String name,double baseSalary,double consultationFees){
super(name,baseSalary);
this.consultationFees=consultationFees;
}

public double getConsultationFees(){
return consultationFees;
}

public void setConsultationFees(double consultationFees){
this.consultationFees=consultationFees;
}

public double calculateSalary(){
return getBaseSalary()+consultationFees;
}
}

class Nurse extends Staff {
private int extraHours;
private double hourlyRate;

public Nurse(String name,double baseSalary,int extraHours,double hourlyRate){
super(name,baseSalary);
this.extraHours=extraHours;
this.hourlyRate=hourlyRate;
}

public int getExtraHours(){
return extraHours;
}

public void setExtraHours(int extraHours){
this.extraHours=extraHours;
}

public double getHourlyRate(){
return hourlyRate;
}

public void setHourlyRate(double hourlyRate){
this.hourlyRate=hourlyRate;
}

public double calculateSalary(){
return getBaseSalary()+(extraHours*hourlyRate);
}
}

class AdminStaff extends Staff {
private double bonus;

public AdminStaff(String name,double baseSalary,double bonus){
super(name,baseSalary);
this.bonus=bonus;
}

public double getBonus(){
return bonus;
}

public void setBonus(double bonus){
this.bonus=bonus;
}

public double calculateSalary(){
return getBaseSalary()+bonus;
}
}

public class HospitalPayroll {
public static void main(String[] args){
Staff doc=new Doctor("Dr. Asha",50000,20000);
Staff nurse=new Nurse("Sister Meera",30000,10,500);
Staff admin=new AdminStaff("John",25000,3000);

System.out.println(doc.getName()+" earns ₹"+doc.calculateSalary());
System.out.println(nurse.getName()+" earns ₹"+nurse.calculateSalary());
System.out.println(admin.getName()+" earns ₹"+admin.calculateSalary());
}
}
