// Creating the RewardValue class
public class RewardValue {
       //Specifying parameters
        Double cash;
        Double miles;

        //Creating a constructor that accepts cash
         public RewardValue cashValue(){
                cash = this.cash;
        }

        //Creating a constructor that accepts miles
        public RewardValue MileValue(){
                miles = this.miles;
        }

        //Method to get cash value
        public static Double cashValue(){
                Double cash = 0;
                return cash;
        }

        //Method to get mile value
        public static Double mileValue(){
                Double Miles = 0;
                return Miles;
        }

        // Converting cash value to mile value
        this.cash = this.miles * 0.0035 ;

        }



