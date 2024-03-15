package HomeWork28;

    class HomeWork28 {
    private NodeExample head;

    public  HomeWork28() {
        this.head = null;
    }

    public void putToTheEnd(int data) {
        NodeExample newNode = new NodeExample(data);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeExample current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        NodeExample current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public NodeExample findKthFromEnd(int k) {
        if (head == null || k <= 0) {
            return null;
        }

        NodeExample slow = head;
        NodeExample fast = head;


        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }


        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        HomeWork28 list = new HomeWork28();
        list.putToTheEnd(1);
        list.putToTheEnd(2);
        list.putToTheEnd(30);
        list.putToTheEnd(4);
        list.putToTheEnd(5);

        int k = 2;

        NodeExample kthFromEnd = list.findKthFromEnd(k);
        if (kthFromEnd != null) {
            System.out.println("Элемент на позиции " + k + " с конца: " + kthFromEnd.data);
        } else {
            System.out.println("Список слишком короткий.");
        }



    }
}

