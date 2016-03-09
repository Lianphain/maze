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
* FILE: SLLNode.java
*
* DESCRIPTION: This file contains the methods and variables necessary to create a single linked list node
*
***************************************************************************************/

public class SLLNode<E> {

    private SLLNode<E> next;
    private E data;

  /********************************************************************
	*
	* Method: SLLNode
	*
	* Description: Constructor, creates a SLLNode
	*
	* @param E newData
	*
	* @return None
	*
	********************************************************************/

	public SLLNode(E newData){
		data = newData;
		next = null;
	}

	/********************************************************************
	*
	* Method: setData
	*
	* Description: Set the data at the specific node to whatever the user desires
	*
	* @param E newData
	*
	* @return None
	*
	********************************************************************/

	public void setData(E newData){
		data = newData;
	}

	/********************************************************************
	*
	* Method: getData
	*
	* Description: Returns the data of the specific node
	*
	* @param None
	*
	* @return data
	*
	********************************************************************/

	public E getData(){
		return data;
	}

	/********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param SLLNode<E> node
	*
	* @return None
	*
	********************************************************************/

	public void setNext(SLLNode<E> node){
		next = node;
	}

	/********************************************************************
	*
	* Method: getNext
	*
	* Description: Returns the next variable from the specific node
	*
	* @param None
	*
	* @return next
	*
	********************************************************************/

	public SLLNode<E> getNext(){
		return next;
	}
}
