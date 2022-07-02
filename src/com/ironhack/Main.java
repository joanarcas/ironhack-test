package com.ironhack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //Java arrays are defined with a maximum length.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArray = new int[10];

        System.out.println(numbers.length);

        //Java Array List
        ArrayList<String> stringArrayList = new ArrayList<String>();
        ArrayList<Integer> intList = new ArrayList<Integer>();

        stringArrayList.add("test");
        System.out.println(stringArrayList.get(0));

        //Java Lists. "List" is an interface. You can not instantiate an interface.
        List<String> stringList = new ArrayList<String>();
        stringList.add("red");
        stringList.add("blue");
        stringList.add("green");
        stringList.add(1,"black");

        System.out.println(stringList);

        stringList.set(1, "white");

        System.out.println(stringList);

        System.out.println("Print with for");
        for(int i = 0 ; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

        System.out.println("Print with while");
        int j = 0;
        while (j < stringList.size()){
            System.out.println(stringList.get(j++));
        }

        System.out.println("Print with do-while");
        int k = 0;
        do{
            System.out.println(stringList.get(k));
            k++;
        }while (k < stringList.size());

        //++i primero suma y despues usa la variable
        //i++ primero usa la variable y despues la usa

        System.out.println("Print foreach (for)");
        for(String word : stringList){
            System.out.println(word);
        }

        //BONUS: con stream
        stringList.stream().forEach(System.out::println);
        stringList.forEach(System.out::println);

        /////////////////////
        //EJERCICIO opción A - sumar cada valor con  el siguiente
        /////////////////////

        System.out.println("OPCION A\n");

        int[] input = {5, 4, 3, 2, 1};
        int[] output = new int[input.length];

        for (int i = 0; i<input.length-1;i++){
            output[i] = input[i]*input[i+1];
        }
        output[input.length-1] = input[input.length-1]*input[0];

        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(output));


        /////////////////////
        //EJERCICIO opción B - sumar cada valor con  el siguiente
        /////////////////////

        System.out.println("OPCION B\n");

        ArrayList<Integer> inputList = new ArrayList<Integer>();
        int numOfNumbers = 5;

        for(int i = numOfNumbers; i > 0; i--){
            inputList.add(i);
        }

        System.out.println(inputList);

        int tmp = inputList.get(0);

        for (int i = 0; i<inputList.size()-1;i++){
            inputList.set(i, inputList.get(i) * inputList.get(i+1));
        }
        inputList.set(inputList.size()-1, inputList.get(inputList.size()-1) * tmp);

        System.out.println(inputList);


        // SEGUNDO EJERCICIO - ordenar un array
        ArrayList<Integer> arrayTest = new ArrayList<Integer>();
        arrayTest.add(4);
        arrayTest.add(200);
        arrayTest.add(-5);
        arrayTest.add(5000);
        arrayTest.add(1);

        System.out.println(arrayTest);
        System.out.println(sortArray(arrayTest));


    }

    public static ArrayList<Integer> sortArray(ArrayList<Integer> arrayInts){
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        sortedArray.add(arrayInts.get(0));

        for (int i = 1; i < arrayInts.size(); i++) {

            int j = 0;
            while(j < sortedArray.size() && sortedArray.get(j) > arrayInts.get(i) ){
                j++;
            }
            sortedArray.add(j,arrayInts.get(i));
        }

        return sortedArray;

    }
}
