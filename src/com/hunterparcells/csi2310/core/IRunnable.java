package com.hunterparcells.csi2310.core;

import java.time.LocalDate;

/**
 * The interface for runnable labs and pieces of code.
 *
 * @author Hunter Parcells
 */
public interface IRunnable {
    /**
     * Combines the name and date of the lab into a formatted string.
     *
     * @return String with the date and name of the runnable.
     *
     * @author Hunter Parcells
     */
    String getFormattedName();

    /**
     * Returns the name of the runnable.
     *
     * @return The name of the runnable.
     *
     * @author Hunter Parcells
     */
    String getName();

    /**
     * Sets the name of the runnable.
     *
     * @param name The name of the runnable.
     *
     * @author Hunter Parcells
     */
    void setName(String name);

    /**
     * Gets the creation date of the runnable.
     *
     * @return The creation date of the runnable.
     *
     * @author Hunter Parcells
     */
    LocalDate getDate();

    /**
     * Sets the creation date of the runnable.
     *
     * @param date The creation date of the runnable.
     *
     * @author Hunter Parcells
     */
    void setDate(LocalDate date);
}
