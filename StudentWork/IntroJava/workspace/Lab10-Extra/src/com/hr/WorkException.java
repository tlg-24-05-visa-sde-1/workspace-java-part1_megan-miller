package com.hr;

/*
 * This is a more HR-oriented, higher-level exception type
 * than the other low-level transportation related exception
 */
public class WorkException extends Exception
{
    public WorkException()
    {
    }

    public WorkException(String message)
    {
        super(message);
    }

    public WorkException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public WorkException(Throwable cause)
    {
        super(cause);
    }
}
