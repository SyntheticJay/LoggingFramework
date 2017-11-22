package me.jay;

import me.jay.interfaces.Logger;

/**
 * @Author Jay
 *
 * @see me.jay.interfaces.Logger
 *
 * Very simple for now, may upgrade.
 *
 * TODO: Check if withName is not used, if not then set to normal name: logger.
 * TODO: Make more options for the user.
 */
public class LoggerFactory implements Logger {

    /**
     * Raw Variables
     */
    private String name;
    private boolean withParentheses;
    private Class clazz;

    /**
     * <p>
     * Determine's if the logger should have a name
     * </p>
     * @param name -> Name
     * @return -> This class
     */
    public LoggerFactory withName(String name) {
        if(name == null || name.equals("")) {
            name = "Logger";
        }
        this.name = name;
        return this;
    }

    /**
     * <p>
     *     Determine's if the logger should use parenthases
     * </p>
     * @param withParentheses -> Parenthases (bool)
     * @return -> This class
     */
    public LoggerFactory withParenthases(boolean withParentheses) {
        this.withParentheses = withParentheses;
        return this;
    }

    @Override
    public void print(Object msg) {
        System.out.println(msg);
    }

    @Override
    public void info(Object msg) {
        String prefix = withParentheses ? "(" + name + ")(INFO)" : "[" + name + "][INFO]";
        print(prefix + " " + msg);
    }

    @Override
    public void log(Object msg, Level level) {
        String prefix = withParentheses ? "(" + name + ")(" + level.getName() + ")" : "[" + name + "][" + level.getName() + "]";
        switch(level) {
            case FATAL:
                print(prefix + " " + msg);
                break;
            case ERROR:
                print(prefix + " " + msg);
                break;
            case DEBUG:
                print(prefix + " " + msg);
                break;
            case INFO:
                print(prefix + " " + msg);
                break;
        }
    }
}
