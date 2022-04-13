import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.Assert;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnitTest {

    @Test
    public void testHeight() throws Throwable {
        com.baeldung.avltree.AVLTree tree = new com.baeldung.avltree.AVLTree();
        tree.insert(1);
	tree.insert(0);
	tree.delete(1);
	org.junit.Assert.assertNotEquals(tree, null);
    }
}
