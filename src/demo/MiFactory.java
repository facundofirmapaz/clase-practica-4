package demo;


public class MiFactory
{
    public static Object getInstance(String objName) throws ClassNotFoundException
    {
        return Class.forName(objName);

    }
}
