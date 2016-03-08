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



  /* Constructs the maze of a given size, using the given file.*/
  public Maze(int numRows, int numCols, String filename){
    maze = new Grid(numRows, numCols);
    rows = numRows;
    cols = numCols;
    fileName = filename;
    Scanner fr = new Scanner(new FileReader(filename));
    try{
        for(int i = 0; i < numRows; i++){
          for(int j = 0; j < numCols; j++){
            maze.setData(i, j, fr.next());
          }
        }
    } catch(Exception e){
      System.out.println("Fuck you, put in a maze file damn it");
    }
  }

  /*Traverses through the maze using a Stack. If there is no start, print “This maze has no start!”
  If an exit cannot be found then print, “No exit was found.” Otherwise, as soon as an exit has
  been found, stop traversing through the maze, and print, “You have found the exit!” Each
  time a cell is visited, print the maze.*/
  public void findExitUsingStack(){

  }

  /*Traverses through the maze using a Queue. If there is no start, print “This maze has no start!”
  If an exit cannot be found then print, “No exit was found.” Otherwise, as soon as an exit has
  been found, stop traversing through the maze, and print, “You have found the exit!” Each
  time a cell is visited, print the maze.*/
  public void findExitUsingQueue(){

  }

  /*Resets the maze using the initial file.*/
  public void resetMaze(){

  }

  /*Returns a String representation of the maze*/
  public String toString(){
    String temp = "";
    for(int i = 0; i < numRows; i++){
      for(int j = 0; j < numCols; j++){
        temp += (maze.getData(i, j) + " ")
      }
      temp += "\n";
    }
    return temp;
  }
}
