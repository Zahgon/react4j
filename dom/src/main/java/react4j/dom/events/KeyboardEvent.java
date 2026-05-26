package react4j.dom.events;

import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
@SuppressWarnings("unused")
public class KeyboardEvent extends SyntheticEvent<akasha.KeyboardEvent> {

    private boolean altKey;

    private int charCode;

    private boolean ctrlKey;

    private String key;

    private int keyCode;

    private String locale;

    private int location;

    private boolean metaKey;

    private boolean repeat;

    private boolean shiftKey;

    private int which;

    public native boolean getModifierState(@Nonnull String key);

    @JsOverlay
    public final boolean isAltKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getCharCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isCtrlKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final String getKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getKeyCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final String getLocale() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getLocation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isMetaKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isRepeat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isShiftKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getWhich() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
