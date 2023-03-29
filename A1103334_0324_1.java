import java.util.*;

class Animal{
    String name;
    int weight, speed, d;
    double height;

    void showinfo(){
        System.out.println("Name \theight\tweight\tspeed");
        System.out.println(name+ "\t" +height+ "\t" +weight+ "\t" +speed);
    }

    double distance(double x, double y){
        d=(int) (x*y*speed);
        return d;
    }

    double distance(double x){
        d=(int) (x*speed);
        return d;
    }
}

public class A1103334_0324_1{
    public static void main(String[]argv){
        Animal animal1, animal2, animal3, animal4;
        Scanner sc = new Scanner (System.in);
        animal1=new Animal();
        animal2=new Animal();
        animal3=new Animal();
        animal4=new Animal();
        
        animal1.name="olaf";
        animal1.height=1.1;
        animal1.weight=52;
        animal1.speed=100;
        animal1.showinfo();
        System.out.print("Input time : ");
        double x = sc.nextDouble();
        System.out.print("Input accelaration :");
        double y = sc.nextDouble();
        System.out.print("Monkey distance: "+animal1.distance(x, y));
        System.out.println();

        animal2.name="donkey";
        animal2.height=1.5;
        animal2.weight=99;
        animal2.speed=200;
        animal2.showinfo();
        System.out.print("Input time : ");
        double x1 = sc.nextDouble();
        System.out.print("Input accelaration : ");
        double y1 = sc.nextDouble();
        System.out.print("donkey distance : "+animal2.distance(x1, y1));
        System.out.println();

        animal3.name="anna";
        animal3.height=1.7;
        animal3.weight=48;
        animal3.speed=120;
        System.out.print("Input time : ");
        double x2 = sc.nextDouble();
        System.out.print("Input accelaration : ");
        double y2 = sc.nextDouble();
        System.out.print("anna distance : "+animal3.distance(x2, y2));
        System.out.println();

        animal4.name="aisha";
        animal4.height=1.7;
        animal4.weight=50;
        animal4.speed=120;
        System.out.print("Input time : ");
        double x3 = sc.nextDouble();
        System.out.print("Input accelaration : ");
        double y3 = sc.nextDouble();
        System.out.print("aisha distance : "+animal4.distance(x3, y3));
        System.out.println();

    }
}