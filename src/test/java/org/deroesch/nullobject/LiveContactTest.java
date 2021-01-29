package org.deroesch.nullobject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test the LiveContact
 */
class LiveContactTest {

    /*
     * Test constants
     */
    private static final String PH_412_555_1212 = "412-555-1212";
    private static final String JACK_SPRAT = "Jack Sprat";

    /*
     * Contact under test
     */
    Contact c;

    /**
     * Initialize contact under tests before EACH test.
     *
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
        assertEquals(StringUtils.EMPTY, c.getName());
        assertEquals(StringUtils.EMPTY, c.getPhone());
        assertFalse(c.isNull());
    }

    /**
     * Test method for
     * {@link org.deroesch.nullobject.LiveContact#LiveContact(String, String)}.
     */
    @Test
    void testLiveContactStringString() {

        c = new LiveContact(JACK_SPRAT, PH_412_555_1212);
        assertEquals(JACK_SPRAT, c.getName());
        assertEquals(PH_412_555_1212, c.getPhone());
        assertFalse(c.isNull());

        assertThrows(NullPointerException.class, () -> {
            new LiveContact(JACK_SPRAT, null);
        });

        assertThrows(NullPointerException.class, () -> {
            new LiveContact(null, PH_412_555_1212);
        });

        assertThrows(NullPointerException.class, () -> {
            new LiveContact(null, null);
        });
    }

    /**
     * Test method for {@link org.deroesch.nullobject.Contact#getName()}.
     */
    @Test
    void testGetName() {
        assertEquals(StringUtils.EMPTY, c.getName());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.Contact#getPhone()}.
     */
    @Test
    void testGetPhone() {
        assertEquals(StringUtils.EMPTY, c.getPhone());
    }

    /**
     * Test method for {@link org.deroesch.nullobject.Contact#setName(String)}.
     */
    @Test
    void testSetName() {
        c.setName(JACK_SPRAT);
        assertEquals(JACK_SPRAT, c.getName());

        assertThrows(NullPointerException.class, () -> {
            c.setName(null);
        });
    }

    /**
     * Test method for {@link org.deroesch.nullobject.Contact#setPhone(String)}.
     */
    @Test
    void testSetPhone() {
        c.setPhone(PH_412_555_1212);
        assertEquals(PH_412_555_1212, c.getPhone());

        assertThrows(NullPointerException.class, () -> {
            c.setPhone(null);
        });
    }

    @Test
    void testToString() {
        assertEquals("Contact(name=, phone=)", c.toString());
    }

}
