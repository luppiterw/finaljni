package java2jni;

/**
 * Created by Hughie on 2016/6/21.
 */
public class FinalNative
{
    static
    {
        System.loadLibrary("java2jni");
    }
    public static native int print();
}
