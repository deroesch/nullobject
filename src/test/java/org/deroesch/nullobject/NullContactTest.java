/**
 *
 */
package org.deroesch.nullobject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test the NullContact
 */
class NullContactTest {

    /*
     * Contact under test
     */
    Contact c;

    /**
     * Initialize contact under test before EACH test
     *
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
        c = new NullContact();
    }

    /**
     * Test method for {@link org.deroesch.nullobject.NullContact#isNull()}.
     */
    @Test
    void testIsNull() {
        assertTrue(c.isNull());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.NullContact#NullContact()}.
     */
    @Test
    void testNullContact() {
        assertEquals(NullContact.NULL_NAME, c.getName());
        assertEquals(NullContact.NULL_PHONE, c.getPhone());
        assertTrue(c.isNull());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.Contact#getName()}.
     */
    @Test
    void testGetName() {
        assertEquals(NullContact.NULL_NAME, c.getName());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.Contact#getPhone()}.
     */
    @Test
    void testGetPhone() {
        assertEquals(NullContact.NULL_PHONE, c.getPhone());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.Contact#setName(String)}.
     */
    @Test
    void testSetName() {
        c.setName("Jack Sprat");
        assertEquals(NullContact.NULL_NAME, c.getName());

        assertThrows(NullPointerException.class, () -> {
            c.setName(null);
        });
    }

    /**
     * Test method for {@link org.deroesch.nullobject.Contact#setPhone(String)}.
     */
    @Test
    void testSetPhone() {
        c.setPhone("412-555-1212");
        assertEquals(NullContact.NULL_PHONE, c.getPhone());

        assertThrows(NullPointerException.class, () -> {
            c.setPhone(null);
        });
    }

    /*
     * These tests are just to pacify the code coverage tool.
     */
    @Test
    void testToString() {
        assertEquals("Contact(name=name, phone=phone)", c.toString());
    }

}
