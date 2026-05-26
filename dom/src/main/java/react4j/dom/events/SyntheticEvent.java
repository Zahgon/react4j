package react4j.dom.events;

import akasha.Element;
import akasha.Event;
import akasha.core.JsDate;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
@SuppressWarnings("unused")
public class SyntheticEvent<E extends Event> {

    private boolean bubbles;

    private boolean cancelable;

    private Element currentTarget;

    private boolean defaultPrevented;

    private int eventPhase;

    private boolean isTrusted;

    private E nativeEvent;

    private Element target;

    private JsDate timeStamp;

    private String type;

    public native void preventDefault();

    public native boolean isDefaultPrevented();

    public native boolean isPropagationStopped();

    public native void stopPropagation();

    public native void persist();

    @JsOverlay
    public final boolean isBubbles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isCancelable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final Element getCurrentTarget() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getEventPhase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isTrusted() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final E getNativeEvent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final Element getTarget() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final JsDate getTimeStamp() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final String getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
