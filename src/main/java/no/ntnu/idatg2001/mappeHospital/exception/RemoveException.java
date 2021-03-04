package no.ntnu.idatg2001.mappeHospital.exception;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * The RemoveException class with the message we want if the excetion is thrown.
 */
public class RemoveException extends Exception
{
    /**
     * I have no idea what this is but the project said it is supposed to be here.
     */
    long serialVersionUID = 1L;

    /**
     * The constructor for our exception. The constructor contains the message we want displayed when this exception is thrown.
     */
    public RemoveException()
    {
       super("This person can't be removed because they are not in any list.");
    }

    /**
     * A second constructor that so that the message can be modified for a specific method if needed.
     * @param message the message that will be displayed if the exception is thrown.
     */
    public RemoveException(String message)
    {
        super.getMessage();
    }
}
