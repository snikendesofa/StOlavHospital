import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveException
{
    long serialVersionUID = 1L;
    ArrayList<String> exceptions = new ArrayList<>();

    public String removeException(String exception)
    {
        exceptions.add(exception);
        return exception;
    }
}
