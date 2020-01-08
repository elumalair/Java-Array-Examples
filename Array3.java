public class TestMarksAverage {
 
    public static void main(String[] args) {
     
        //declare an array with size 3
        int [] marks = new int[3];
         
        //assign marks in the array 
        marks[0] = 55;
        marks[1] = 66;
        marks[2] = 84;
         
        //calculate total marks 
        int totalMarks = 0;
        for ( int m : marks ){
            totalMarks = totalMarks + m ;           
        }
         
        int noOfSubjects = marks.length;
         
        int avg1 = totalMarks / noOfSubjects;
         
        float avg2 = (float)totalMarks / noOfSubjects;
         
        System.out.println("Total Marks:" + totalMarks);
        System.out.println("Average using int:" + avg1);
        System.out.println("Average using float:" + avg2);
         
    }
 
}
