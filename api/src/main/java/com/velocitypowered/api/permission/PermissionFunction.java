package com.velocitypowered.api.permission;

import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Function that calculates the permission settings for a given
 * {@link PermissionSubject}.
 */
@FunctionalInterface
public interface PermissionFunction {
    /**
     * A permission function that always returns {@link Tristate#TRUE}.
     */
    PermissionFunction ALWAYS_TRUE = p -> Tristate.TRUE;

    /**
     * A permission function that always returns {@link Tristate#FALSE}.
     */
    PermissionFunction ALWAYS_FALSE = p -> Tristate.FALSE;

    /**
     * A permission function that always returns {@link Tristate#UNDEFINED}.
     */
    PermissionFunction ALWAYS_UNDEFINED = p -> Tristate.UNDEFINED;

    /**
     * Gets the subjects setting for a particular permission.
     *
     * @param permission the permission
     * @return the value the permission is set to
     */
    @NonNull Tristate getPermissionValue(@NonNull String permission);
}
