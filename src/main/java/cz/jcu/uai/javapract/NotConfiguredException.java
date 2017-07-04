package cz.jcu.uai.javapract;

/**
 * Exception for situation when configuration is missing or incomplete.
 *
 * Created by Drml on 4.7.2017.
 */
public class NotConfiguredException extends Exception {
    public NotConfiguredException(String message)
    {
        super(message);
    }
}
