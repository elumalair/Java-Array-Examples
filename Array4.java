public class TestMarksAverage {
 
    public static void main(String[] args) {
     
        //declare an array with size 3
        int [] marks = new int[3];
         
        //assign marks in the array 
        marks[0] = 55;
        marks[1] = 66;
        marks[2] = 84;
         
        //Array size is 3.
        //if we add item in 4th position, ArrayIndexOutOfBoundsException will raise
        marks[3] = 89;
         
    }
 
}
