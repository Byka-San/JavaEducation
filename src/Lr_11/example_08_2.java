package Lr_11;
import java.util.NoSuchElementException;
public class example_08_2 {
    public class LinkedList<T> {
        private Node<T> head;
        private Node<T> tail;
        private int size;

        public void createHead(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        public void createTail(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public void createHeadRec(T data) {
            if (isEmpty()) {
                head = new Node<>(data);
                tail = head;
                size++;
            } else {
                Node<T> newNode = new Node<>(data);
                newNode.next = head;
                head = newNode;
                size++;
            }
        }

        public void createTailRec(T data) {
            if (isEmpty()) {
                head = new Node<>(data);
                tail = head;
                size++;
            } else {
                tail = createTailRec(data, head);
            }
        }

        private Node<T> createTailRec(T data, Node<T> node) {
            if (node.next == null) {
                node.next = new Node<>(data);
                size++;
                return node.next;
            }
            return createTailRec(data, node.next);
        }

        public T removeFirst() {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            T data = head.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            size--;
            return data;
        }

        public T removeLast() {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            T data = tail.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node<T> current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            size--;
            return data;
        }

        public T remove(int index) {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (index == 0) {
                return removeFirst();
            } else if (index == size - 1) {
                return removeLast();
            } else if (index > 0 && index < size - 1) {
                Node<T> current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                T data = current.next.data;
                current.next = current.next.next;
                size--;
                return data;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public void addFirst(T data) {
            createHead(data);
        }

        public void addLast(T data) {
            createTail(data);
        }

        public String toString() {
            if (isEmpty()) {
            }

            StringBuilder sb = new StringBuilder();
            Node<T> current = head;
            while (current != null) {
                sb.append(current.data);
                current = current.next;
            }
            return sb.toString();
        }

        public String toStringRec() {
            return toStringRec(head);
        }

        private String toStringRec(Node<T> node) {
            if (node == null) {
            }
            return node.data + toStringRec(node.next);
        }

        public boolean isEmpty() {
            return head == null;
        }

        private static class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
            }
        }
    }
}
