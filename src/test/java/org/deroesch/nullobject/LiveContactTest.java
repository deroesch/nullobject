package org.deroesch.nullobject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test the LiveContact
 */
class LiveContactTest {

    MiniContact c;

    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
        c = new LiveContact();
    }

    /**
     * Test method for {@link org.deroesch.nullobject.LiveContact#isNull()}.
     */
    @Test
    void testIsNull() {
        assertFalse(c.isNull());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.LiveContact#LiveContact()}.
     */
    @Test
    void testLiveContact() {
        assertEquals("unknown", c.getName());
        assertEquals("unknown", c.getPhone());
        assertFalse(c.isNull());
    }

    /**
     * Test method for
     * {@link org.deroesch.nullobject.LiveContact#LiveContact(String, String)}.
     */
    @Test
    void testLiveContactStringString() {

        final String name = "Jack Sprat";
        final String phone = "412-555-1212";

        c = new LiveContact(name, phone);
        assertEquals(name, c.getName());
        assertEquals(phone, c.getPhone());
        assertFalse(c.isNull());

        assertThrows(NullPointerException.class, () -> {
            new LiveContact(name, null);
        });

        assertThrows(NullPointerException.class, () -> {
            new LiveContact(null, phone);
        });
    }

    /**
     * Test method for {@link org.deroesch.nullobject.MiniContact#getName()}.
     */
    @Test
    void testGetName() {
        assertEquals("unknown", c.getName());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.MiniContact#getPhone()}.
     */
    @Test
    void testGetPhone() {
        assertEquals("unknown", c.getPhone());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.MiniContact#setName(String)}.
     */
    @Test
    void testSetName() {
        final String value = "Jack Sprat";
        c.setName(value);
        assertEquals(value, c.getName());

        assertThrows(NullPointerException.class, () -> {
            c.setName(null);
        });
    }

    /**
     * Test method for {@link org.deroesch.nullobject.MiniContact#setPhone(String)}.
     */
    @Test
    void testSetPhone() {
        final String value = "412-555-1212";
        c.setPhone(value);
        assertEquals(value, c.getPhone());

        assertThrows(NullPointerException.class, () -> {
            c.setPhone(null);
        });
    }

}
