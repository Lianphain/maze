/***************************************************************************************
*
* NAME: Kahlin Baughman
*
* HOMEWORK: 5
*
* CLASS: ICS 211
*
* INSTRUCTOR: Scott Robertson
*
* DATE: February 26, 2016
*
* FILE: Queue.java
*
* DESCRIPTION: This file contains the methods and variables necessary to create a and modify a Queue
*
***************************************************************************************/

import java.util.*;

public class Queue<E> {
    
    SLLNode<E> queuestart;
    
        /********************************************************************
	*
	* Method: Queue
	*
	* Description: Constructor, when called makes a queue
	*
	* @param E element
	*
	* @return E element
	*
	********************************************************************/
    
    public Queue(){
        queuestart = null;
    }
    
        /********************************************************************
	*
	* Method: offer
	*
	* Description: Adds the given element to the end of the queue and returns the element
	*
	* @param E element
	*
	* @return E element
	*
	********************************************************************/
    
    public E offer(E element){
        //Adds the given element to the end of the queue and returns the element
        if(queuestart == null){
            queuestart = new SLLNode(element);
        }
        else{
            SLLNode curr = queuestart;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(new SLLNode(element));
        }
        return element;
    }
    
        /********************************************************************
	*
	* Method: poll
	*
	* Description: Removes and returns the head of the queue, or returns null if the queue is empty
	*
	* @param None
	*
	* @return E poll
	*
	********************************************************************/
    
    public E poll(){
        //Removes and returns the head of the queue, or returns null if the queue
        //is empty
        E poll = null;
        if(queuestart == null){
            
        }
        else{
            poll = queuestart.getData();
            queuestart = queuestart.getNext();
        }
        return poll;
    }
    
        /********************************************************************
	*
	* Method: remove
	*
	* Description: Removes and returns the head of the queue, or throws a NoSuchElementException if the queue is empty
	*
	* @param None
	*
	* @return E remove
	*
	********************************************************************/
    
    public E remove(){
        //Removes and returns the head of the queue, or throws a
        //NoSuchElementException if the queue is empty
        if(queuestart == null){
            throw new NoSuchElementException();
        }
        else{
            E remove = queuestart.getData();
            queuestart = queuestart.getNext();
            return remove;
        }
    }
    
        /********************************************************************
	*
	* Method: peek
	*
	* Description: Returns the head of the queue, or returns null if the queue is empty
	*
	* @param None
	*
	* @return E peek
	*
	********************************************************************/
    
    public E peek(){
        //Returns the head of the queue, or returns null if the queue is empty
        E peek = null;
        if(queuestart == null){
            
        }
        else{
            peek = queuestart.getData();
        }
        return peek;
    }
    
        /********************************************************************
	*
	* Method: element
	*
	* Description: Returns the head of the queue, or throws a NoSuchElementException if the queue is empty
	*
	* @param None
	*
	* @return E element
	*
	********************************************************************/
    
    public E element(){
        //Returns the head of the queue, or throws a NoSuchElementException if
        //the queue is empty
        if(queuestart == null){
            throw new NoSuchElementException();
        }
        else{
            E element = queuestart.getData();
            return element;
        }
    }
}
