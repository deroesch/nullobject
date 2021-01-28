package org.deroesch.nullobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Contact {

    @NonNull
    private String name;

    @NonNull
    private String phone;

    /**
     * Is this a null object?
     * 
     * @return
     */
    public abstract boolean isNull();

}
