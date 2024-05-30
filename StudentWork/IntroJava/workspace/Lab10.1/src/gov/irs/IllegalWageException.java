package gov.irs;

// custom checked application class
public class IllegalWageException extends Exception
{
    public IllegalWageException()
    {
        super();
    }

    public IllegalWageException(String message)
    {
        super(message);
    }

    public IllegalWageException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public IllegalWageException(Throwable cause)
    {
        super(cause);
    }
}
