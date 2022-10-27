import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

    @Test
    public void testPrepend() {
        LinkedList list = new LinkedList();

        // insert head: 1 2 3 
        list.prepend(3);
        list.prepend(2);
        list.prepend(1);

        assertEquals("1 2 3 ", list.toString());
    }

    @Test
    public void testAppend() {
        LinkedList list = new LinkedList();

        // insert head: 1 2 3 
        list.prepend(3);
        list.prepend(2);
        list.prepend(1);

        // insert after
        list.append(4);
        list.append(5);
        list.append(6);

        assertEquals("1 2 3 4 5 6 ", list.toString());
    }
}
