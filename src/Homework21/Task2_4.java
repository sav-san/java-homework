package Homework21;

import Homework09_10.Student;

import java.util.ArrayList;


class Storage{
    public Object[] storage;

    public Storage(Object[] arr){
        this.storage = arr;
    }

    public Object[] getArr() {
        return storage;
    }

    public Object get(int index){
        return storage[index];
    }

    public void head(){
        ArrayList<Object> arr = Task1.toArrList(storage);
        if (storage.length>=5){
            for (int i = 0; i < 5; i++) {
                System.out.println(arr.get(i));
            }
        } else {
            for (Object o : arr){
                System.out.println(o);
            }
        }

    }
}

public class Task2_4 {
    public static void main (String[]args){
        Double[] arr1 = new Double[]{123.65,213.123,0.123,112.1,12431234.1,12312.1232,1231.213124,124.1123124};
        String[] arr2 = new String[]{"asdad","asd","123132","yupogh"};
        Student[] arr3 = new Student[]{new Student("Сава",1123312,"фывфыв",10.1)};

        Storage s1 = new Storage(arr1);
        Storage s2 = new Storage(arr2);
        Storage s3 = new Storage(arr3);

        System.out.println(s2.get(3)+"\n");
        s1.head();
        System.out.println();
        s2.head();
    }
}


