class Vehicle {
    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;

    public Vehicle(String regNo, String make, int yearOfManufacture, double value) {
        this.regNo = regNo;
        this.make = make;
        this.yearOfManufacture = yearOfManufacture;
        this.value = value;
        // complete this assignment statements here
    }

    // write getter and setter here
    public String getRegNo(){

      return regNo;
      }
    public String getMake(){

      return make;
      }
    public int getYearOfManufacture(){

      return yearOfManufacture;
      }
    public double getValue(){

      return value;
      }
    
    public void setValue(double value){
    
      this.value = value;
      }

   
      
    public int calculateAge(int currentYear) {
        // compute age here
      return 2024 - this.yearOfManufacture;  
    }

    @Override
    public String toString() {
        return "Reg No: " + regNo + ", Make: " + make + ", Year of Manufacture: " + yearOfManufacture + ", Value: Php" + value;
    }
}