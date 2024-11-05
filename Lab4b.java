class CountryNotValidException extends Exception{
    public CountryNotValidException(String message){
        super(message);
    }
}
class EmployeeNameInvalidException extends Exception{
    public EmployeeNameInvalidException (String message){
        super(message);
    }
}
class TaxNotEligibleException extends Exception{
    public TaxNotEligibleException(String message){
        super(message);
    }
}
public class Lab4b{
    String empName;
    boolean isIndian;
    double empSal;
    double taxAmount;

    public void calculateTax(String empName, double empSal, boolean isIndian)throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException{
        if(!isIndian){
            throw new CountryNotValidException("The employee should be Indian citizen for calculating tax");
        }else if(empName == null){
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }else if(empSal>100000 && isIndian){
            taxAmount = empSal*8/100;
            System.out.println("Tax amount is : "+taxAmount);
        }else if(empSal>50000 && empSal<=100000 && isIndian){
            taxAmount = empSal*6/100;
            System.out.println("Tax amount is : "+taxAmount);
        }else if(empSal>30000 && empSal<=50000 && isIndian){
            taxAmount = empSal*5/100;
            System.out.println("Tax amount is : "+taxAmount);
        }else if(empSal>10000 && empSal<=30000 && isIndian){
            taxAmount = empSal*4/100;
            System.out.println("Tax amount is : "+taxAmount);
        }else{
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
    }
    public static void main(String[] args) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException{
        Lab4b tax=new Lab4b();
        try{
            tax.calculateTax("Neetu",1000,true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}