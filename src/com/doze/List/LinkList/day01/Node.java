package com.doze.List.LinkList.day01;

public class Node<E> {

    private E v;    //  node节点元素的值
    Node<E> next;   //当前节点指向的下一个

    Node<E> tailNode;


    /**
     * 单向链表
     * @param args
     */
    public static void main(String[] args) {
        Node<String> node3 = new Node<>();
        node3.v = "c";
        Node<String> node2 = new Node<>();
        node2.v = "b";
        Node<String> node1 = new Node<>();
        node1.v = "a";

        node1.next = node2;
        node2.next = node3;

        show(node1);

        //新增节点
        System.out.println("--------新增-------");

        Node<String> node4 = new Node<>();
        node4.v = "d";

        addNode(node3,node4);

        show(node1);

        System.out.println("--------删除-------");

        node1.next = node3;

        show(node1);
    }

    /**
     * 根据该链表从头遍历到尾部
     * @param node
     */
    public static void show(Node<?> node) {
        Node<?> cuNode = node;

        while (cuNode != null) {
            System.out.println(cuNode.v);
            cuNode = cuNode.next;
        }
    }

    public static void addNode(Node<String> tailNode, Node<String> newNode) {
        tailNode.next = newNode;
    }
}
