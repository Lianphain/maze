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
* FILE: Stack.java
*
* DESCRIPTION: This file contains the methods to create and modify a stack
*
***************************************************************************************/

import java.util.*;

public class Stack<E> {

    SLLNode<E> stacktop;

  /********************************************************************
	*
	* Method: Stack
	*
	* Description: Constructor, creates a Stack
	*
	* @param E newData
	*
	* @return None
	*
	********************************************************************/

    public Stack(){
        stacktop = null;
    }

  /********************************************************************
	*
	* Method: push
	*
	* Description: adds the given element to the top of the stack and returns the element that was added
	*
	* @param E element
	*
	* @return E element
	*
	********************************************************************/

    public E push(E element){
        //pushes the egiven element to the top of the stack and returns the element
        if(stacktop == null){
            stacktop = new SLLNode(element);
        }
        else {
            SLLNode temp = stacktop;
            stacktop = new SLLNode(element);
            stacktop.setNext(temp);
        }
        return element;
    }

  /********************************************************************
	*
	* Method: pop
	*
	* Description: Removes the top element and returns it
	*
	* @param None
	*
	* @return E temp
	*
	********************************************************************/

    public E pop(){
        //Removes and returns the element at the top of the Stack, or throws an
        //EmptyStackException otherwise
        if(stacktop == null){
            throw new EmptyStackException();
        }
        else{
            E temp = stacktop.getData();
            stacktop = stacktop.getNext();
            return temp;
        }
    }

  /********************************************************************
	*
	* Method: peek
	*
	* Description: Looks at the top of the stack and returns the element
	*
	* @param None
	*
	* @return E data
	*
	********************************************************************/

    public E peek(){
        //Returns the element at the top of the Stack, or throws an
        //EmptyStackException otherwise
        if(stacktop == null){
            throw new EmptyStackException();
        }
        else{
            return stacktop.getData();
        }
    }

  /********************************************************************
	*
	* Method: empty
	*
	* Description: Checks if the stack is empty. True if it is, false otherwise
	*
	* @param None
	*
	* @return boolean empty
	*
	********************************************************************/

    public boolean empty(){
        //Returns true if the Stack is empty, or false otherwise
        boolean empty = false;
        if(stacktop == null){
            empty = true;
        }
        return empty;
    }

}
