
/**
 * Demonstration and Assignment for 2D-arrays.
 * 
 * @author GrayKnight 
 * @version 12/3/12, 12/10/17
 */
import java.util.Scanner;
import java.util.Random;

public class TeacherDisplay
{
    private final int MAXNAME = 10; //Names longer than 10 characters will be truncated
    private Scanner scanNum = new Scanner(System.in);
    private Scanner scanStr = new Scanner(System.in);
    
    private SeatingChart myChart;
    
    //constructor
    public TeacherDisplay()
    {
        myChart = new SeatingChart(fillAPCSchart());
    }

    public void SeatingChartDisplay()
    {
       int classRow; //the classroom rows are columns in the array[][]
       int seatNum;  //seat #1 is in the front, seat#5 in the back
       
       System.out.println(myChart);
       
       int sentinel = 1;
       while(sentinel > 0 && sentinel < 6){
           System.out.println("\t\t\tFRONT OF ROOM\n\n1-add student\n2-remove student\n" + 
                              "3-randomize chart\n4-reload APCS\n5-clear chart\n6-Quit");
           System.out.print("Choose:");
           sentinel = scanNum.nextInt();
           if(sentinel == 1) {
              System.out.print("Enter student name:");
              String name = scanStr.nextLine();
              name = resize(name);
       
              System.out.print("Enter row:");
              classRow = scanNum.nextInt();
              System.out.print("Enter seat number:");
              seatNum = scanNum.nextInt();
              
              System.out.print(myChart.addStudent(name, classRow, seatNum));
            }
           else if (sentinel == 2) {
              System.out.print("Enter row:");
              classRow = scanNum.nextInt();
              System.out.print("Enter seat number:");
              seatNum = scanNum.nextInt();
              
              System.out.print(myChart.removeStudent(classRow, seatNum));
            }
           else if (sentinel == 3) myChart.randomize();
           
           else if (sentinel == 4) myChart = new SeatingChart(fillAPCSchart());
           
           else myChart.clearChart();
           
           System.out.println(myChart);
       }//end of while
       System.out.println("Goodbye!\n");
    }

    //original chart
    private String[][] fillAPCSchart()
    {   //creating a 2D-array with an initialization list
        String[][] apcsChart =
           {{    null    ,    null    ,    null    ,    null    ,    null    ,    null    },
            {    null    ,    null    ,    null    ,"  Robert  ",    null    ,    null    },
            {    null    ,"   Susan  ","   Kyle   ","   Dana   ","  Rodrigo ",    null    },
            {    null    ,"  Anthony ","  Matthew ","  Stephen "," Korbinian",    null    },
            {    null    ,"   Ryan   "," Nicholas ","   Kalan  ","   Peter  ",    null    }};            
        return apcsChart;
    }
    

    // This helper method makes the strings all the same length for storage
    // so the names look nice and the "rows" stay straight when displayed.
    private String resize(String p){
        if(p.length() > MAXNAME) p = p.substring(0,MAXNAME); //truncate
        while(p.length() < MAXNAME) {
            p = " " + p;
            if(p.length() < MAXNAME) 
                p = p + " ";
        }        
        return p; 
    }
    

}          
