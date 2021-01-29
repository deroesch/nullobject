package org.deroesch.nullobject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {

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

    @Test
    void testHashCode() {
        assertEquals(c.hashCode(), c.hashCode());
        assertNotEquals(c.hashCode(), new LiveContact().hashCode());
    }

    @Test
    void testEquals() {
        assertEquals(c, c);
        assertEquals(c, new NullContact());
        assertNotEquals(c, new LiveContact());
        assertNotEquals(c, new LiveContact(c.getName(), ""));
        assertNotEquals(c, new LiveContact("", c.getPhone()));
        assertNotEquals(c, new Object());
    }

}
