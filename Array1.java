public class TestMarksAverage {
 
    public static void main(String[] args) {
     
        //declare an array with size 3
        int [] marks = new int[3];
         
        //assign marks in the array 
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
         
        // find how many items in the array
        System.out.println("Size" + marks.length);
         
        // Iterate array using for loop
        System.out.println("Using for Loop");
        for ( int i=0 ; i < marks.length ; i++ ){
            int m = marks[i];
            System.out.println(m);
        }
         
        // Iterate array using foreach loop
        System.out.println("Using latest foreach Loop");
        for ( int m1 : marks ){
            System.out.println(m1);
        }
         
    }
 
}
