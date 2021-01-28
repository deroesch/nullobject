package org.deroesch.nullobject;

import lombok.NonNull;

/**
 * A Null Contact
 */
public class NullContact extends Contact {

    /**
     * Null contact field values are the field names.
     */
    public NullContact() {
        super("name", "phone");
    }

    @Override
    public boolean isNull() {
        return true;
    }

    /*
     * Setters do nothing
     */

    @Override
    public void setName(@NonNull final String s) {
    }

    @Override
    public void setPhone(@NonNull final String s) {
    }

}
