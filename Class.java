import java.util.NoSuchElementException;
public class Class
{
    private int data;
    private String name;
    public Class prev;
    public Class next;

    /*
     * @param pdata Contiene un dato numerico
     */
    public Class(){
        
    }
    
    public Class(int pdata){
        data = pdata;
        name = "";
        prev = null;
        next = null;
    }
    public Class(int data, String name){
        this.data = data;
        this.name = name;
        prev = prev;
        next = next;
    }
    
    public Class(int data,String name, Class prev, Class next){
        this.data = data;
        this.name = name;
        this.prev = prev;
        this.next = next;
        
    }
   
    public int getData(){
        return data;
    }
    public void setData(int valor){
         data = valor;
    }
    
    public Class getPrev(){
        return prev;
    }
    
    public Class getNext(){
        return next;
    }
    
    public void setNext(Class node){
        next = node;
    }
    public void setPrev(Class node){
        prev = node;
    }
    public Class clone(){
        return new Class(data, name, prev, next);
    }
    void getPrev(Class newNodos){
        
    }
}

