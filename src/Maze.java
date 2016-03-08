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
  int rows;
  int cols;



  /* Constructs the maze of a given size, using the given file.*/
  public Maze(int numRows, int numCols, String filename){
    rows = numRows;
    cols = numCols;
    Scanner fr = new Scanner(filename);
    while(fr.hasNext()){
      
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

  }
}
