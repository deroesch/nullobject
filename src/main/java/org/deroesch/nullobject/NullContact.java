package org.deroesch.nullobject;

import lombok.NonNull;

/**
 * A Null Contact
 */
public class NullContact extends Contact {

    static final String NULL_PHONE = "phone";
    static final String NULL_NAME = "name";

    /**
     * Null contact field values are the field names.
     */
    public NullContact() {
        super(NULL_NAME, NULL_PHONE);
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
