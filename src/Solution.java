public class Solution {
    public void enQueue(int key) {
        Node temp = new Node(key);
        Queue queue = new Queue();
        if (queue.rear == null) {
            queue.front = queue.rear = temp;
            return;
        }
        queue.rear.link = temp;
        queue.rear = temp;
    }

    public Node dequeue() {
        Queue queue = new Queue();
        if (queue.front == null)
            return null;
        Node temp = queue.front;
        queue.front = queue.front.link;
        if (queue.front == null)
            queue.rear = null;
        return temp;
    }
}
