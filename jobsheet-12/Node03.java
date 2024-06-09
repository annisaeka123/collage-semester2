/**
 * Node03
 */
public class Node03 {

    int data, jarak;
    Node03 prev, next;

    Node03(Node03 prev, int data, int jarak, Node03 next) {
        this.prev=prev;
        this.data=data;
        this.jarak=jarak;
        this.next=next;
    }
}