// Tat Putjorn 672115024 //

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(CovidVaccine data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void delete(int sid) {
        if (head == null) return;
        if (head.data.getSid() == sid) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data.getSid() != sid) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void deleteAll() {
        head = null;
    }

    public int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
