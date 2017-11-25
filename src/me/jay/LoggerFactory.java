package me.jay;

import me.jay.interfaces.Logger;

import java.util.GregorianCalendar;

/**
 * @Author Jay
 *
 * @see me.jay.interfaces.Logger
 *
 * Very simple for now, may upgrade.
 *
 * TODO: Check if withName is not used, if not then set to normal name: logger.
 * TODO: Make more options for the user.
 *
 * Fucking Deprication
 */
public class LoggerFactory implements Logger {

    /**
     * Raw Variables
     */
    private String name;
    private boolean withParenthesis;

    /**
     * Time As Suggested by Stone_Warrior <3
     */
    private GregorianCalendar cal = new GregorianCalendar();

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
        this.name = name.toUpperCase();
        return this;
    }

    /**
     * <p>
     *     Determine's if the logger should use parenthesis
     * </p>
     * @param withParenthesis -> Parenthesis (bool)
     * @return -> This class
     */
    public LoggerFactory withParenthesis(boolean withParenthesis) {
        this.withParenthesis = withParenthesis;
        return this;
    }

    @Override
    public void print(Object msg) {
        System.out.println(msg);
    }

    @Override
    public void info(Object msg) {
        String prefix = withParenthesis ? "(" + name + ")(INFO)(" + cal.getTime().getHours() + ":" + cal.getTime().getMinutes() + ":" + cal.getTime().getSeconds() + ")" : "[" + name + "][INFO][" + + cal.getTime().getHours() + ":" + cal.getTime().getMinutes() + ":" + cal.getTime().getSeconds() + "]";
        print(prefix + " " + msg);
    }

    @Override
    public void log(Object msg, Level level) {
        String prefix = withParenthesis ? "(" + name + ")(" + level.getName() + ")(" + + cal.getTime().getHours() + ":" + cal.getTime().getMinutes() + ":" + cal.getTime().getSeconds() + ")" : "[" + name + "][" + level.getName() + "][" + + cal.getTime().getHours() + ":" + cal.getTime().getMinutes() + ":" + cal.getTime().getSeconds() + "]";
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

    /**
     * <p>
     *  Create's the new LoggerFactory instance using the specified arguments.
     *  (Made static, thanks Stone <3)
     * </p>
     * @return
     */
    public static LoggerFactory create() {
        return new LoggerFactory().withName(this.name).withParenthesis(this.withParenthesis);
    }
}
