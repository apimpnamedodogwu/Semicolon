package origin;

public class Bike {

     private String productName;
  
     private String productType;

     private String serialNumber;
  
     private String colour;

     private String wheelType;

     private int numberOfWheels;


      public Bike (String name2, String name3) {

                this.productType = name2;

                this.serialNumber = name3;

                          }

      public String getWheelType () {

                    return this.wheelType;

                      }

      public int getNumberOfWheels () {

                     return this.numberOfWheels;

                      }

      public String getColour () {

                      return this.colour;

                       }

      public void setColour (String a) {

                       this.colour = a;

                       }

      public void setWheelType (String b) {

                       this.wheelType = b;

                       }

      public void setNumberOfWheels (int number) {

                       this.numberOfWheels = number;

                        
                       }

                             }