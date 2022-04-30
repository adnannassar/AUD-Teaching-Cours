package Algorithmen.Aufgabe_1;

public class Parallelogram {
    public static void main(String[] args) {
        checkTheTypeOfParallelogram(10,10);
    }

    public static void checkTheTypeOfParallelogram(int side1, int side2){
        if(side1 == side2){
            System.out.println("The Parallelogram is a Square");
        }else{
            System.out.println("The Parallelogram is a Rectangle");
        }
    }

    public static void checkTheTypeOfTriangle(int side1, int side2 ,int side3){
        // متساوي الاضلاع
        // متساوي الساقين
        // مختلف الاضلاع
        if(side1 == side2 && side1 == side3){
            System.out.println("Gleich");
        }
        if(side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("Gleich to sides");
        }else{

        }
    }
}
