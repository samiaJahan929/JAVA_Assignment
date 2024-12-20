package Assignment;

import java.util.Arrays;

public class CGPA_Sorting {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i=0; i< cgpa.length; i++){
            for (int j=i+1; j<cgpa.length; j++){
                if (cgpa[i]>cgpa[j]){
                    double temp = cgpa[i];
                    cgpa[i]=cgpa[j];
                    cgpa[j]=temp;
                }
            }
        }
        System.out.println("Sorting in ascending order of CGPA: "+ Arrays.toString(cgpa));
    }
}
