public class LinkoListo  {
    Node startNode; 

    public LinkoListo(){
        this.startNode= null;
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(this.startNode ==null){
           this.startNode= newNode;
           return;
        }
    }
}