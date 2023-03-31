package code_problems.LoopInspector;

public class Node {

    Node before;

    void setNext(Node before) {
        this.before = before;
    }

    Node getNext() {
        return before;
    }

}
