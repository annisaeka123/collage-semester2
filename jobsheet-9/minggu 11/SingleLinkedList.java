public class SingleLinkedList {

    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if(isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            Node tmp = head;
            System.out.print("Isi Linked List: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
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

    int getData(int index) {
        Node tmp = head;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while(tmp != null){
            if (tmp.data == key) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    void removeFirst(){
        if(isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if(head == tail) {
            head = tail = null;
        } else{
            Node temp = head;
            while(temp.next != null && temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else{
            Node temp = head;
            while(temp != null) {
                if(temp.data != key && temp == head){
                    removeFirst();
                    break;
                } else if(temp.next.data == key) {
                    temp.next = temp.next.next;
                    if(temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next =temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}