package com.doze.List.LinkList.day02;

public class DozeLinkedList<E> {

    private Node<E> first;  //  第一个节点
    private Node<E> last;   //  尾节点
    private int size;


    //LinkedList底层基于链表
    private static class Node<E> {
        private E item; //  当前节点的值
        private Node<E> prev;   //  当前上一个节点
        private Node<E> next;   //  当前下一个节点

        /**
         *
         * @param prev  当前节点的上一个节点
         * @param item  当前节点的元素值
         * @param next  当前节点的下一个节点
         */
        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    private void add(E e) {
        //创建一个新的Node节点
        Node l = last;  //  当前链表中的最后一个节点

        //新的节点就是当前链表中的最后一个节点
        Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) {
            //  没有最后一个节点,表示当前链表为空
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    private E get(int index) {
        return node(index).item;
    }

    private E remove(int index) {
        return unlink(node(index));
    }

    private E unlink(Node<E> node) {
        Node<E> prev = node.prev;   //  删除节点的上一个节点
        Node<E> next = node.next;   //  删除节点的下一个节点
        final E element = node.item;    //  当前节点的元素值

        if (prev == null) { //头节点时
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }
        if (next == null) { //尾节点时
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }

        node.item = null;   //  通知gc回收

        size--;
        return element;
    }

    Node<E> node(int index) {
        if (index < size>>2) {
            //查询链表左边
            Node<E> f = first;
            for (int i = 0; i < index; i++) {
                f = f.next;
            }
            return f;
        } else {
            //查询链表右边
            Node<E> l = last;
            for (int i = size - 1; i > index; i--) {
                l = l.prev;
            }
            return l;
        }
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        DozeLinkedList<String> stringDozeLinkedList = new DozeLinkedList<>();
        stringDozeLinkedList.add("a");
        stringDozeLinkedList.add("b");
        stringDozeLinkedList.add("c");
        stringDozeLinkedList.add("d");

        System.out.println(stringDozeLinkedList.get(2));

        stringDozeLinkedList.remove(2);

        System.out.println(stringDozeLinkedList.get(2));
    }
}
