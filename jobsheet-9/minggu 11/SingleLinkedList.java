public class SingleLinkedList {

    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if(!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        Node ndInput = new Node(input);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input);
        Node temp = head;
        while(temp != null){
            if(temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        if(index < 0) {
            System.out.println("perbaiki logikanya!" + "Index tidak boleh negative");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node ndInput = new Node(input);
            Node temp = head;
            for(int i = 0; i < index-1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(temp.next.next == null) {
                    tail = temp.next;
                }
            } else {
                System.out.println("Index diluar batas!");
            }
        }
    }
}