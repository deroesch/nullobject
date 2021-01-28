package org.deroesch.nullobject;

import org.apache.commons.lang3.StringUtils;

import lombok.NonNull;

/**
 * A real contact
 */
public class LiveContact extends Contact {

    public LiveContact() {
        super(StringUtils.EMPTY, StringUtils.EMPTY);
    }

    public LiveContact(@NonNull final String name, @NonNull final String phone) {
        super(name, phone);
    }

    @Override
    public boolean isNull() {
        return false;
    }

}
