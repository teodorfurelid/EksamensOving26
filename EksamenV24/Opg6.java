/*-----------------------------------*/

public class Node {
    int data;
    Node neste;

    public Node(int data) {
        this.data = data;
        this.neste = null;
    }
}

/*-----------------------------------*/

public int antallNoderIterativt(Node first) {
    int count = 0;
    Node current = first;

    while (current != null) {
        count++;
        current = current.neste;
    }

    return count;
}

public int antallNoderRekursivt(Node first) {
    if (current == null) {
        return 0;
    }

    return 1 + antallNoderRekursivt(first.neste);
}