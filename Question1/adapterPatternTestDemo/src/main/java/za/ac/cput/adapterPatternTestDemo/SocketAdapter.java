package za.ac.cput.adapterPatternTestDemo;

/**
 * Created by student on 2015/03/13.
 */
public interface SocketAdapter {
    public Voltage get240Volt();
    public Voltage get12Volt();
    public Voltage get3Volt();
}
