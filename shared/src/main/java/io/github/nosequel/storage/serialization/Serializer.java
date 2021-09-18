package io.github.nosequel.storage.serialization;

import com.google.gson.JsonElement;

public interface Serializer<T> {

    /**
     * Deserialize a {@link T} object to a {@link String}
     *
     * @param source the string to deserialize
     * @return the object
     */
    T deserialize(String source);

    /**
     * Serialize a {@link T} object to a {@link String}
     *
     * @param object the object to serialize
     * @return the serialized object
     */
    JsonElement serialize(T object);

}
