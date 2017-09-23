package sSystem;

import java.io.BufferedInputStream;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.channels.Channel;
import java.util.Map;
import java.util.Properties;

public class sSystem 
{
    public static PrintStream err = new PrintStream(System.err);
    public static PrintStream out = new PrintStream(System.out);
    public static BufferedInputStream in = new BufferedInputStream(System.in);
    
    @SuppressWarnings("SuspiciousSystemArraycopy")
    public static void arraycopy(Object src, int srcPosition, Object dest, int destPos, int length)
    {
        System.arraycopy(src, destPos, dest, destPos, length);
    }
    
    public static String clearProperty(String key)
    {
        String property = System.clearProperty(key);
        return property;
    }
    
    public static Console console()
    {
        Console console = System.console();
        return console;
    }
    
    public static long currentTimeMillis()
    {
        long time = System.currentTimeMillis();
        return time;
    }
    
    public static void exit(int status)
    {
        System.exit(status);
    }
    
    public static void gc()
    {
        System.gc();
    }
    
    public static Properties getProperties()
    {
        Properties prop = System.getProperties();
        return prop;
    }
    
    public static String getProperty(String key)
    {
        String property = System.getProperty(key);
        return property;
    }
    
    public static String getProperty(String key, String def)
    {
        String property = System.getProperty(key, def);
        return property;
    }
    
    public static SecurityManager getSecurityManager()
    {
        SecurityManager security = System.getSecurityManager();
        return security;
    }
    
    public static Map<String, String> getenv()
    {
        Map<String, String> map = System.getenv();
        return map;
    }
    
    public static String getenv(String name)
    {
        String nam = System.getenv(name);
        return nam;
    }
    
    public static int idenityHashCode(Object x)
    {
        int hash = System.identityHashCode(x);
        return hash;
    }
    
    public static Channel inheritedChannel() throws IOException
    {
        Channel channel = System.inheritedChannel();
        return channel;
    }
    
    public static String lineSeperator()
    {
        String line = System.lineSeparator();
        return line;
    }
    
    public static void load(String filename)
    {
        System.load(filename);
    }
    
    public static void loadLibrary(String libname)
    {
        System.loadLibrary(libname);
    }
    
    public static String mapLibraryName(String libname)
    {
        String name = System.mapLibraryName(libname);
        return name;
    }
    
    public static long nanoTime()
    {
        long nano = System.nanoTime();
        return nano;
    }
    
    public static void runFinalization()
    {
        System.runFinalization();
    }
    
    public static void setErr(PrintStream err)
    {
        System.setErr(err);
    }
    
    public static void setIn(InputStream in)
    {
        System.setIn(in);
    }
    
    public static void setOut(PrintStream out)
    {
        System.setOut(out);
    }
    
    public static void setProperties(Properties props)
    {
        System.setProperties(props);
    }
    
    public static void setProperty(String key, String value)
    {
        System.setProperty(key, value);
    }
    
    public static void setSecurityManager(SecurityManager s)
    {
        System.setSecurityManager(s);
    }
}
