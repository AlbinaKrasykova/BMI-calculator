import java.util.Scanner;




    public class MAin {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Hello, type your name , please");
            String name = sc.nextLine();
            System.out.println("Hello, "+ name +" type your weight please");
            double userWeight = sc.nextDouble();
            System.out.println( name +" and type your height please");
            double height = sc.nextDouble();
            System.out.println(name + " your weight is "+userWeight+", \nyour height is "+height+" let's calculate BMI");

            double BMI = (userWeight/height/height)*10000;
            System.out.println("Your BMI is " + BMI);

            System.out.println("The range is " );
            weightRange(BMI,userWeight);

            System.out.println(name+"see you next time!");


        }
        public static void weightRange(double BMI,double weight){
            String [] rangeBMI = {"Your weight "+weight+"falls underweight range" + BMI + "\n you have" +
                    " to gain some kg for your well being",
                    "Your weight "+weight+"falls within normal range" + BMI + "\n " +
                            " Enjoy your life, and keep up a balance lifestyle",
                    "Your weight "+weight+"falls within overweight range" + BMI + "\n you have" +
                            " to lose weight for the sake of your health",
                    "Your weight "+weight+"falls within obese range" + BMI + "\n Wake up!! you have" +
                            " to lose weight for the sake of your health!"};
            if(BMI<18.5){
                System.out.print(rangeBMI[0]);
            }
            else if(BMI>18.5&&BMI<25.0){
                System.out.print(rangeBMI[1]);
            }
            else if (BMI>25.0&&BMI<=29.0){
                System.out.print(rangeBMI[2]);
            }
            else{
                System.out.println(rangeBMI[3]);
            }

        }}


