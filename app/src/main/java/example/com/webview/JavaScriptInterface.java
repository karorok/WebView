package example.com.webview;

import android.util.Log;
import android.webkit.JavascriptInterface;


/**
 * Created by karorok on 2018. 12. 21..
 */

public class JavaScriptInterface {
    private final String TAG = JavaScriptInterface.class.getSimpleName();

    private Listener listener;

    public JavaScriptInterface() {

    }

    public void setOnCustomJavascriptListener(Listener listener) {
        this.listener = listener;
    }



    @JavascriptInterface
    public void signup(String name) {
        Log.d(TAG,"name   :  "+name);
        if (listener != null) {
            listener.didEvent(name);
        }
    }

    public interface Listener{
        void didEvent(String name);
    }

}
