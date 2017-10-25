/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fy_ba
 */
public class VectorHelperTest {
    
    public VectorHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sortVector method, of class VectorHelper.
     */
    @Test
    public void testSortVector() {
        System.out.println("sortVector");
        int[] vector={5,9,1,12,78,30,0,15,8};
        VectorHelper instance = new VectorHelper(vector);
        int[] expResult = {0,1,5,8,9,12,15,30,78};
        int[] result = instance.sortVector();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addVector method, of class VectorHelper.
     */

    @Test (expected = differentLengthException.class)
    public void testAddVector() throws Exception {
        System.out.println("addVector");
        int[] vector = {5,9,1,30,0,15,8};
        int[] vector2={5,9,1,30,0,15,8};
        VectorHelper instance = new VectorHelper(vector);
        int[] expResult = {10,18,2,60,0,30,16};
        int[] result = instance.addVector(vector2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of invertVector method, of class VectorHelper.
     */
    @Test
    public void testInvertVector() {
        System.out.println("invertVector");
        int[] vector={5,9,1,30,0,15,8};
        VectorHelper instance = new VectorHelper(vector);
        int[] expResult ={8,15,0,30,1,9,5};
        int[] result = instance.invertVector();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMinAndMax method, of class VectorHelper.
     */
    @Test
    public void testGetMinAndMax() {
        System.out.println("getMinAndMax");
        int[] vector={5,9,1,30,0,15,8};
        VectorHelper instance = new VectorHelper(vector);
        instance.getMinAndMax();
        assertEquals(instance.getMax(),30);
        assertEquals(instance.getMin(),0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of changeVector method, of class VectorHelper.
     */
    @Test
    public void testChangeVector() {
        System.out.println("changeVector");
        int[] vector={5,9};
        VectorHelper instance = new VectorHelper(vector);
        int[] expResult = {9,17};
        int[] result = instance.changeVector();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modifie method, of class VectorHelper.
     */
    @Test
    public void testModifie() {
        System.out.println("modifie");
        int val = 5;
        int[] vector={5,9};
        VectorHelper instance = new VectorHelper(vector);
        int expResult = 9;
        int result = instance.modifie(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class VectorHelper.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        int[] vector={5,9,1,30,15,8};
        VectorHelper instance = new VectorHelper(vector);
        int expResult = 30;
        instance.getMinAndMax();
        int result = instance.getMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class VectorHelper.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        int[] vector={5,9,1,30,0,15,8};
        VectorHelper instance = new VectorHelper(vector);
        int expResult = 0;
        instance.getMinAndMax();
        int result = instance.getMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
