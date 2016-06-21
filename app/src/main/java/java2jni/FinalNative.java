package java2jni;

/**
 * Created by Hughie on 2016/6/21.
 */
public class FinalNative
{
    static
    {
        System.loadLibrary("app");
    }
    public static native int print();
}
