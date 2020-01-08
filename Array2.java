public class TestMarksAverage {
 
    public static void main(String[] args) {
     
        //declare an array with size 3
        int [] marks = new int[3];
         
        //assign marks in the array 
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
         
        //calculate total marks 
        int totalMarks = 0;
        for ( int m : marks ){
            totalMarks = totalMarks + m ;           
        }
        System.out.println("Total Marks:" + totalMarks);
         
    }
 
}
