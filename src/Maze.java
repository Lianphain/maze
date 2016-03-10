/***************************************************************************************
 *
 * NAME: Kahlin Baughman
 *
 * HOMEWORK: 6
 *
 * CLASS: ICS 211
 *
 * INSTRUCTOR: Scott Robertson
 *
 * DATE: March 8, 2016
 *
 * FILE: Maze.java
 *
 * DESCRIPTION: This is the file that contains the methods for the Maze class
 *
 ***************************************************************************************/
 import java.util.*;
 import java.io.*;

public class Maze{
  private int rows;
  private int cols;
  private Grid maze;
  private String fileName;
  private boolean check = false;
  private Cell exit = null;
  private Cell start = null;
  private Cell temp = null;
  private Stack<Cell> stack = new Stack<Cell>();
  private Queue queue = new Queue<Cell>();



  /********************************************************************
	*
	* Method: Maze
	*
	* Description: Constructs the maze of a given size, using the given file.
	*
	* @param  numRows  Contains the number of rows the grid should have
  *         numCols  Contains the number of columns the grid should have
  *         filename Contains the file name of the file for the maze
	*
	* @return None
	*
	********************************************************************/

  // Constructs the maze of a given size, using the given file.
  public Maze(int numRows, int numCols, String filename){
    maze = new Grid(numRows, numCols);
    rows = numRows;
    cols = numCols;
    fileName = filename;
    try{
        Scanner fr = new Scanner(new FileReader(filename));
        for(int i = 0; i < numRows; i++){
          for(int j = 0; j < numCols; j++){
            maze.setData(i, j, fr.next());
          }
        }
    } catch(Exception e){
      System.out.println("Fuck you, put in a maze file damn it");
    }
  }



  /********************************************************************
	*
	* Method: findExitUsingStack
	*
	* Description: Traverses through the maze using a stack
	*
	* @param  None
	*
	* @return None
	*
	********************************************************************/

  //Traverses through the maze using a Stack. If there is no start, print "This maze has no start!"
  //If an exit cannot be found then print, "No exit was found". Otherwise, as soon as an exit has
  //been found, stop traversing through the maze, and print, "You have found the exit!" Each
  //time a cell is visited, print the maze.
  public void findExitUsingStack(){
    if(temp == null){
      R: for(int i = 0; i < rows; i++){
          for(int j = 0; j < cols; j++){
            if(maze.getData(i, j).equals("S")){
              start = maze.getCell(i, j);
              temp = start;
              stack.push(temp);
              check = true;
              break R;
            }
          }
        }
    }
    if(check == true){
        temp.setData("V");
        if(temp.getNorth().getData().equals("*")){
          System.out.println("Success");
        }
        else if(temp.getNorth().getData().equals("E")){

        }
        else{
          if(temp.getEast().getData().equals("*")){

          }
          else if(temp.getEast().getData().equals("E")){

          }
          else{
            if(temp.getSouth().getData().equals("*")){

            }
            else if(temp.getSouth().getData().equals("E")){

            }
            else{
              if(temp.getWest().getData().equals("*")){

              }
              else if(temp.getWest().getData().equals("E")){

              }
              else{
                stack.pop();
                System.out.println("No exit was foud.");
              }
            }
          }
        }
    }
    else{
      System.out.println("This maze has no start!");
    }
  }


  /********************************************************************
	*
	* Method: findExitUsingQueue
	*
	* Description: Traverses through the maze using a stack
	*
	* @param  None
	*
	* @return None
	*
	********************************************************************/

  //Traverses through the maze using a Queue. If there is no start, print "This maze has no start!"
  //If an exit cannot be found then print, "No exit was found." Otherwise, as soon as an exit has
  //been found, stop traversing through the maze, and print, "You have found the exit!" Each
  //time a cell is visited, print the maze.
  public void findExitUsingQueue(){

  }



  /********************************************************************
	*
	* Method: resetMaze
	*
	* Description: Resets the maze to the initial maze
	*
	* @param  None
	*
	* @return None
	*
	********************************************************************/

  //Resets the maze using the initial file.
  public void resetMaze(){
    maze = new Grid(rows, cols);
  }



  /********************************************************************
	*
	* Method: toString
	*
	* Description: Converts the maze to a String
	*
	* @param  None
	*
	* @return String temp
	*
	********************************************************************/

  //Returns a String representation of the maze
  public String toString(){
    String temp = "";
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        temp += (maze.getData(i, j) + " ");
      }
      temp += "\n";
    }
    return temp;
  }
}
