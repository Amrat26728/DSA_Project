
package DSA_Project;

import javax.swing.JOptionPane;


public class DataSaving {
    
    Node head=new Node(null,null,null,null);
    int size;
    
    private class Node{
        
        private String name;
        private String number;
        private String email;
        private String date;
        private Node prev=this, next=this;
        
        public Node(String name, String number, String email, String date){
            this.name=name;
            this.number=number;
            this.email=email;
            this.date=date;
        }
        
        public Node(String name, String number, String email, String date, Node prev, Node next){
            this.name=name;
            this.number=number;
            this.email=email;
            this.date=date;
            this.prev=prev;
            this.next=next;
        }
        
    }
    
    public void add(String name, String number, String email, String date){
        
        head.prev.next = new Node(name, number, email, date, head.prev, head);
        head.prev=head.prev.next;
        size++;
        
    }
    
    public String[] print(){
        
        String[] arr=new String[size*4];
        int i=0;
       
        if(size==0)
        {
            JOptionPane.showMessageDialog(null, "List is empty!");
        }
        
        else
        {
          for(Node n=head.next;n!=head;n=n.next)
            {
                arr[i]=n.name;
                i++;
                arr[i]=n.number;
                i++;
                arr[i]=n.email;
                i++;
                arr[i]=n.date;
                i++;
            }
            return arr;
        }
        return null;
    }
    
    public boolean cancelBooking(String number){
        
        if(head.next.number==null)
        {
            return false;
        }
        
        if(head.next.number.equals(number))
        {
            head.next=head.next.next;
            head.next.next.prev=head;
            size--;
            return true;
        }
        
        else
        {
           for(Node n=head.next;n!=head;n=n.next)
            {
                if(n.next.number.equals(number))
                {
                    n.next=n.next.next;
                    n.next.next.prev=n;
                    size--;
                    return true;
                }
            }
           
        }
        return false;
    }
    
    public String[] search(String number){
       
        String[] arr=new String[4];
        
        for(Node n=head.next;n!=head;n=n.next)
        {
            if(n.number.equals(number))
            {
                arr[0]=n.name;
                arr[1]=n.number;
                arr[2]=n.email;
                arr[3]=n.date;
                return arr;
            }
        }
        return null;
        
    }
    
    
}
