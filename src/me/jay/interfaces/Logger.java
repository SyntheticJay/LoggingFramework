package me.jay.interfaces;

import me.jay.Level;

/**
 * @Author Jay
 *
 * Interface to represent the logging statements.
 * <P>Implementing LoggerFactory</P>
 */
public interface Logger {
    /**
     * <p>
     *     Print's normally with raw.
     * </p>
     * @param msg -> Message to print
     */
    void print(Object msg);

    /**
     * <p>
     *     Used for Info markers, doesn't need a category
     * </p>
     * @param msg -> Message to print
     */
    void info(Object msg);

    /**
     * <p>
     *     Used to log with categorization, <code>Level.class</code>
     * </p>
     * @param msg -> Message to print
     * @param level -> {@code Level.class} level.
     */
    void log(Object msg, Level level);
}
