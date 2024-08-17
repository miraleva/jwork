public class LinkoListo {
    Node startNode;

    public LinkoListo() {
        this.startNode = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (this.startNode == null) {
            this.startNode = newNode;
            return;
        }

        Node lastNode = this.startNode;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList() {
        Node currentNode = this.startNode;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
