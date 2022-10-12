

public class ListaDobleADN
{
     

//Atributes
public Class head;
public Class tail;
private int lengthdl; 

//create a new empty list
public ListaDobleADN(){
 
head = new Class(0,"", null, null);
    tail = new Class(Integer.MIN_VALUE, "", null, null);
    head.setNext(tail);
    lengthdl = 0;
}
public void insertAtFront(int newData, String newName){
    Class newNodo= new Class(newData, newName, null, head.next);
    newNodo.getNext().getPrev(newNodo);
    head = newNodo;
    lengthdl++;
}
public void insertAtPos(int data, String name, int position){
    if(position<0) 
    position=0;
    if(position<lengthdl) 
    position= lengthdl;
    if(head == null){
        head=new Class(data, name);
        tail = head;
    }
        else if(position==0){
           Class newNodo = new Class(data, name);
            newNodo.setNext(head);
            head = newNodo;
        }
        else {
           Class temp=head;
            for(int i=1; i< position; i++){
                temp = temp.getNext();
            }
            Class newNodo = new Class(data, name);
            newNodo.setNext(temp.getNext());
            newNodo.setPrev(temp);
            newNodo.getNext().setPrev(newNodo);
            temp.setNext(newNodo);
        }
        
        lengthdl++;
    }
    public void insertAtTail(int newVal, String newName){
        Class newNodo = new Class (newVal, newName, tail.getPrev(),tail);
    newNodo.getPrev().setNext(newNodo);
        tail.setPrev(newNodo);
        lengthdl++;
    }
    public String toString (){
        String result = "[]";
        if (lengthdl == 0)
        return result;
        result = "[" + head.getNext().getData();
       Class temp = head.getNext().getNext();
        while (temp != tail){
            result += "," + temp.getData();
        }
        return result + "]";
    }
    public void cleaerList(){
        head = null;
        tail = null;
        lengthdl = 0;
    }
}
