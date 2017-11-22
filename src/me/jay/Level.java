package me.jay;

/**
 * @Author Jay
 *
 * <p>
 *  Used to categorise the Levels/Priorities of the log.
 * </p>
 */
public enum Level {

    /**
     * <p>
     *    Fatal Represents something that has gone wrong, 1nd in ranking.
     * </p>
     */
    FATAL("Fatal"),

    /**
     * <p>
     *     Error represents an error in the code / something that has gone wrong, 2rd in ranking.
     * </p>
     */
    ERROR("Error"),

    /**
     * <p>
     *     Debug represents something that is currently in the making or something that may be possibly buggy, 3th in ranking.
     * </p>
     */
    DEBUG("Debug"),

    /**
     * <p>
     *     Pretty self explanitory, Info represents something to do with information. 4th In raking, currently the lowest.
     * </p>
     */
    INFO("Info");

    /**
     * Raw variable for name.
     */
    String name;

    /**
     * Constructor
     * @param name -> Name of the Level/Priority.
     */
    Level(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Return's the name of the level
     * </p>
     * @return
     */
    public String getName() {
        return name;
    }

}

