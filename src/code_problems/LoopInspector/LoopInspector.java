package code_problems.LoopInspector;

import java.util.ArrayList;

// https://www.codewars.com/kata/52a89c2ea8ddc5547a000863

public class LoopInspector {


    public static int loopSize(Node node) {
        var visited = new ArrayList<Node>();
        visited.add(node);
        Node nextNode = node.getNext();

        while (!visited.contains(nextNode)) {
            visited.add(nextNode);
            nextNode = nextNode.getNext();
        }
        // found the one node that is part of the loop

        Node loopNext = nextNode.getNext();
        int counter = 1;
        // count the loop
        while (true) {
            if (nextNode == loopNext) {
                return counter;
            }
            counter++;
            loopNext = loopNext.getNext();
        }
    }

    public static void main(String[] args) {
        Node first = new Node();
        Node last = new Node();
        first.setNext(last);
        last.setNext(first);
        System.out.println(loopSize(first));
    }
}
