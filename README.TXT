SeatingChart

public SeatingChart(String[][] studentNames)
Constructor for objects of class SeatingChart
Parameters:
studentNames - a 2-D array of Strings representing student names

public void clearChart()
Fills the instance 2-D array of Strings with null values

public String addStudent(String name,
                         int roomRow,
                           int depth)
Recieves from the client the name and location of the new 'student'. 
Accepts data from the teachers perspective of row and desk number. 
(teachers do not begin row numbers at zero like a programmer would) 
Warns the teacher if the desk is already occupied or the location invalid 
otherwise places the 'student' in the location.
Parameters:
name - a String representing the student's name
roomRow - row number (1 to myCols+1) from the teacher's perspective (L to R)
depth - seat number from front to back (1 to myRows+1)
Returns:
a String detailing the status of the operation


public void randomize()
Moves students to pseudo-random locations. 
Every student in the chart has a chance to move. 
Empty seats remain empty.


public String removeStudent(int roomRow,
                              int depth)
Recieves from the client the location of the 'student' to be removed. 
Accepts data from the teachers perspective of row and desk number. 
(teachers do not begin row numbers at zero like a programmer would) 
Warns the teacher if the desk is empty or the location invalid 
otherwise removes the 'student' from the location.
Parameters:
roomRow - row number (1 to myCols+1) from the teacher's perspective (L to R)
depth - seat number from front to back (1 to myRows+1)
Returns:
a String detailing the status of the operation


public void setChart(String[][] array)
Recieves a seating chart from client and saves it as an instance array.
Parameters:
array - String[][] representing a seating chart

public String toString()
Generates and returns a String representation of the seating chart
Returns:
a String representation of the seating chart
