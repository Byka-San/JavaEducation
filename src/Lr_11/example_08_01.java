package Lr_11;

import java.util.NoSuchElementException;

public class example_08_01 {
    public class LinkedList<T> {
        private Node head;
        private Node tail;
        private int size;

        public void createHead(T data) {
            Node newNode = new Node<>(data);
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
            Node newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public void insert(int index, T data) {
            if (index == 0) {
                createHead(data);
            } else if (index == size) {
                createTail(data);
            } else if (index > 0 && index < size) {
                Node newNode = new Node<>(data);
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
                size++;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public T removeFirst() {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            T data = (T) head.data;
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
            T data = (T) tail.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node current = head;
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
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                T data = (T) current.next.data;
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
            Node current = head;
            while (current != null) {
                sb.append(current.data);
                current = current.next;
            }
            return sb.toString();
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

