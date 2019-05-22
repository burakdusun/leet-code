package Medium;

// solution for https://leetcode.com/problems/design-circular-queue/

class MyCircularQueue {

    int size;
    int[] queue;
    int front;
    int rear;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        size = k;
        front = -1;
        rear = -1;
        queue = new int[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) return false;
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        queue[rear] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) return false;
        // queue[front] = 0;
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (!isEmpty()) return queue[front];
        else return -1;
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (!isEmpty()) return queue[rear];
        else return -1;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (front == -1) return true;
        return false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if ((rear + 1) % size == front) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */