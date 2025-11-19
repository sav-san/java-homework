package Homework9_10;

import java.util.*;



public class Task {
//    public static void insertionSort(Student[] students) {
//        for (int i = 1; i < students.length; i++) {
//            Student key = students[i];
//            int j = i - 1;
//            while (j >= 0 && students[j].compareTo(key) > 0) {
//                students[j + 1] = students[j];
//                j = j - 1;
//            }
//            students[j + 1] = key;
//        }
//    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Сава", 103, "КВБО-12-24", 4.5),
                new Student("Кира", 101, "КВБО-11-24", 4.8),
                new Student("Саня", 105, "КРБО-12-24", 4.2),
                new Student("Глеб", 102, "ИКБО-30-24", 4.4),
                new Student("Даня", 104, "ККСО-11-23", 4.9)
        };

        System.out.println("Исходный массив:");
        Student.outArray(students);

        MergeSortStudents.sortStudents(students);
        System.out.println("\nОтсортированный массив (по ID):");
        Student.outArray(students);
        SortingStudentsByGPA.qSort(students);

        System.out.println("\nОтсортированный массив (по GPA):");
        Student.outArray(students);

    }
}
class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }

    public static void quickSort(Student[] students, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(students, low, high, comparator);
            quickSort(students, low, pi - 1, comparator);
            quickSort(students, pi + 1, high, comparator);
        }
    }

    private static int partition(Student[] students, int low, int high, Comparator<Student> comparator) {
        Student pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(students[j], pivot) > 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }

    public static void qSort(Student[] students) {
        quickSort(students, 0, students.length - 1, new SortingStudentsByGPA());
        for (int i = 0; i < students.length/2; i ++){
            Student temp;
            temp = students[i];
            students[i]=students[students.length-i-1];
            students[students.length-i-1]=temp;
        }
    }
}

