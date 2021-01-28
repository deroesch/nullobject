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

    MiniContact c;

    /**
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
        assertEquals("name", c.getName());
        assertEquals("phone", c.getPhone());
        assertTrue(c.isNull());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.MiniContact#getName()}.
     */
    @Test
    void testGetName() {
        assertEquals("name", c.getName());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.MiniContact#getPhone()}.
     */
    @Test
    void testGetPhone() {
        assertEquals("phone", c.getPhone());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.MiniContact#setName(String)}.
     */
    @Test
    void testSetName() {
        c.setName("Jack Sprat");
        assertEquals("name", c.getName());

        assertThrows(NullPointerException.class, () -> {
            c.setName(null);
        });
    }

    /**
     * Test method for {@link org.deroesch.nullobject.MiniContact#setPhone(String)}.
     */
    @Test
    void testSetPhone() {
        c.setPhone("412-555-1212");
        assertEquals("phone", c.getPhone());

        assertThrows(NullPointerException.class, () -> {
            c.setPhone(null);
        });
    }

}
