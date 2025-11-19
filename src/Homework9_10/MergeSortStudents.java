package Homework9_10;

public class MergeSortStudents {

    public static void sortStudents(Student[] students) {
        if (students == null || students.length <= 1) {
            return;
        }
        mergeSort(students, 0, students.length - 1);
    }

    private static void mergeSort(Student[] students, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(students, left, mid);
            mergeSort(students, mid + 1, right);

            merge(students, left, mid, right);
        }
    }

    private static void merge(Student[] students, int left, int mid, int right) {

        Student[] leftArray = new Student[mid - left + 1];
        Student[] rightArray = new Student[right - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = students[left + i];
        }
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = students[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {

            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                students[k] = leftArray[i];
                i++;
            } else {
                students[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            students[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            students[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
