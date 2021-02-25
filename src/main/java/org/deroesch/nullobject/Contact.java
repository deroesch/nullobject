package org.deroesch.nullobject;

import java.util.Objects;

import lombok.Data;
import lombok.NonNull;

/**
 * A simple contact w/ name and phone number.
 */
@Data
public abstract class Contact {

    @NonNull
    private String name;

    @NonNull
    private String phone;

    /**
     * Is this a null object?
     *
     * @return False if this a null object, true otherwise.
     */
    public abstract boolean isNull();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) obj;
        return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

}
