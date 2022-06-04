package origin;

public class Customer {

    private String firstName;

    private String lastName;

    private int accountNumber;


      public Customer (String name, int number) {
  
                   this.firstName = name;

                   this.accountNumber = number;

                               }

      public String getFirstName () {

                   return this.firstName;

                                }

      public String getLastName () {

                   return this.lastName;

                                }

      public void setFirstName (String NewName) {

                   this.firstName = NewName;

                                }


      public void setLastName (String newLastName) {

                   this.lastName = newLastName;

                                }



                                    }