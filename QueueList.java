public class QueueList {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(8);
        queue.enqueue(9);

        QueueNode result = queue.dequeue(); 
        System.out.println(result.val);
        result = queue.dequeue(); 
        System.out.println(result.val);

        queue.enqueue(17);
        result = queue.dequeue(); 
        System.out.println(result.val);
    }
}

class Queue {
    QueueNode firstNode = null;
    QueueNode lastNode = null;

    
    public void enqueue(int val) {
        QueueNode newNode = new QueueNode(val);
        if (this.firstNode == null) {
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            this.lastNode.nextNode = newNode;
            this.lastNode = newNode;
        }
    }

    
    public QueueNode dequeue() {
        if (this.firstNode == null) {
            return null; 
        }
        QueueNode temp = this.firstNode;
        this.firstNode = this.firstNode.nextNode;
        if (this.firstNode == null) {
            this.lastNode = null; 
        }
        return temp;
    }
}

class QueueNode {
    int val; 
    QueueNode nextNode;

    public QueueNode(int val) {
        this.val = val;
        this.nextNode = null;
    }
}
