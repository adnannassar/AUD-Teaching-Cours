package Algorithmen.Aufgaben_nibal;

public class Aufgabe_1 {

    public static void main(String[] args) {

        System.out.println(doSomethingN(new int[]{1,2,3}));
        System.out.println(doSomethingN(new int[]{1,2,3,4}));
        System.out.println(doSomethingN(new int[]{1,2,3,4,5}));
        System.out.println(doSomethingN(new int[]{1,2,3,4,5,6}));
    }

    public static int doSomethingNQuadrat(int array[]){
        int x = -1;
        for(int i = 1; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(i != j){
                    if(array[i]* array[j] > x){
                        x = array[i]* array[j];
                    }
                }
            }
        }
        return x;
    }

    public static int doSomethingN(int array[]){
        int counter = 1 ;
        for(int i = 1 ; i < array.length; i++ ){
            counter++;
        }

        return array [ counter - 1 ] * ( counter-1)  ;
    }

    public static int doSomething1(int array[]){
        return array [array.length - 1 ] * (array.length-1)  ;
    }

}
