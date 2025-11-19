package Homework4.Task4;
import java.lang.Math;

public class Matrix {
    private int rows;

    private int columns;
    private double[][] arr;


    public Matrix (int rows,int columns) {
        this.rows = rows;
        this.columns = columns;
        arr = new double[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns;j++){
                this.arr[i][j]=Math.random()*100;
            }
        }
    }

    public static Matrix sum(Matrix m,Matrix n){
        if (m.getRows()==n.getRows() && m.getColumns()==n.getColumns()){
            int r = m.getRows();
            int c = m.getColumns();
            Matrix s = new Matrix(r,c);
            for (int i = 0; i < r; i++){
                for (int j = 0; j < c;j++){
                    s.getArr()[i][j]=m.getArr()[i][j]+n.getArr()[i][j];
                }
            }
            return s;
        } else {
            System.out.println("Матрицы нельзя сложить");
            return new Matrix(1,1);
        }

    }
    public static Matrix mult(Matrix m, double d){
        int r = m.getRows();
        int c = m.getColumns();
        Matrix s = new Matrix(r,c);
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c;j++){
                s.getArr()[i][j]=m.getArr()[i][j]*d;
            }
        }
        return s;
    }
    public static void print(Matrix m){
        for (int i = 0; i < m.getRows(); i++){
            System.out.print("( ");
            for (int j = 0; j < m.getColumns();j++){
                System.out.print(m.getArr()[i][j]+" ");
            }
            System.out.print(")\n");
        }
        System.out.println("\n");
    }

    public double[][] getArr() {
        return arr;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
