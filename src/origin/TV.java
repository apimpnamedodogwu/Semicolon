package origin;

public class TV {

     private boolean isOn;

     private int channel;

     private String productName;


        public TV (String name) {

                this.productName = name;
 
                        }

        public boolean isOn () {

                 return isOn;

                       }

        public int getCurrentChannel () {

                 return this.channel;

                       }

        public void setCurrentChannel (int name) {

                  this.channel = name;

                        }

                             }