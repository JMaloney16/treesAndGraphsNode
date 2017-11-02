package com.company;

public class Main {

    public static void main(String[] args) {
        Node root = new Node("Vertebrates");

        Node fish = new Node("Fish");
        root.addEdge(fish);

        Node salmon = new Node("Salmon");
        fish.addEdge(salmon);

        Node birds = new Node("Birds");
        root.addEdge(birds);

        Node quail = new Node("Quail");
        birds.addEdge(quail);

        printTree(root, 0);
    }

    private static void printTree(Node node, int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.println("---");
        }
        System.out.println("> " + node.getValue());
        for (Node child : node.getEdges()) {
            printTree(child, depth+1);
        }
    }
}
