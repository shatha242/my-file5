package ss;

/**
 * Created by DELL on 2/26/2021.
 */
public class DoublyLinkedList<E> {
    public DoublyLinkedList<E>
    clone()
            throws CloneNotSupportedException {
        DoublyLinkedList<E> other = new DoublyLinkedList<E>();

        if (size > 0) {
            DoublyLinkedList <E> walk = header.getNext();
            for(int i = 0; i < size; i++)
            {

                other.addLast(walk.getElement());
                walk = walk.getNext();
            }
        }
        return other;
    }
}
