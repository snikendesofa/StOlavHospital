package no.ntnu.idatg2001.mappeHospital.exception;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveException extends Exception
{
    long serialVersionUID = 1L;

    public RemoveException()
    {
       super("This person can't be removed because they are not in any list.");
    }

    public RemoveException(String message)
    {
        super.getMessage();
    }
}
