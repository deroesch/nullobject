package org.deroesch.nullobject;

import lombok.NonNull;

/**
 * A real contact
 */
public class LiveContact extends Contact {

    public LiveContact() {
        super("unknown", "unknown");
    }

    public LiveContact(@NonNull String name, @NonNull String phone) {
        super(name, phone);
    }

    @Override
    public boolean isNull() {
        return false;
    }

}
