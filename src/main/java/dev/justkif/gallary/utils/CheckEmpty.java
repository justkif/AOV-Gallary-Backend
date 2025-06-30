package dev.justkif.gallary.utils;

import java.util.List;

import dev.justkif.gallary.exceptions.NotFoundException;

public class CheckEmpty {

    public static <T> List<T> checkList(List<T> list, String message) {
        if (list == null || list.isEmpty()) {
            throw new NotFoundException(message);
        }
        return list;
    }

}
