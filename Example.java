import java.util.*;
class Example{
    public static void main(String args[]){
        System.out.println("\t****************");
        System.out.println("\tUNIT CALCULATOR");
        System.out.println("\t****************");
        System.out.println("1.Meter  to Centimeter ");
        System.out.println("2.Liter  to Milliliter");
        System.out.println("3.Feet  to Inch");
        System.out.println("4.Gigabyte  to Megabyte");

        System.out.println("");

        System.out.print("Enter and option to contiune :");
        Scanner t =new Scanner (System.in);
        int x=t.nextInt();
        if(x==1){
            System.out.println("");
            System.out.print("Enter value in meter :");
            double y=t.nextDouble();
            double z=y*100;
            System.out.println("Answer is ;");
            System.out.println(y+" m = "+z+" cm");
        }
        else if (x==2){
            System.out.println("");
            System.out.print("Enter value in litter :");
            double y=t.nextDouble();
            double z=y*1000;
            System.out.println("Answer is ;");
            System.out.println(y+" litter = "+z+" milliliter");

        }
        else if (x==3){
            System.out.println("");
            System.out.print("Enter value in feet :");
            double y=t.nextDouble();
            double z=y*12;
            System.out.println("Answer is ;");
            System.out.println(y+" feet = "+z+" inches");


        }
        else if (x==4){
            System.out.println("");
            System.out.print("Enter value in Gigabyte :");
            double y=t.nextDouble();
            double z=y*1024;
            System.out.println("Answer is ;");
            System.out.println(y+" Gigabyte = "+z+" Megabyte");


        }
        else{
            System.out.println("");

            System.out.println("Error");
        }


    }
}

