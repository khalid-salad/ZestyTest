import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (short) 1);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.find((-1));
        int int15 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree16 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree16.getBalance(node19);
        aVLTree16.insert((int) '4');
        aVLTree16.delete((int) (short) 1);
        aVLTree16.insert(0);
        aVLTree16.delete((int) (byte) 1);
        com.baeldung.avltree.AVLTree aVLTree29 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        aVLTree29.delete(1);
        aVLTree29.delete((int) '#');
        aVLTree29.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree29.getRoot();
        aVLTree29.insert(10);
        aVLTree29.delete(1);
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree29.getRoot();
        int int46 = aVLTree29.height();
        com.baeldung.avltree.AVLTree aVLTree47 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node50 = null;
        int int51 = aVLTree47.getBalance(node50);
        aVLTree47.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree47.find((int) ' ');
        int int56 = aVLTree47.height();
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree47.getRoot();
        int int58 = aVLTree29.getBalance(node57);
        int int59 = aVLTree16.getBalance(node57);
        int int60 = aVLTree0.getBalance(node57);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find(10);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        aVLTree0.delete(2);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        int int9 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (byte) -1);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree10.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree19.getRoot();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree19.getRoot();
        aVLTree19.delete((int) (byte) 10);
        int int29 = aVLTree19.height();
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree19.find((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        com.baeldung.avltree.AVLTree aVLTree42 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.insert((int) (byte) 100);
        aVLTree42.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree42.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree51 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree51.find((int) '4');
        aVLTree51.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree51.getRoot();
        aVLTree51.delete(0);
        com.baeldung.avltree.AVLTree.Node node59 = null;
        int int60 = aVLTree51.getBalance(node59);
        int int61 = aVLTree51.height();
        com.baeldung.avltree.AVLTree aVLTree62 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node65 = aVLTree62.getRoot();
        aVLTree62.delete(100);
        aVLTree62.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree62.getRoot();
        int int71 = aVLTree51.getBalance(node70);
        int int72 = aVLTree42.getBalance(node70);
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree42.getRoot();
        int int74 = aVLTree19.getBalance(node73);
        int int75 = aVLTree0.getBalance(node73);
        com.baeldung.avltree.AVLTree.Node node76 = aVLTree0.getRoot();
        int int77 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) 'a');
        int int18 = aVLTree0.height();
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        int int15 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert(0);
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) ' ');
        int int38 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree11.getRoot();
        com.baeldung.avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree11.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree21.find((int) 'a');
        aVLTree21.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree28 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.insert((int) (byte) 100);
        aVLTree28.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree28.find((int) (byte) 100);
        int int37 = aVLTree21.getBalance(node36);
        int int38 = aVLTree11.getBalance(node36);
        int int39 = aVLTree0.getBalance(node36);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass45 = node44.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        com.baeldung.avltree.AVLTree aVLTree6 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree6.find((int) (byte) 0);
        aVLTree6.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        int int25 = aVLTree19.height();
        aVLTree19.insert(1);
        aVLTree19.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree19.find((int) (short) 1);
        int int32 = aVLTree6.getBalance(node31);
        int int33 = aVLTree0.getBalance(node31);
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree34.getBalance(node37);
        aVLTree34.insert(0);
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree34.find((int) (short) 0);
        int int43 = aVLTree0.getBalance(node42);
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete(2);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert(0);
        com.baeldung.avltree.AVLTree aVLTree18 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.insert((int) (byte) 100);
        aVLTree18.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree11.find((int) (short) 100);
        aVLTree11.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree11.find(0);
        int int33 = aVLTree0.getBalance(node32);
        int int34 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree35 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        aVLTree35.insert((int) (byte) 100);
        aVLTree35.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree35.find((int) (byte) 100);
        int int44 = aVLTree0.getBalance(node43);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) (byte) -1);
        int int17 = aVLTree12.height();
        int int18 = aVLTree12.height();
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree12.find((int) '#');
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree21.find((int) 'a');
        aVLTree21.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree28 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.insert((int) (byte) 100);
        aVLTree28.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree28.find((int) (byte) 100);
        int int37 = aVLTree21.getBalance(node36);
        int int38 = aVLTree12.getBalance(node36);
        aVLTree12.insert((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree12.find((int) '4');
        com.baeldung.avltree.AVLTree aVLTree43 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree43.getBalance(node46);
        aVLTree43.insert(0);
        aVLTree43.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree43.getRoot();
        int int53 = aVLTree12.getBalance(node52);
        int int54 = aVLTree0.getBalance(node52);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        com.baeldung.avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.find(0);
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree37 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree0.find(1);
        int int54 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree0.getBalance(node55);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        int int7 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) (byte) -1);
        int int10 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete((int) (short) 1);
        aVLTree0.delete(0);
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        com.baeldung.avltree.AVLTree aVLTree3 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        aVLTree0.insert((int) (short) 1);
        int int24 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree0.find(2);
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        com.baeldung.avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass50 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        com.baeldung.avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        int int43 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree0.find((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree5 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree12.find((int) ' ');
        int int21 = aVLTree12.height();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree12.getRoot();
        int int23 = aVLTree5.getBalance(node22);
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        com.baeldung.avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        int int34 = aVLTree24.height();
        aVLTree24.delete(100);
        com.baeldung.avltree.AVLTree aVLTree37 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.delete(100);
        aVLTree37.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree37.getRoot();
        int int46 = aVLTree24.getBalance(node45);
        int int47 = aVLTree5.getBalance(node45);
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree5.getRoot();
        int int49 = aVLTree0.getBalance(node48);
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree0.getRoot();
        int int51 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree8.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree0.find((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree0.getRoot();
        int int34 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        aVLTree0.delete((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert(0);
        aVLTree12.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        com.baeldung.avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        com.baeldung.avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree24.getBalance(node34);
        com.baeldung.avltree.AVLTree aVLTree36 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree36.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree36.getRoot();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree36.getRoot();
        com.baeldung.avltree.AVLTree aVLTree46 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.insert((int) (byte) 100);
        aVLTree46.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree46.find((int) (byte) 100);
        int int55 = aVLTree36.getBalance(node54);
        int int56 = aVLTree24.getBalance(node54);
        int int57 = aVLTree12.getBalance(node54);
        aVLTree12.insert((int) '#');
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree12.getRoot();
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree12.find(100);
        com.baeldung.avltree.AVLTree.Node node64 = aVLTree12.find(1);
        com.baeldung.avltree.AVLTree.Node node66 = aVLTree12.find(1);
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree12.find((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree12.find(10);
        int int71 = aVLTree0.getBalance(node70);
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(node73);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        com.baeldung.avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree0.getRoot();
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find(10);
        aVLTree0.insert((int) '#');
        int int14 = aVLTree0.height();
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert(0);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree0.getBalance(node22);
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        aVLTree24.delete(1);
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree24.getRoot();
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree24.find((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        aVLTree24.insert((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree24.getRoot();
        int int40 = aVLTree0.getBalance(node39);
        int int41 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) ' ');
        int int7 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        int int16 = aVLTree0.height();
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree2 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree2.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree2.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree2.find((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree8.getRoot();
        aVLTree8.delete(0);
        com.baeldung.avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree8.getBalance(node16);
        int int18 = aVLTree8.height();
        aVLTree8.delete(100);
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        aVLTree21.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree8.getBalance(node29);
        int int31 = aVLTree2.getBalance(node29);
        int int32 = aVLTree0.getBalance(node29);
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree0.find((int) (short) -1);
        int int35 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        com.baeldung.avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        int int43 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree0.find((int) 'a');
        aVLTree0.delete(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) (byte) 1);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find(10);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree6 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        aVLTree6.insert((int) (byte) 100);
        int int17 = aVLTree6.height();
        aVLTree6.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree6.find(0);
        aVLTree6.insert(1);
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        aVLTree24.delete(1);
        aVLTree24.delete((int) '#');
        aVLTree24.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree24.getRoot();
        aVLTree24.insert(10);
        aVLTree24.delete(1);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree24.getRoot();
        int int41 = aVLTree6.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        com.baeldung.avltree.AVLTree aVLTree43 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree43.getBalance(node46);
        aVLTree43.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree43.find((int) ' ');
        int int52 = aVLTree43.height();
        aVLTree43.delete(0);
        int int55 = aVLTree43.height();
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree43.getRoot();
        int int57 = aVLTree0.getBalance(node56);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) '4');
        int int13 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.insert((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find(100);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree6 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        com.baeldung.avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        aVLTree0.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree32.getBalance(node35);
        aVLTree32.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree32.find((int) ' ');
        int int41 = aVLTree32.height();
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree32.getRoot();
        com.baeldung.avltree.AVLTree aVLTree43 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        aVLTree43.insert((int) (byte) 100);
        int int54 = aVLTree43.height();
        aVLTree43.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree43.find(0);
        int int59 = aVLTree43.height();
        com.baeldung.avltree.AVLTree.Node node61 = aVLTree43.find((int) (short) 10);
        int int62 = aVLTree32.getBalance(node61);
        int int63 = aVLTree0.getBalance(node61);
        com.baeldung.avltree.AVLTree aVLTree64 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree64.getBalance(node65);
        com.baeldung.avltree.AVLTree aVLTree67 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree67.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree67.getBalance(node70);
        aVLTree67.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node75 = aVLTree67.find((int) ' ');
        int int76 = aVLTree67.height();
        com.baeldung.avltree.AVLTree.Node node77 = aVLTree67.getRoot();
        int int78 = aVLTree64.getBalance(node77);
        int int79 = aVLTree64.height();
        com.baeldung.avltree.AVLTree.Node node80 = aVLTree64.getRoot();
        com.baeldung.avltree.AVLTree aVLTree81 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node83 = aVLTree81.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node85 = aVLTree81.find((int) 'a');
        aVLTree81.insert((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node88 = aVLTree81.getRoot();
        int int89 = aVLTree64.getBalance(node88);
        int int90 = aVLTree0.getBalance(node88);
        com.baeldung.avltree.AVLTree.Node node92 = aVLTree0.find(10);
        int int93 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        com.baeldung.avltree.AVLTree aVLTree14 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree14.find((-1));
        int int17 = aVLTree14.height();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree14.find((int) (byte) 100);
        aVLTree14.delete((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree14.find((int) (byte) 10);
        aVLTree14.delete((int) (byte) -1);
        com.baeldung.avltree.AVLTree aVLTree27 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree27.getBalance(node28);
        aVLTree27.insert((int) (byte) 100);
        aVLTree27.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree27.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree27.getRoot();
        com.baeldung.avltree.AVLTree aVLTree37 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree37.getRoot();
        int int45 = aVLTree27.getBalance(node44);
        aVLTree27.delete(1);
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree27.getRoot();
        int int49 = aVLTree14.getBalance(node48);
        int int50 = aVLTree0.getBalance(node48);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        int int12 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        int int18 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree0.getRoot();
        aVLTree0.delete((-1));
        aVLTree0.delete((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree0.find((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree0.find((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree29 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree29.getRoot();
        aVLTree29.delete((int) (short) 100);
        com.baeldung.avltree.AVLTree aVLTree36 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree36.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree36.getRoot();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree36.getRoot();
        aVLTree36.delete((int) (byte) 10);
        int int46 = aVLTree36.height();
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree36.find((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree49 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.delete(100);
        aVLTree49.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree49.getRoot();
        int int58 = aVLTree36.getBalance(node57);
        com.baeldung.avltree.AVLTree aVLTree59 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node60 = null;
        int int61 = aVLTree59.getBalance(node60);
        aVLTree59.insert((int) (byte) 100);
        aVLTree59.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree59.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree68 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        aVLTree68.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree68.getRoot();
        aVLTree68.delete(0);
        com.baeldung.avltree.AVLTree.Node node76 = null;
        int int77 = aVLTree68.getBalance(node76);
        int int78 = aVLTree68.height();
        com.baeldung.avltree.AVLTree aVLTree79 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node81 = aVLTree79.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node82 = aVLTree79.getRoot();
        aVLTree79.delete(100);
        aVLTree79.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node87 = aVLTree79.getRoot();
        int int88 = aVLTree68.getBalance(node87);
        int int89 = aVLTree59.getBalance(node87);
        com.baeldung.avltree.AVLTree.Node node90 = aVLTree59.getRoot();
        int int91 = aVLTree36.getBalance(node90);
        int int92 = aVLTree29.getBalance(node90);
        int int93 = aVLTree0.getBalance(node90);
        com.baeldung.avltree.AVLTree.Node node94 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNull(node94);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree6 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        com.baeldung.avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree6.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        int int17 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        int int25 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree7.find(100);
        com.baeldung.avltree.AVLTree aVLTree14 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        aVLTree0.delete((int) (byte) -1);
        com.baeldung.avltree.AVLTree aVLTree27 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree27.getRoot();
        com.baeldung.avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree27.getBalance(node33);
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree27.find((int) ' ');
        aVLTree27.insert((-1));
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree27.getRoot();
        aVLTree27.delete((int) (byte) -1);
        aVLTree27.insert(0);
        com.baeldung.avltree.AVLTree aVLTree44 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.insert((int) (byte) 100);
        aVLTree44.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree44.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree53 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        aVLTree53.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree53.getRoot();
        aVLTree53.delete(0);
        com.baeldung.avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree53.getBalance(node61);
        int int63 = aVLTree53.height();
        com.baeldung.avltree.AVLTree aVLTree64 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node66 = aVLTree64.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree64.getRoot();
        aVLTree64.delete(100);
        aVLTree64.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree64.getRoot();
        int int73 = aVLTree53.getBalance(node72);
        int int74 = aVLTree44.getBalance(node72);
        com.baeldung.avltree.AVLTree.Node node75 = aVLTree44.getRoot();
        com.baeldung.avltree.AVLTree.Node node76 = aVLTree44.getRoot();
        int int77 = aVLTree27.getBalance(node76);
        int int78 = aVLTree0.getBalance(node76);
        com.baeldung.avltree.AVLTree.Node node80 = aVLTree0.find((int) '#');
        com.baeldung.avltree.AVLTree.Node node82 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNull(node82);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        com.baeldung.avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        com.baeldung.avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree0.find((-1));
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node53);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree14 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree14.getBalance(node17);
        aVLTree14.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree14.find(100);
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree14.getRoot();
        int int24 = aVLTree0.getBalance(node23);
        aVLTree0.insert((-1));
        aVLTree0.delete((int) (short) 0);
        com.baeldung.avltree.AVLTree aVLTree29 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.insert((int) (byte) 100);
        int int35 = aVLTree29.height();
        aVLTree29.delete((int) (byte) 10);
        aVLTree29.delete((int) (byte) 1);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree29.getRoot();
        com.baeldung.avltree.AVLTree aVLTree41 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        int int44 = aVLTree41.height();
        aVLTree41.insert((-1));
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree41.getRoot();
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree41.getRoot();
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree41.getRoot();
        int int50 = aVLTree29.getBalance(node49);
        int int51 = aVLTree0.getBalance(node49);
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass53 = node52.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete(0);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        int int3 = aVLTree0.height();
        aVLTree0.insert(1);
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree14 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.insert((int) (byte) 100);
        aVLTree14.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree14.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree23 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        aVLTree23.delete(0);
        com.baeldung.avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree23.getBalance(node31);
        int int33 = aVLTree23.height();
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree34.getRoot();
        aVLTree34.delete(100);
        aVLTree34.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree34.getRoot();
        int int43 = aVLTree23.getBalance(node42);
        int int44 = aVLTree14.getBalance(node42);
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree14.getRoot();
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree14.getRoot();
        com.baeldung.avltree.AVLTree aVLTree47 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        aVLTree47.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree47.getRoot();
        aVLTree47.delete(0);
        com.baeldung.avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree47.getBalance(node55);
        com.baeldung.avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree47.getBalance(node57);
        com.baeldung.avltree.AVLTree aVLTree59 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        com.baeldung.avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree59.getBalance(node65);
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree59.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree69 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree69.find((int) 'a');
        aVLTree69.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree76 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        int int85 = aVLTree69.getBalance(node84);
        int int86 = aVLTree59.getBalance(node84);
        int int87 = aVLTree47.getBalance(node84);
        int int88 = aVLTree14.getBalance(node84);
        int int89 = aVLTree7.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        aVLTree0.insert((int) '#');
        int int93 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        com.baeldung.avltree.AVLTree aVLTree6 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree6.find((int) (byte) 0);
        aVLTree6.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        int int25 = aVLTree19.height();
        aVLTree19.insert(1);
        aVLTree19.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree19.find((int) (short) 1);
        int int32 = aVLTree6.getBalance(node31);
        int int33 = aVLTree0.getBalance(node31);
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree34.getBalance(node37);
        aVLTree34.insert(0);
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree34.find((int) (short) 0);
        int int43 = aVLTree0.getBalance(node42);
        aVLTree0.insert((int) '#');
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        com.baeldung.avltree.AVLTree aVLTree3 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.find((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        int int16 = aVLTree10.height();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree10.find((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree10.getRoot();
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree20.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree29 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree29.getRoot();
        aVLTree29.delete(0);
        com.baeldung.avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree29.getBalance(node37);
        int int39 = aVLTree29.height();
        com.baeldung.avltree.AVLTree aVLTree40 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        aVLTree40.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree40.getRoot();
        int int49 = aVLTree29.getBalance(node48);
        int int50 = aVLTree20.getBalance(node48);
        int int51 = aVLTree10.getBalance(node48);
        int int52 = aVLTree0.getBalance(node48);
        aVLTree0.delete(10);
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node59 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node59);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete(0);
        int int29 = aVLTree0.height();
        int int30 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int16 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        aVLTree0.delete((-1));
        aVLTree0.insert(100);
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        int int12 = aVLTree0.height();
        int int13 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        com.baeldung.avltree.AVLTree aVLTree3 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree20.find(100);
        com.baeldung.avltree.AVLTree aVLTree27 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree27.find(100);
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        aVLTree34.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree34.getRoot();
        aVLTree34.delete(0);
        com.baeldung.avltree.AVLTree.Node node42 = null;
        int int43 = aVLTree34.getBalance(node42);
        int int44 = aVLTree34.height();
        com.baeldung.avltree.AVLTree aVLTree45 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.delete(100);
        aVLTree45.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree45.getRoot();
        int int54 = aVLTree34.getBalance(node53);
        com.baeldung.avltree.AVLTree aVLTree55 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        aVLTree55.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree55.getRoot();
        aVLTree55.delete(0);
        com.baeldung.avltree.AVLTree.Node node63 = null;
        int int64 = aVLTree55.getBalance(node63);
        int int65 = aVLTree55.height();
        com.baeldung.avltree.AVLTree aVLTree66 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree66.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree66.getRoot();
        aVLTree66.delete(100);
        aVLTree66.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node74 = aVLTree66.getRoot();
        int int75 = aVLTree55.getBalance(node74);
        int int76 = aVLTree34.getBalance(node74);
        int int77 = aVLTree27.getBalance(node74);
        int int78 = aVLTree20.getBalance(node74);
        int int79 = aVLTree0.getBalance(node74);
        com.baeldung.avltree.AVLTree.Node node80 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node82 = aVLTree0.find((int) 'a');
        int int83 = aVLTree0.height();
        java.lang.Class<?> wildcardClass84 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 1);
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.find(10);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.delete((int) '4');
        int int24 = aVLTree17.height();
        int int25 = aVLTree17.height();
        com.baeldung.avltree.AVLTree aVLTree26 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree26.find((int) 'a');
        int int31 = aVLTree26.height();
        aVLTree26.delete(1);
        aVLTree26.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree36 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree36.getRoot();
        aVLTree36.delete(100);
        int int42 = aVLTree36.height();
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree36.find((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree36.getRoot();
        com.baeldung.avltree.AVLTree aVLTree46 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.insert((int) (byte) 100);
        aVLTree46.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree46.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree55 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        aVLTree55.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree55.getRoot();
        aVLTree55.delete(0);
        com.baeldung.avltree.AVLTree.Node node63 = null;
        int int64 = aVLTree55.getBalance(node63);
        int int65 = aVLTree55.height();
        com.baeldung.avltree.AVLTree aVLTree66 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree66.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree66.getRoot();
        aVLTree66.delete(100);
        aVLTree66.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node74 = aVLTree66.getRoot();
        int int75 = aVLTree55.getBalance(node74);
        int int76 = aVLTree46.getBalance(node74);
        int int77 = aVLTree36.getBalance(node74);
        int int78 = aVLTree26.getBalance(node74);
        int int79 = aVLTree17.getBalance(node74);
        int int80 = aVLTree0.getBalance(node74);
        com.baeldung.avltree.AVLTree.Node node81 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNull(node81);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        aVLTree0.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        int int14 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree6 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        aVLTree0.insert((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 10);
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        int int19 = aVLTree13.height();
        aVLTree13.delete((int) (byte) -1);
        aVLTree13.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree13.getRoot();
        int int25 = aVLTree0.getBalance(node24);
        com.baeldung.avltree.AVLTree aVLTree26 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree26.find((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree26.find((int) (short) 1);
        aVLTree26.insert(0);
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree26.getRoot();
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree26.getRoot();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree26.getRoot();
        int int44 = aVLTree0.getBalance(node43);
        int int45 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        aVLTree0.delete((int) (byte) 1);
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.insert((int) (byte) 100);
        aVLTree8.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree15 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.insert((int) (byte) 100);
        aVLTree15.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree15.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        com.baeldung.avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        int int34 = aVLTree24.height();
        com.baeldung.avltree.AVLTree aVLTree35 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.delete(100);
        aVLTree35.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree35.getRoot();
        int int44 = aVLTree24.getBalance(node43);
        int int45 = aVLTree15.getBalance(node43);
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree15.getRoot();
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree15.getRoot();
        com.baeldung.avltree.AVLTree aVLTree48 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree48.getRoot();
        aVLTree48.delete(0);
        com.baeldung.avltree.AVLTree.Node node56 = null;
        int int57 = aVLTree48.getBalance(node56);
        com.baeldung.avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree48.getBalance(node58);
        com.baeldung.avltree.AVLTree aVLTree60 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        aVLTree60.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node65 = aVLTree60.getRoot();
        com.baeldung.avltree.AVLTree.Node node66 = null;
        int int67 = aVLTree60.getBalance(node66);
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree60.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree70 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node74 = aVLTree70.find((int) 'a');
        aVLTree70.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree77 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node78 = null;
        int int79 = aVLTree77.getBalance(node78);
        aVLTree77.insert((int) (byte) 100);
        aVLTree77.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node85 = aVLTree77.find((int) (byte) 100);
        int int86 = aVLTree70.getBalance(node85);
        int int87 = aVLTree60.getBalance(node85);
        int int88 = aVLTree48.getBalance(node85);
        int int89 = aVLTree15.getBalance(node85);
        int int90 = aVLTree8.getBalance(node85);
        com.baeldung.avltree.AVLTree.Node node91 = aVLTree8.getRoot();
        int int92 = aVLTree0.getBalance(node91);
        java.lang.Class<?> wildcardClass93 = node91.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree8.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        int int7 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) (short) 1);
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        int int14 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree15 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree15.getRoot();
        aVLTree15.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree21.find((int) 'a');
        aVLTree21.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree28 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.insert((int) (byte) 100);
        aVLTree28.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree28.find((int) (byte) 100);
        int int37 = aVLTree21.getBalance(node36);
        int int38 = aVLTree15.getBalance(node36);
        int int39 = aVLTree0.getBalance(node36);
        aVLTree0.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree0.getRoot();
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree8.find(100);
        com.baeldung.avltree.AVLTree aVLTree15 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        com.baeldung.avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        com.baeldung.avltree.AVLTree aVLTree26 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        com.baeldung.avltree.AVLTree aVLTree36 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        com.baeldung.avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        com.baeldung.avltree.AVLTree aVLTree47 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) (byte) 10);
        int int64 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree13.getBalance(node16);
        aVLTree13.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.find((int) ' ');
        int int22 = aVLTree13.height();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree13.getRoot();
        int int24 = aVLTree10.getBalance(node23);
        int int25 = aVLTree0.getBalance(node23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find(10);
        aVLTree0.delete((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        com.baeldung.avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        int int22 = aVLTree12.height();
        com.baeldung.avltree.AVLTree aVLTree23 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree23.getRoot();
        aVLTree23.delete(100);
        aVLTree23.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree23.getRoot();
        int int32 = aVLTree12.getBalance(node31);
        com.baeldung.avltree.AVLTree aVLTree33 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        com.baeldung.avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        int int43 = aVLTree33.height();
        com.baeldung.avltree.AVLTree aVLTree44 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree44.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree44.getRoot();
        aVLTree44.delete(100);
        aVLTree44.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree44.getRoot();
        int int53 = aVLTree33.getBalance(node52);
        int int54 = aVLTree12.getBalance(node52);
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree12.getRoot();
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree12.getRoot();
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree12.getRoot();
        com.baeldung.avltree.AVLTree aVLTree58 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree58.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree58.getBalance(node61);
        aVLTree58.insert(0);
        aVLTree58.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree58.getRoot();
        aVLTree58.delete(0);
        com.baeldung.avltree.AVLTree aVLTree70 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        aVLTree70.delete((int) 'a');
        aVLTree70.delete(1);
        com.baeldung.avltree.AVLTree.Node node77 = aVLTree70.getRoot();
        com.baeldung.avltree.AVLTree.Node node79 = aVLTree70.find((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node80 = aVLTree70.getRoot();
        aVLTree70.delete(0);
        aVLTree70.insert((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node85 = aVLTree70.getRoot();
        int int86 = aVLTree58.getBalance(node85);
        int int87 = aVLTree12.getBalance(node85);
        int int88 = aVLTree0.getBalance(node85);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find(10);
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree12.getRoot();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree12.find((int) (byte) 1);
        int int18 = aVLTree12.height();
        aVLTree12.insert((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree27 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree27.find((int) 'a');
        aVLTree27.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree27.getBalance(node42);
        int int44 = aVLTree21.getBalance(node42);
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree21.getRoot();
        com.baeldung.avltree.AVLTree aVLTree46 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        com.baeldung.avltree.AVLTree aVLTree49 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree55 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree55.getBalance(node58);
        aVLTree55.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree55.find((int) ' ');
        int int64 = aVLTree55.height();
        com.baeldung.avltree.AVLTree.Node node65 = aVLTree55.getRoot();
        int int66 = aVLTree49.getBalance(node65);
        int int67 = aVLTree46.getBalance(node65);
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree46.find((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree70 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        aVLTree70.delete((int) 'a');
        aVLTree70.delete(1);
        aVLTree70.delete((int) '#');
        aVLTree70.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node81 = aVLTree70.getRoot();
        aVLTree70.insert(10);
        aVLTree70.delete(1);
        com.baeldung.avltree.AVLTree.Node node86 = aVLTree70.getRoot();
        int int87 = aVLTree70.height();
        aVLTree70.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node90 = aVLTree70.getRoot();
        int int91 = aVLTree46.getBalance(node90);
        int int92 = aVLTree21.getBalance(node90);
        int int93 = aVLTree12.getBalance(node90);
        int int94 = aVLTree0.getBalance(node90);
        aVLTree0.insert(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((-1));
        int int24 = aVLTree21.height();
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree21.getRoot();
        com.baeldung.avltree.AVLTree aVLTree26 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree35 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree35.getRoot();
        aVLTree35.delete(0);
        com.baeldung.avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree35.getBalance(node43);
        int int45 = aVLTree35.height();
        com.baeldung.avltree.AVLTree aVLTree46 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree46.getRoot();
        aVLTree46.delete(100);
        aVLTree46.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree46.getRoot();
        int int55 = aVLTree35.getBalance(node54);
        int int56 = aVLTree26.getBalance(node54);
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree26.getRoot();
        int int58 = aVLTree21.getBalance(node57);
        int int59 = aVLTree0.getBalance(node57);
        com.baeldung.avltree.AVLTree.Node node61 = aVLTree0.find((int) (byte) 1);
        int int62 = aVLTree0.height();
        java.lang.Class<?> wildcardClass63 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert((int) '#');
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) (short) 10);
        aVLTree0.delete((int) ' ');
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree16 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        aVLTree16.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree16.find(100);
        com.baeldung.avltree.AVLTree aVLTree23 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        aVLTree23.delete(0);
        com.baeldung.avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree23.getBalance(node31);
        int int33 = aVLTree23.height();
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree34.getRoot();
        aVLTree34.delete(100);
        aVLTree34.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree34.getRoot();
        int int43 = aVLTree23.getBalance(node42);
        com.baeldung.avltree.AVLTree aVLTree44 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree44.find((int) '4');
        aVLTree44.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree44.getRoot();
        aVLTree44.delete(0);
        com.baeldung.avltree.AVLTree.Node node52 = null;
        int int53 = aVLTree44.getBalance(node52);
        int int54 = aVLTree44.height();
        com.baeldung.avltree.AVLTree aVLTree55 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree55.getRoot();
        aVLTree55.delete(100);
        aVLTree55.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree55.getRoot();
        int int64 = aVLTree44.getBalance(node63);
        int int65 = aVLTree23.getBalance(node63);
        int int66 = aVLTree16.getBalance(node63);
        int int67 = aVLTree8.getBalance(node63);
        aVLTree8.insert(1);
        com.baeldung.avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree8.getBalance(node70);
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree8.getRoot();
        int int73 = aVLTree0.getBalance(node72);
        aVLTree0.delete((int) '#');
        java.lang.Class<?> wildcardClass76 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        com.baeldung.avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree10.getRoot();
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree10.getRoot();
        com.baeldung.avltree.AVLTree aVLTree43 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        com.baeldung.avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        com.baeldung.avltree.AVLTree.Node node53 = null;
        int int54 = aVLTree43.getBalance(node53);
        com.baeldung.avltree.AVLTree aVLTree55 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        aVLTree55.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree55.getRoot();
        com.baeldung.avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree55.getBalance(node61);
        com.baeldung.avltree.AVLTree.Node node64 = aVLTree55.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree65 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree65.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree65.find((int) 'a');
        aVLTree65.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree72 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node73 = null;
        int int74 = aVLTree72.getBalance(node73);
        aVLTree72.insert((int) (byte) 100);
        aVLTree72.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node80 = aVLTree72.find((int) (byte) 100);
        int int81 = aVLTree65.getBalance(node80);
        int int82 = aVLTree55.getBalance(node80);
        int int83 = aVLTree43.getBalance(node80);
        int int84 = aVLTree10.getBalance(node80);
        int int85 = aVLTree0.getBalance(node80);
        com.baeldung.avltree.AVLTree.Node node86 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node87 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNull(node87);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree6 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node7 = null;
        int int8 = aVLTree6.getBalance(node7);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        com.baeldung.avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        int int22 = aVLTree12.height();
        com.baeldung.avltree.AVLTree aVLTree23 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree23.getRoot();
        aVLTree23.delete(100);
        aVLTree23.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree23.getRoot();
        int int32 = aVLTree12.getBalance(node31);
        int int33 = aVLTree6.getBalance(node31);
        int int34 = aVLTree0.getBalance(node31);
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree8.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree0.find((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree34.getBalance(node37);
        aVLTree34.insert(0);
        aVLTree34.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree34.getRoot();
        aVLTree34.delete(0);
        com.baeldung.avltree.AVLTree aVLTree46 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        aVLTree46.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree46.getRoot();
        aVLTree46.delete(0);
        com.baeldung.avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree46.getBalance(node54);
        com.baeldung.avltree.AVLTree.Node node56 = null;
        int int57 = aVLTree46.getBalance(node56);
        com.baeldung.avltree.AVLTree aVLTree58 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree58.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree58.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree58.getRoot();
        aVLTree58.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node66 = aVLTree58.getRoot();
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree58.getRoot();
        com.baeldung.avltree.AVLTree aVLTree68 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node69 = null;
        int int70 = aVLTree68.getBalance(node69);
        aVLTree68.insert((int) (byte) 100);
        aVLTree68.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node76 = aVLTree68.find((int) (byte) 100);
        int int77 = aVLTree58.getBalance(node76);
        int int78 = aVLTree46.getBalance(node76);
        int int79 = aVLTree34.getBalance(node76);
        aVLTree34.delete(0);
        com.baeldung.avltree.AVLTree.Node node82 = aVLTree34.getRoot();
        int int83 = aVLTree0.getBalance(node82);
        int int84 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node85 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNull(node85);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.delete((int) (byte) -1);
        int int12 = aVLTree7.height();
        int int13 = aVLTree7.height();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) '#');
        com.baeldung.avltree.AVLTree aVLTree16 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree16.find((int) 'a');
        aVLTree16.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree23 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.insert((int) (byte) 100);
        aVLTree23.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree23.find((int) (byte) 100);
        int int32 = aVLTree16.getBalance(node31);
        int int33 = aVLTree7.getBalance(node31);
        int int34 = aVLTree0.getBalance(node31);
        int int35 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree36 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree36.getRoot();
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree36.find((int) (byte) 1);
        com.baeldung.avltree.AVLTree aVLTree42 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree42.getRoot();
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree42.find((int) (byte) 0);
        aVLTree42.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree aVLTree55 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree55.getRoot();
        aVLTree55.insert((int) (byte) 100);
        int int61 = aVLTree55.height();
        aVLTree55.insert(1);
        aVLTree55.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree55.find((int) (short) 1);
        int int68 = aVLTree42.getBalance(node67);
        int int69 = aVLTree36.getBalance(node67);
        com.baeldung.avltree.AVLTree aVLTree70 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node73 = null;
        int int74 = aVLTree70.getBalance(node73);
        aVLTree70.insert(0);
        com.baeldung.avltree.AVLTree.Node node78 = aVLTree70.find((int) (short) 0);
        int int79 = aVLTree36.getBalance(node78);
        aVLTree36.insert((int) '#');
        com.baeldung.avltree.AVLTree.Node node82 = aVLTree36.getRoot();
        int int83 = aVLTree0.getBalance(node82);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert((-1));
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 10);
        int int18 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        int int17 = aVLTree0.height();
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        com.baeldung.avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree33 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        com.baeldung.avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        com.baeldung.avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree33.getBalance(node43);
        com.baeldung.avltree.AVLTree aVLTree45 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        aVLTree45.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree45.getRoot();
        com.baeldung.avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree45.getBalance(node51);
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree45.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree55 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node59 = aVLTree55.find((int) 'a');
        aVLTree55.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree62 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node63 = null;
        int int64 = aVLTree62.getBalance(node63);
        aVLTree62.insert((int) (byte) 100);
        aVLTree62.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree62.find((int) (byte) 100);
        int int71 = aVLTree55.getBalance(node70);
        int int72 = aVLTree45.getBalance(node70);
        int int73 = aVLTree33.getBalance(node70);
        int int74 = aVLTree0.getBalance(node70);
        int int75 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node77 = aVLTree0.find((-1));
        com.baeldung.avltree.AVLTree.Node node78 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node80 = aVLTree0.find((int) (short) 10);
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(node80);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find(10);
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        aVLTree0.insert(1);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        com.baeldung.avltree.AVLTree aVLTree16 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree16.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree16.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree16.find(0);
        com.baeldung.avltree.AVLTree aVLTree25 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        aVLTree25.delete((int) 'a');
        aVLTree25.delete(1);
        aVLTree25.delete((int) '#');
        aVLTree25.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree25.getRoot();
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree25.find((int) (byte) 100);
        int int39 = aVLTree25.height();
        com.baeldung.avltree.AVLTree aVLTree40 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree46 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree46.find((int) 'a');
        aVLTree46.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree53 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree53.getBalance(node54);
        aVLTree53.insert((int) (byte) 100);
        aVLTree53.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node61 = aVLTree53.find((int) (byte) 100);
        int int62 = aVLTree46.getBalance(node61);
        int int63 = aVLTree40.getBalance(node61);
        int int64 = aVLTree25.getBalance(node61);
        int int65 = aVLTree16.getBalance(node61);
        com.baeldung.avltree.AVLTree.Node node66 = aVLTree16.getRoot();
        aVLTree16.insert(1);
        aVLTree16.delete(100);
        int int71 = aVLTree16.height();
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree16.find(1);
        com.baeldung.avltree.AVLTree.Node node74 = aVLTree16.getRoot();
        int int75 = aVLTree0.getBalance(node74);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.find((int) (byte) 0);
        int int16 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        int int14 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree15 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree15.getRoot();
        aVLTree15.delete(100);
        aVLTree15.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree15.getRoot();
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree15.find((int) (byte) 0);
        int int26 = aVLTree15.height();
        int int27 = aVLTree15.height();
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree15.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree30.getBalance(node33);
        aVLTree30.insert((int) 'a');
        int int37 = aVLTree30.height();
        aVLTree30.delete(0);
        int int40 = aVLTree30.height();
        aVLTree30.insert((int) '4');
        int int43 = aVLTree30.height();
        int int44 = aVLTree30.height();
        com.baeldung.avltree.AVLTree aVLTree45 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node48 = null;
        int int49 = aVLTree45.getBalance(node48);
        aVLTree45.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree45.find((int) '#');
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree45.find((int) (byte) 0);
        int int56 = aVLTree45.height();
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree45.find((int) '4');
        int int59 = aVLTree30.getBalance(node58);
        int int60 = aVLTree0.getBalance(node58);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree10.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) -1);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree4 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree4.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree4.find((int) 'a');
        aVLTree4.insert((int) (short) -1);
        int int11 = aVLTree4.height();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree4.getRoot();
        int int13 = aVLTree0.getBalance(node12);
        aVLTree0.insert((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree18 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        aVLTree18.delete((int) 'a');
        aVLTree18.delete(1);
        aVLTree18.delete((int) '#');
        aVLTree18.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree18.getRoot();
        aVLTree18.insert(10);
        aVLTree18.delete(1);
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree18.getRoot();
        int int35 = aVLTree0.getBalance(node34);
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree0.find((int) ' ');
        int int38 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) 0);
        java.lang.Class<?> wildcardClass44 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        aVLTree0.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find((int) '#');
        aVLTree0.insert((int) (byte) -1);
        com.baeldung.avltree.AVLTree aVLTree14 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.insert((int) (byte) 100);
        aVLTree14.delete((int) '4');
        int int21 = aVLTree14.height();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree14.find((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree14.getRoot();
        int int25 = aVLTree0.getBalance(node24);
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) '4');
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree30.find((int) (byte) 0);
        aVLTree30.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree aVLTree43 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.insert((int) (byte) 100);
        int int49 = aVLTree43.height();
        aVLTree43.insert(1);
        aVLTree43.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree43.find((int) (short) 1);
        int int56 = aVLTree30.getBalance(node55);
        com.baeldung.avltree.AVLTree aVLTree57 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree57.getBalance(node58);
        aVLTree57.insert((int) (byte) 100);
        aVLTree57.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node65 = aVLTree57.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node66 = aVLTree57.getRoot();
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree57.find(10);
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree57.getRoot();
        aVLTree57.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree57.find((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node75 = aVLTree57.find((int) (byte) 10);
        int int76 = aVLTree30.getBalance(node75);
        int int77 = aVLTree0.getBalance(node75);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.delete((int) ' ');
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree25 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree25.getBalance(node28);
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree25.getRoot();
        aVLTree25.delete((int) (byte) -1);
        int int33 = aVLTree25.height();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree25.getRoot();
        com.baeldung.avltree.AVLTree aVLTree35 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree35.getBalance(node38);
        aVLTree35.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree35.find((int) (short) 0);
        aVLTree35.insert((int) (byte) 1);
        aVLTree35.delete((int) (short) -1);
        int int48 = aVLTree35.height();
        com.baeldung.avltree.AVLTree aVLTree49 = new com.baeldung.avltree.AVLTree();
        aVLTree49.delete((int) (byte) -1);
        aVLTree49.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree49.find(1);
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree49.find(10);
        com.baeldung.avltree.AVLTree aVLTree59 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node60 = null;
        int int61 = aVLTree59.getBalance(node60);
        aVLTree59.delete((int) (byte) -1);
        int int64 = aVLTree59.height();
        int int65 = aVLTree59.height();
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree59.find((int) '#');
        com.baeldung.avltree.AVLTree aVLTree68 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree68.find((int) 'a');
        aVLTree68.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree75 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node76 = null;
        int int77 = aVLTree75.getBalance(node76);
        aVLTree75.insert((int) (byte) 100);
        aVLTree75.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node83 = aVLTree75.find((int) (byte) 100);
        int int84 = aVLTree68.getBalance(node83);
        int int85 = aVLTree59.getBalance(node83);
        int int86 = aVLTree49.getBalance(node83);
        int int87 = aVLTree35.getBalance(node83);
        int int88 = aVLTree25.getBalance(node83);
        int int89 = aVLTree0.getBalance(node83);
        int int90 = aVLTree0.height();
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node93 = null;
        int int94 = aVLTree0.getBalance(node93);
        com.baeldung.avltree.AVLTree.Node node95 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(node95);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree6 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree6.find(100);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        com.baeldung.avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        aVLTree24.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        int int33 = aVLTree13.getBalance(node32);
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        aVLTree34.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree34.getRoot();
        aVLTree34.delete(0);
        com.baeldung.avltree.AVLTree.Node node42 = null;
        int int43 = aVLTree34.getBalance(node42);
        int int44 = aVLTree34.height();
        com.baeldung.avltree.AVLTree aVLTree45 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.delete(100);
        aVLTree45.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree45.getRoot();
        int int54 = aVLTree34.getBalance(node53);
        int int55 = aVLTree13.getBalance(node53);
        int int56 = aVLTree6.getBalance(node53);
        int int57 = aVLTree0.getBalance(node53);
        int int58 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 0);
        int int61 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree0.find((int) (short) 0);
        int int64 = aVLTree0.height();
        java.lang.Class<?> wildcardClass65 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        com.baeldung.avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        com.baeldung.avltree.AVLTree aVLTree41 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree41.getRoot();
        aVLTree41.delete(100);
        aVLTree41.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree41.getRoot();
        int int50 = aVLTree30.getBalance(node49);
        int int51 = aVLTree0.getBalance(node49);
        int int52 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree0.find((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node59 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        int int16 = aVLTree10.height();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree10.find((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree10.getRoot();
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree20.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree29 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree29.getRoot();
        aVLTree29.delete(0);
        com.baeldung.avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree29.getBalance(node37);
        int int39 = aVLTree29.height();
        com.baeldung.avltree.AVLTree aVLTree40 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        aVLTree40.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree40.getRoot();
        int int49 = aVLTree29.getBalance(node48);
        int int50 = aVLTree20.getBalance(node48);
        int int51 = aVLTree10.getBalance(node48);
        int int52 = aVLTree0.getBalance(node48);
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find((int) '#');
        aVLTree0.insert((int) (byte) -1);
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        com.baeldung.avltree.AVLTree aVLTree3 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        int int21 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree19.getBalance(node22);
        aVLTree19.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree19.find((int) ' ');
        int int28 = aVLTree19.height();
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree19.getRoot();
        int int30 = aVLTree13.getBalance(node29);
        int int31 = aVLTree10.getBalance(node29);
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree10.find((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        aVLTree34.delete((int) 'a');
        aVLTree34.delete(1);
        aVLTree34.delete((int) '#');
        aVLTree34.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree34.getRoot();
        aVLTree34.insert(10);
        aVLTree34.delete(1);
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree34.getRoot();
        int int51 = aVLTree34.height();
        aVLTree34.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree34.getRoot();
        int int55 = aVLTree10.getBalance(node54);
        aVLTree10.insert((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree10.getRoot();
        com.baeldung.avltree.AVLTree aVLTree59 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree59.getRoot();
        aVLTree59.delete(100);
        int int65 = aVLTree59.height();
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree59.find((int) (short) -1);
        aVLTree59.insert(0);
        aVLTree59.insert((int) (byte) 1);
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree59.getRoot();
        int int73 = aVLTree10.getBalance(node72);
        int int74 = aVLTree0.getBalance(node72);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((-1));
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        com.baeldung.avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.insert(1);
        com.baeldung.avltree.AVLTree aVLTree51 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree51.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree51.find((int) 'a');
        aVLTree51.insert((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree51.getRoot();
        int int59 = aVLTree0.getBalance(node58);
        int int60 = aVLTree0.height();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        int int3 = aVLTree0.height();
        aVLTree0.insert(1);
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree14 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.insert((int) (byte) 100);
        aVLTree14.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree14.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree23 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        aVLTree23.delete(0);
        com.baeldung.avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree23.getBalance(node31);
        int int33 = aVLTree23.height();
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree34.getRoot();
        aVLTree34.delete(100);
        aVLTree34.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree34.getRoot();
        int int43 = aVLTree23.getBalance(node42);
        int int44 = aVLTree14.getBalance(node42);
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree14.getRoot();
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree14.getRoot();
        com.baeldung.avltree.AVLTree aVLTree47 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        aVLTree47.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree47.getRoot();
        aVLTree47.delete(0);
        com.baeldung.avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree47.getBalance(node55);
        com.baeldung.avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree47.getBalance(node57);
        com.baeldung.avltree.AVLTree aVLTree59 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        com.baeldung.avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree59.getBalance(node65);
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree59.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree69 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree69.find((int) 'a');
        aVLTree69.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree76 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        int int85 = aVLTree69.getBalance(node84);
        int int86 = aVLTree59.getBalance(node84);
        int int87 = aVLTree47.getBalance(node84);
        int int88 = aVLTree14.getBalance(node84);
        int int89 = aVLTree7.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        aVLTree0.insert((int) '#');
        com.baeldung.avltree.AVLTree.Node node94 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node95 = aVLTree0.getRoot();
        int int96 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNull(node94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find((int) ' ');
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree21.find(100);
        com.baeldung.avltree.AVLTree aVLTree28 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        com.baeldung.avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        com.baeldung.avltree.AVLTree aVLTree39 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        com.baeldung.avltree.AVLTree aVLTree49 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        aVLTree49.delete(0);
        com.baeldung.avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree49.getBalance(node57);
        int int59 = aVLTree49.height();
        com.baeldung.avltree.AVLTree aVLTree60 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.delete(100);
        aVLTree60.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree60.getRoot();
        int int69 = aVLTree49.getBalance(node68);
        int int70 = aVLTree28.getBalance(node68);
        int int71 = aVLTree21.getBalance(node68);
        int int72 = aVLTree13.getBalance(node68);
        int int73 = aVLTree0.getBalance(node68);
        java.lang.Class<?> wildcardClass74 = node68.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) ' ');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert(0);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree0.getBalance(node22);
        aVLTree0.insert((int) ' ');
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        com.baeldung.avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        int int12 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree13.getBalance(node16);
        aVLTree13.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.find((int) '#');
        aVLTree13.insert(0);
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        com.baeldung.avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree24.getBalance(node30);
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree24.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree34 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree34.find((int) 'a');
        aVLTree34.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree41 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        aVLTree41.insert((int) (byte) 100);
        aVLTree41.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree41.find((int) (byte) 100);
        int int50 = aVLTree34.getBalance(node49);
        int int51 = aVLTree24.getBalance(node49);
        int int52 = aVLTree13.getBalance(node49);
        int int53 = aVLTree0.getBalance(node49);
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node54);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        com.baeldung.avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree aVLTree14 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        aVLTree14.insert((int) (byte) 100);
        int int25 = aVLTree14.height();
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree14.find((int) (byte) -1);
        aVLTree14.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree30.getBalance(node33);
        aVLTree30.insert(0);
        aVLTree30.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree30.getRoot();
        com.baeldung.avltree.AVLTree aVLTree40 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.insert((int) (byte) 100);
        aVLTree40.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree40.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree49 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        aVLTree49.delete(0);
        com.baeldung.avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree49.getBalance(node57);
        int int59 = aVLTree49.height();
        com.baeldung.avltree.AVLTree aVLTree60 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.delete(100);
        aVLTree60.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree60.getRoot();
        int int69 = aVLTree49.getBalance(node68);
        int int70 = aVLTree40.getBalance(node68);
        int int71 = aVLTree30.getBalance(node68);
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree30.find((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node75 = aVLTree30.find((int) (byte) -1);
        aVLTree30.insert((int) (short) -1);
        aVLTree30.delete((int) ' ');
        int int80 = aVLTree30.height();
        com.baeldung.avltree.AVLTree.Node node82 = aVLTree30.find(10);
        int int83 = aVLTree14.getBalance(node82);
        int int84 = aVLTree0.getBalance(node82);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '4');
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find(0);
        int int12 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        int int19 = aVLTree13.height();
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree20.getRoot();
        aVLTree20.delete(0);
        com.baeldung.avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree20.getBalance(node28);
        int int30 = aVLTree20.height();
        com.baeldung.avltree.AVLTree aVLTree31 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree31.getRoot();
        aVLTree31.delete(100);
        aVLTree31.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree31.getRoot();
        int int40 = aVLTree20.getBalance(node39);
        com.baeldung.avltree.AVLTree aVLTree41 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree41.getRoot();
        aVLTree41.delete(0);
        com.baeldung.avltree.AVLTree.Node node49 = null;
        int int50 = aVLTree41.getBalance(node49);
        int int51 = aVLTree41.height();
        com.baeldung.avltree.AVLTree aVLTree52 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree52.getRoot();
        aVLTree52.delete(100);
        aVLTree52.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree52.getRoot();
        int int61 = aVLTree41.getBalance(node60);
        int int62 = aVLTree20.getBalance(node60);
        int int63 = aVLTree13.getBalance(node60);
        aVLTree13.delete((-1));
        aVLTree13.insert((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree13.getRoot();
        int int69 = aVLTree0.getBalance(node68);
        com.baeldung.avltree.AVLTree.Node node71 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree0.find((int) (short) 100);
        aVLTree0.insert((int) 'a');
        java.lang.Class<?> wildcardClass21 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        aVLTree7.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree13.getBalance(node16);
        aVLTree13.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.find((int) ' ');
        int int22 = aVLTree13.height();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree13.getRoot();
        int int24 = aVLTree7.getBalance(node23);
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree7.find((int) '4');
        com.baeldung.avltree.AVLTree aVLTree27 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree27.find((-1));
        int int30 = aVLTree27.height();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree27.find((int) (byte) 100);
        aVLTree27.insert(0);
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree27.getRoot();
        int int36 = aVLTree7.getBalance(node35);
        aVLTree7.insert((int) (byte) 1);
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree7.getRoot();
        int int40 = aVLTree0.getBalance(node39);
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree20.getRoot();
        int int28 = aVLTree0.getBalance(node27);
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree10.find(100);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree0.find((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree30.getBalance(node33);
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree30.getRoot();
        com.baeldung.avltree.AVLTree aVLTree37 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree37.find((int) 'a');
        int int42 = aVLTree37.height();
        com.baeldung.avltree.AVLTree aVLTree43 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree43.getBalance(node44);
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree49 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        aVLTree49.delete(0);
        com.baeldung.avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree49.getBalance(node57);
        int int59 = aVLTree49.height();
        com.baeldung.avltree.AVLTree aVLTree60 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.delete(100);
        aVLTree60.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree60.getRoot();
        int int69 = aVLTree49.getBalance(node68);
        int int70 = aVLTree43.getBalance(node68);
        int int71 = aVLTree37.getBalance(node68);
        int int72 = aVLTree30.getBalance(node68);
        int int73 = aVLTree0.getBalance(node68);
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        com.baeldung.avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        int int17 = aVLTree12.height();
        com.baeldung.avltree.AVLTree aVLTree18 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        com.baeldung.avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        int int34 = aVLTree24.height();
        com.baeldung.avltree.AVLTree aVLTree35 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.delete(100);
        aVLTree35.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree35.getRoot();
        int int44 = aVLTree24.getBalance(node43);
        int int45 = aVLTree18.getBalance(node43);
        int int46 = aVLTree12.getBalance(node43);
        int int47 = aVLTree0.getBalance(node43);
        aVLTree0.insert((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree0.find((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int55 = aVLTree0.height();
        aVLTree0.insert(10);
        int int58 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree0.find((int) ' ');
        aVLTree0.insert(1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find(0);
        int int11 = aVLTree0.height();
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree25 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree25.getBalance(node28);
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree25.getRoot();
        aVLTree25.delete((int) (byte) -1);
        int int33 = aVLTree25.height();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree25.getRoot();
        com.baeldung.avltree.AVLTree aVLTree35 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree35.getBalance(node38);
        aVLTree35.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree35.find((int) (short) 0);
        aVLTree35.insert((int) (byte) 1);
        aVLTree35.delete((int) (short) -1);
        int int48 = aVLTree35.height();
        com.baeldung.avltree.AVLTree aVLTree49 = new com.baeldung.avltree.AVLTree();
        aVLTree49.delete((int) (byte) -1);
        aVLTree49.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree49.find(1);
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree49.find(10);
        com.baeldung.avltree.AVLTree aVLTree59 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node60 = null;
        int int61 = aVLTree59.getBalance(node60);
        aVLTree59.delete((int) (byte) -1);
        int int64 = aVLTree59.height();
        int int65 = aVLTree59.height();
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree59.find((int) '#');
        com.baeldung.avltree.AVLTree aVLTree68 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree68.find((int) 'a');
        aVLTree68.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree75 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node76 = null;
        int int77 = aVLTree75.getBalance(node76);
        aVLTree75.insert((int) (byte) 100);
        aVLTree75.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node83 = aVLTree75.find((int) (byte) 100);
        int int84 = aVLTree68.getBalance(node83);
        int int85 = aVLTree59.getBalance(node83);
        int int86 = aVLTree49.getBalance(node83);
        int int87 = aVLTree35.getBalance(node83);
        int int88 = aVLTree25.getBalance(node83);
        int int89 = aVLTree0.getBalance(node83);
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete(0);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        com.baeldung.avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        com.baeldung.avltree.AVLTree aVLTree45 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node48 = null;
        int int49 = aVLTree45.getBalance(node48);
        aVLTree45.insert(0);
        aVLTree45.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree45.getRoot();
        com.baeldung.avltree.AVLTree aVLTree55 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.insert((int) (byte) 100);
        aVLTree55.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree55.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree64 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node66 = aVLTree64.find((int) '4');
        aVLTree64.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree64.getRoot();
        aVLTree64.delete(0);
        com.baeldung.avltree.AVLTree.Node node72 = null;
        int int73 = aVLTree64.getBalance(node72);
        int int74 = aVLTree64.height();
        com.baeldung.avltree.AVLTree aVLTree75 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node77 = aVLTree75.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node78 = aVLTree75.getRoot();
        aVLTree75.delete(100);
        aVLTree75.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node83 = aVLTree75.getRoot();
        int int84 = aVLTree64.getBalance(node83);
        int int85 = aVLTree55.getBalance(node83);
        int int86 = aVLTree45.getBalance(node83);
        int int87 = aVLTree0.getBalance(node83);
        int int88 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree13.find(100);
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree20.getRoot();
        aVLTree20.delete(0);
        com.baeldung.avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree20.getBalance(node28);
        int int30 = aVLTree20.height();
        com.baeldung.avltree.AVLTree aVLTree31 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree31.getRoot();
        aVLTree31.delete(100);
        aVLTree31.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree31.getRoot();
        int int40 = aVLTree20.getBalance(node39);
        com.baeldung.avltree.AVLTree aVLTree41 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree41.getRoot();
        aVLTree41.delete(0);
        com.baeldung.avltree.AVLTree.Node node49 = null;
        int int50 = aVLTree41.getBalance(node49);
        int int51 = aVLTree41.height();
        com.baeldung.avltree.AVLTree aVLTree52 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree52.getRoot();
        aVLTree52.delete(100);
        aVLTree52.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree52.getRoot();
        int int61 = aVLTree41.getBalance(node60);
        int int62 = aVLTree20.getBalance(node60);
        int int63 = aVLTree13.getBalance(node60);
        int int64 = aVLTree7.getBalance(node60);
        int int65 = aVLTree7.height();
        aVLTree7.insert((int) (byte) 0);
        int int68 = aVLTree7.height();
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree7.find((int) (short) 0);
        int int71 = aVLTree0.getBalance(node70);
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree0.find(100);
        aVLTree0.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node76 = aVLTree0.getRoot();
        int int77 = aVLTree0.height();
        aVLTree0.delete((int) '4');
        com.baeldung.avltree.AVLTree.Node node80 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node80);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree aVLTree5 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree5.find((int) (short) -1);
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree11.getBalance(node12);
        aVLTree11.insert((int) (byte) 100);
        aVLTree11.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree11.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree20.getRoot();
        aVLTree20.delete(0);
        com.baeldung.avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree20.getBalance(node28);
        int int30 = aVLTree20.height();
        com.baeldung.avltree.AVLTree aVLTree31 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree31.getRoot();
        aVLTree31.delete(100);
        aVLTree31.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node39 = aVLTree31.getRoot();
        int int40 = aVLTree20.getBalance(node39);
        int int41 = aVLTree11.getBalance(node39);
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree11.getRoot();
        int int43 = aVLTree5.getBalance(node42);
        int int44 = aVLTree0.getBalance(node42);
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find((int) '#');
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete(2);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        int int17 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        int int25 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree26 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree26.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree26.getRoot();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree26.getRoot();
        int int33 = aVLTree26.height();
        aVLTree26.insert((int) 'a');
        aVLTree26.insert((int) (short) 100);
        int int38 = aVLTree26.height();
        aVLTree26.delete((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree26.getRoot();
        int int42 = aVLTree0.getBalance(node41);
        int int43 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find(10);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.find((int) (short) -1);
        int int17 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree0.find(10);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree0.find(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        int int3 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = node5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree0.find((int) (short) 10);
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 10);
        aVLTree0.delete((int) (byte) -1);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree13.getRoot();
        com.baeldung.avltree.AVLTree aVLTree23 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.insert((int) (byte) 100);
        aVLTree23.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree23.getRoot();
        int int31 = aVLTree13.getBalance(node30);
        aVLTree13.delete(1);
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree13.getRoot();
        int int35 = aVLTree0.getBalance(node34);
        int int36 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (short) 10);
        int int12 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.delete((int) (short) 0);
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) '#');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.find(0);
        aVLTree0.insert(100);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find(100);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree10.getRoot();
        aVLTree10.delete(0);
        com.baeldung.avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree10.getBalance(node18);
        int int20 = aVLTree10.height();
        com.baeldung.avltree.AVLTree aVLTree21 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        aVLTree21.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree10.getBalance(node29);
        com.baeldung.avltree.AVLTree aVLTree31 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        aVLTree31.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree31.getRoot();
        aVLTree31.delete(0);
        com.baeldung.avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree31.getBalance(node39);
        int int41 = aVLTree31.height();
        com.baeldung.avltree.AVLTree aVLTree42 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree42.getRoot();
        int int51 = aVLTree31.getBalance(node50);
        int int52 = aVLTree10.getBalance(node50);
        int int53 = aVLTree0.getBalance(node50);
        int int54 = aVLTree0.height();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete(10);
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) '#');
        aVLTree0.insert(10);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree16 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree16.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree16.getRoot();
        aVLTree16.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree16.getRoot();
        int int25 = aVLTree16.height();
        com.baeldung.avltree.AVLTree aVLTree26 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        aVLTree26.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree26.find(100);
        com.baeldung.avltree.AVLTree aVLTree33 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree33.getRoot();
        aVLTree33.delete(100);
        aVLTree33.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree33.getRoot();
        int int42 = aVLTree26.getBalance(node41);
        int int43 = aVLTree16.getBalance(node41);
        aVLTree16.delete(100);
        com.baeldung.avltree.AVLTree aVLTree46 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree46.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree46.find((int) ' ');
        aVLTree46.delete((int) '4');
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree46.find((-1));
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree46.find((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree46.find((int) (short) 0);
        aVLTree46.insert((int) ' ');
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree46.getRoot();
        int int64 = aVLTree16.getBalance(node63);
        int int65 = aVLTree0.getBalance(node63);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        int int13 = aVLTree0.height();
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 10);
        aVLTree0.insert((int) (short) 10);
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) ' ');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.find((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        int int16 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        int int20 = aVLTree0.height();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete((int) '4');
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree0.find((int) '#');
        aVLTree0.delete(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree11.getRoot();
        com.baeldung.avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree11.find((int) ' ');
        aVLTree11.insert((-1));
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree11.getRoot();
        aVLTree11.delete((int) (byte) -1);
        aVLTree11.insert(0);
        aVLTree11.delete((int) (byte) -1);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree35 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree41 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree41.getBalance(node44);
        aVLTree41.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node49 = aVLTree41.find((int) ' ');
        int int50 = aVLTree41.height();
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree41.getRoot();
        int int52 = aVLTree35.getBalance(node51);
        int int53 = aVLTree30.getBalance(node51);
        int int54 = aVLTree11.getBalance(node51);
        int int55 = aVLTree0.getBalance(node51);
        aVLTree0.delete((int) (short) 100);
        com.baeldung.avltree.AVLTree aVLTree58 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree58.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node61 = aVLTree58.getRoot();
        aVLTree58.insert((int) (byte) 100);
        int int64 = aVLTree58.height();
        aVLTree58.insert(1);
        aVLTree58.insert(0);
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree58.getRoot();
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree58.getRoot();
        int int71 = aVLTree0.getBalance(node70);
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node73);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        int int8 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        int int11 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree12.getRoot();
        int int21 = aVLTree12.height();
        com.baeldung.avltree.AVLTree aVLTree22 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        aVLTree22.insert((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree22.find(100);
        com.baeldung.avltree.AVLTree aVLTree29 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.delete(100);
        aVLTree29.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree29.getRoot();
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree12.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree0.find(1);
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        com.baeldung.avltree.AVLTree aVLTree23 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.insert((int) (byte) 100);
        aVLTree23.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree23.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree32.getRoot();
        aVLTree32.delete(0);
        com.baeldung.avltree.AVLTree.Node node40 = null;
        int int41 = aVLTree32.getBalance(node40);
        int int42 = aVLTree32.height();
        com.baeldung.avltree.AVLTree aVLTree43 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree32.getBalance(node51);
        int int53 = aVLTree23.getBalance(node51);
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree23.getRoot();
        int int55 = aVLTree0.getBalance(node54);
        aVLTree0.delete((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree0.getRoot();
        aVLTree0.insert((int) ' ');
        com.baeldung.avltree.AVLTree.Node node61 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node61);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        com.baeldung.avltree.AVLTree aVLTree28 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree28.find((int) 'a');
        int int33 = aVLTree28.height();
        aVLTree28.delete(1);
        aVLTree28.insert((int) 'a');
        aVLTree28.insert((int) '#');
        com.baeldung.avltree.AVLTree aVLTree40 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        int int43 = aVLTree40.height();
        int int44 = aVLTree40.height();
        com.baeldung.avltree.AVLTree aVLTree45 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree45.getBalance(node46);
        aVLTree45.insert((int) (byte) 100);
        aVLTree45.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree45.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree54 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        aVLTree54.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node59 = aVLTree54.getRoot();
        aVLTree54.delete(0);
        com.baeldung.avltree.AVLTree.Node node62 = null;
        int int63 = aVLTree54.getBalance(node62);
        int int64 = aVLTree54.height();
        com.baeldung.avltree.AVLTree aVLTree65 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree65.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node68 = aVLTree65.getRoot();
        aVLTree65.delete(100);
        aVLTree65.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree65.getRoot();
        int int74 = aVLTree54.getBalance(node73);
        int int75 = aVLTree45.getBalance(node73);
        int int76 = aVLTree40.getBalance(node73);
        int int77 = aVLTree28.getBalance(node73);
        int int78 = aVLTree0.getBalance(node73);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree.Node node81 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node83 = aVLTree0.find((int) (short) 0);
        int int84 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        com.baeldung.avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree32.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree32.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree32.find(0);
        com.baeldung.avltree.AVLTree aVLTree41 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        aVLTree41.delete(1);
        aVLTree41.delete((int) '#');
        aVLTree41.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree41.getRoot();
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree41.find((int) (byte) 100);
        int int55 = aVLTree41.height();
        com.baeldung.avltree.AVLTree aVLTree56 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree62 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree69 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree56.getBalance(node77);
        int int80 = aVLTree41.getBalance(node77);
        int int81 = aVLTree32.getBalance(node77);
        int int82 = aVLTree0.getBalance(node77);
        com.baeldung.avltree.AVLTree.Node node83 = aVLTree0.getRoot();
        int int84 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node86 = aVLTree0.find((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node87 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        int int8 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree13.getBalance(node16);
        aVLTree13.insert(0);
        aVLTree13.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree13.getRoot();
        com.baeldung.avltree.AVLTree aVLTree23 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.insert((int) (byte) 100);
        aVLTree23.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree23.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree32.getRoot();
        aVLTree32.delete(0);
        com.baeldung.avltree.AVLTree.Node node40 = null;
        int int41 = aVLTree32.getBalance(node40);
        int int42 = aVLTree32.height();
        com.baeldung.avltree.AVLTree aVLTree43 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree32.getBalance(node51);
        int int53 = aVLTree23.getBalance(node51);
        int int54 = aVLTree13.getBalance(node51);
        int int55 = aVLTree13.height();
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree13.getRoot();
        int int57 = aVLTree0.getBalance(node56);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        com.baeldung.avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree12.getBalance(node18);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree12.find((int) ' ');
        int int22 = aVLTree12.height();
        aVLTree12.delete(0);
        com.baeldung.avltree.AVLTree aVLTree25 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.insert((int) (byte) 100);
        aVLTree25.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node33 = aVLTree25.find((int) (byte) 100);
        int int34 = aVLTree12.getBalance(node33);
        int int35 = aVLTree0.getBalance(node33);
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree0.find((int) (byte) -1);
        int int38 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree0.find(100);
        int int41 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree42 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.insert(1);
        com.baeldung.avltree.AVLTree aVLTree48 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree48.getRoot();
        aVLTree48.insert((int) (byte) 100);
        int int54 = aVLTree48.height();
        aVLTree48.insert(1);
        aVLTree48.insert(0);
        com.baeldung.avltree.AVLTree.Node node59 = aVLTree48.getRoot();
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree48.getRoot();
        int int61 = aVLTree42.getBalance(node60);
        int int62 = aVLTree0.getBalance(node60);
        java.lang.Class<?> wildcardClass63 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete((-1));
        int int16 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree12 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree12.find(100);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree12.getRoot();
        com.baeldung.avltree.AVLTree aVLTree22 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        aVLTree22.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree22.getRoot();
        aVLTree22.delete(0);
        com.baeldung.avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree22.getBalance(node30);
        int int32 = aVLTree22.height();
        com.baeldung.avltree.AVLTree aVLTree33 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree33.getRoot();
        aVLTree33.delete(100);
        aVLTree33.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree33.getRoot();
        int int42 = aVLTree22.getBalance(node41);
        com.baeldung.avltree.AVLTree aVLTree43 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        com.baeldung.avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        com.baeldung.avltree.AVLTree aVLTree54 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree22.getBalance(node62);
        int int65 = aVLTree12.getBalance(node62);
        com.baeldung.avltree.AVLTree.Node node66 = aVLTree12.getRoot();
        int int67 = aVLTree0.getBalance(node66);
        com.baeldung.avltree.AVLTree aVLTree68 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree68.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node74 = aVLTree68.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node76 = aVLTree68.find((int) '#');
        com.baeldung.avltree.AVLTree aVLTree77 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node79 = aVLTree77.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node80 = null;
        int int81 = aVLTree77.getBalance(node80);
        aVLTree77.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node85 = aVLTree77.find((int) ' ');
        int int86 = aVLTree77.height();
        com.baeldung.avltree.AVLTree.Node node87 = aVLTree77.getRoot();
        int int88 = aVLTree68.getBalance(node87);
        int int89 = aVLTree0.getBalance(node87);
        java.lang.Class<?> wildcardClass90 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        int int16 = aVLTree10.height();
        com.baeldung.avltree.AVLTree aVLTree17 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        com.baeldung.avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        com.baeldung.avltree.AVLTree aVLTree28 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree28.getRoot();
        aVLTree28.delete(100);
        aVLTree28.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree28.getRoot();
        int int37 = aVLTree17.getBalance(node36);
        com.baeldung.avltree.AVLTree aVLTree38 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        aVLTree38.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree38.getRoot();
        aVLTree38.delete(0);
        com.baeldung.avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree38.getBalance(node46);
        int int48 = aVLTree38.height();
        com.baeldung.avltree.AVLTree aVLTree49 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.delete(100);
        aVLTree49.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node57 = aVLTree49.getRoot();
        int int58 = aVLTree38.getBalance(node57);
        int int59 = aVLTree17.getBalance(node57);
        int int60 = aVLTree10.getBalance(node57);
        com.baeldung.avltree.AVLTree aVLTree61 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node63 = aVLTree61.find((int) '4');
        aVLTree61.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node66 = aVLTree61.getRoot();
        aVLTree61.delete((int) (byte) 1);
        com.baeldung.avltree.AVLTree aVLTree69 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        com.baeldung.avltree.AVLTree aVLTree72 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node74 = aVLTree72.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node75 = aVLTree72.getRoot();
        aVLTree72.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree78 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node80 = aVLTree78.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node81 = null;
        int int82 = aVLTree78.getBalance(node81);
        aVLTree78.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node86 = aVLTree78.find((int) ' ');
        int int87 = aVLTree78.height();
        com.baeldung.avltree.AVLTree.Node node88 = aVLTree78.getRoot();
        int int89 = aVLTree72.getBalance(node88);
        int int90 = aVLTree69.getBalance(node88);
        int int91 = aVLTree61.getBalance(node88);
        int int92 = aVLTree10.getBalance(node88);
        int int93 = aVLTree0.getBalance(node88);
        int int94 = aVLTree0.height();
        aVLTree0.delete(1);
        com.baeldung.avltree.AVLTree.Node node97 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNull(node97);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        com.baeldung.avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        int int32 = aVLTree0.height();
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree13 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        int int23 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) (byte) 0);
        int int28 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree10.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree19.getRoot();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree19.getRoot();
        aVLTree19.delete((int) (byte) 10);
        int int29 = aVLTree19.height();
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree19.find((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        com.baeldung.avltree.AVLTree aVLTree42 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.insert((int) (byte) 100);
        aVLTree42.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree42.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree51 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree51.find((int) '4');
        aVLTree51.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node56 = aVLTree51.getRoot();
        aVLTree51.delete(0);
        com.baeldung.avltree.AVLTree.Node node59 = null;
        int int60 = aVLTree51.getBalance(node59);
        int int61 = aVLTree51.height();
        com.baeldung.avltree.AVLTree aVLTree62 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node65 = aVLTree62.getRoot();
        aVLTree62.delete(100);
        aVLTree62.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node70 = aVLTree62.getRoot();
        int int71 = aVLTree51.getBalance(node70);
        int int72 = aVLTree42.getBalance(node70);
        com.baeldung.avltree.AVLTree.Node node73 = aVLTree42.getRoot();
        int int74 = aVLTree19.getBalance(node73);
        int int75 = aVLTree0.getBalance(node73);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) (byte) -1);
        int int18 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree19 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        int int22 = aVLTree19.height();
        aVLTree19.insert((-1));
        aVLTree19.delete((int) (byte) 1);
        com.baeldung.avltree.AVLTree aVLTree27 = new com.baeldung.avltree.AVLTree();
        aVLTree27.delete((int) (byte) -1);
        aVLTree27.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree27.getRoot();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree27.find(1);
        com.baeldung.avltree.AVLTree.Node node36 = aVLTree27.find(10);
        com.baeldung.avltree.AVLTree aVLTree37 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.delete((int) (byte) -1);
        int int42 = aVLTree37.height();
        int int43 = aVLTree37.height();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree37.find((int) '#');
        com.baeldung.avltree.AVLTree aVLTree46 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree46.find((int) 'a');
        aVLTree46.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree53 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree53.getBalance(node54);
        aVLTree53.insert((int) (byte) 100);
        aVLTree53.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node61 = aVLTree53.find((int) (byte) 100);
        int int62 = aVLTree46.getBalance(node61);
        int int63 = aVLTree37.getBalance(node61);
        int int64 = aVLTree27.getBalance(node61);
        int int65 = aVLTree19.getBalance(node61);
        int int66 = aVLTree19.height();
        com.baeldung.avltree.AVLTree.Node node67 = aVLTree19.getRoot();
        int int68 = aVLTree0.getBalance(node67);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        aVLTree0.insert(0);
        int int23 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree0.find(1);
        aVLTree0.insert(100);
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 100);
        int int18 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree0.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass22 = node21.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree0.find((int) (short) 1);
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree aVLTree11 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) 'a');
        aVLTree11.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree aVLTree20 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree20.find((int) 'a');
        aVLTree20.insert((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree20.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        com.baeldung.avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree0.getBalance(node30);
        aVLTree0.delete((int) (short) 0);
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree10.getRoot();
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree10.find((int) (short) -1);
        aVLTree10.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node19 = aVLTree10.find(10);
        aVLTree10.delete((int) (short) 1);
        com.baeldung.avltree.AVLTree aVLTree22 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.insert((int) (byte) 100);
        aVLTree22.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree22.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree.Node node31 = aVLTree22.getRoot();
        int int32 = aVLTree10.getBalance(node31);
        int int33 = aVLTree0.getBalance(node31);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree aVLTree9 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        com.baeldung.avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree30 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree37 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree0.getRoot();
        aVLTree0.delete((int) ' ');
        com.baeldung.avltree.AVLTree.Node node55 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node55);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        aVLTree0.delete((int) (byte) 1);
        com.baeldung.avltree.AVLTree aVLTree8 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.insert((int) (byte) 100);
        aVLTree8.insert((int) 'a');
        com.baeldung.avltree.AVLTree aVLTree15 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.insert((int) (byte) 100);
        aVLTree15.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree15.find((int) (byte) 100);
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        com.baeldung.avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        int int34 = aVLTree24.height();
        com.baeldung.avltree.AVLTree aVLTree35 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.delete(100);
        aVLTree35.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node43 = aVLTree35.getRoot();
        int int44 = aVLTree24.getBalance(node43);
        int int45 = aVLTree15.getBalance(node43);
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree15.getRoot();
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree15.getRoot();
        com.baeldung.avltree.AVLTree aVLTree48 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree48.getRoot();
        aVLTree48.delete(0);
        com.baeldung.avltree.AVLTree.Node node56 = null;
        int int57 = aVLTree48.getBalance(node56);
        com.baeldung.avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree48.getBalance(node58);
        com.baeldung.avltree.AVLTree aVLTree60 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        aVLTree60.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node65 = aVLTree60.getRoot();
        com.baeldung.avltree.AVLTree.Node node66 = null;
        int int67 = aVLTree60.getBalance(node66);
        com.baeldung.avltree.AVLTree.Node node69 = aVLTree60.find((int) ' ');
        com.baeldung.avltree.AVLTree aVLTree70 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node74 = aVLTree70.find((int) 'a');
        aVLTree70.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree77 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node78 = null;
        int int79 = aVLTree77.getBalance(node78);
        aVLTree77.insert((int) (byte) 100);
        aVLTree77.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node85 = aVLTree77.find((int) (byte) 100);
        int int86 = aVLTree70.getBalance(node85);
        int int87 = aVLTree60.getBalance(node85);
        int int88 = aVLTree48.getBalance(node85);
        int int89 = aVLTree15.getBalance(node85);
        int int90 = aVLTree8.getBalance(node85);
        com.baeldung.avltree.AVLTree.Node node91 = aVLTree8.getRoot();
        int int92 = aVLTree0.getBalance(node91);
        aVLTree0.insert((int) (short) 100);
        java.lang.Class<?> wildcardClass95 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        com.baeldung.avltree.AVLTree aVLTree10 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node13 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        aVLTree10.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node18 = aVLTree10.getRoot();
        aVLTree10.insert((int) (byte) 100);
        int int21 = aVLTree10.height();
        aVLTree10.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree aVLTree24 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        com.baeldung.avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        com.baeldung.avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree24.getBalance(node34);
        com.baeldung.avltree.AVLTree aVLTree36 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node40 = aVLTree36.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree36.getRoot();
        com.baeldung.avltree.AVLTree.Node node45 = aVLTree36.getRoot();
        com.baeldung.avltree.AVLTree aVLTree46 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.insert((int) (byte) 100);
        aVLTree46.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node54 = aVLTree46.find((int) (byte) 100);
        int int55 = aVLTree36.getBalance(node54);
        int int56 = aVLTree24.getBalance(node54);
        int int57 = aVLTree10.getBalance(node54);
        aVLTree10.insert((int) (byte) -1);
        aVLTree10.insert(2);
        com.baeldung.avltree.AVLTree.Node node62 = aVLTree10.getRoot();
        int int63 = aVLTree0.getBalance(node62);
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(100);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        int int4 = aVLTree0.height();
        int int5 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        com.baeldung.avltree.AVLTree.Node node11 = aVLTree0.find((-1));
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree14 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node16 = aVLTree14.find((-1));
        aVLTree14.delete(100);
        com.baeldung.avltree.AVLTree.Node node20 = aVLTree14.find((int) '#');
        int int21 = aVLTree14.height();
        com.baeldung.avltree.AVLTree aVLTree22 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node25 = aVLTree22.getRoot();
        aVLTree22.delete(100);
        aVLTree22.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node30 = aVLTree22.getRoot();
        int int31 = aVLTree14.getBalance(node30);
        com.baeldung.avltree.AVLTree aVLTree32 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node37 = aVLTree32.getRoot();
        aVLTree32.delete(0);
        com.baeldung.avltree.AVLTree.Node node40 = null;
        int int41 = aVLTree32.getBalance(node40);
        int int42 = aVLTree32.height();
        aVLTree32.delete(100);
        com.baeldung.avltree.AVLTree aVLTree45 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.delete(100);
        aVLTree45.insert((int) (byte) 10);
        com.baeldung.avltree.AVLTree.Node node53 = aVLTree45.getRoot();
        int int54 = aVLTree32.getBalance(node53);
        int int55 = aVLTree14.getBalance(node53);
        int int56 = aVLTree0.getBalance(node53);
        aVLTree0.delete(0);
        com.baeldung.avltree.AVLTree.Node node60 = aVLTree0.find((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(node60);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) '#');
        int int12 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        com.baeldung.avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        com.baeldung.avltree.AVLTree.Node node7 = aVLTree0.find(1);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find(10);
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        int int12 = aVLTree0.height();
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.find(10);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 10);
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        com.baeldung.avltree.AVLTree aVLTree7 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        com.baeldung.avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) (short) -1);
        com.baeldung.avltree.AVLTree.Node node21 = aVLTree0.find(0);
        com.baeldung.avltree.AVLTree.Node node23 = aVLTree0.find((int) ' ');
        int int24 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node26 = aVLTree0.find((int) '#');
        com.baeldung.avltree.AVLTree aVLTree27 = new com.baeldung.avltree.AVLTree();
        aVLTree27.delete((int) (byte) -1);
        aVLTree27.delete((int) (byte) 0);
        aVLTree27.insert((int) (byte) -1);
        aVLTree27.delete(10);
        com.baeldung.avltree.AVLTree aVLTree36 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree36.getBalance(node39);
        aVLTree36.insert((int) '4');
        com.baeldung.avltree.AVLTree.Node node44 = aVLTree36.find((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node46 = aVLTree36.find((int) ' ');
        aVLTree36.insert((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node50 = aVLTree36.find((int) (short) 100);
        com.baeldung.avltree.AVLTree.Node node51 = aVLTree36.getRoot();
        com.baeldung.avltree.AVLTree.Node node52 = aVLTree36.getRoot();
        int int53 = aVLTree27.getBalance(node52);
        int int54 = aVLTree0.getBalance(node52);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) (short) 0);
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 10);
        com.baeldung.avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        int int10 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        com.baeldung.avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (byte) 1);
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.baeldung.avltree.AVLTree aVLTree0 = new com.baeldung.avltree.AVLTree();
        com.baeldung.avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        com.baeldung.avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        com.baeldung.avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        com.baeldung.avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        com.baeldung.avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        com.baeldung.avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        int int15 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }
}

