package react4j.dom.events;

import akasha.TouchList;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
@SuppressWarnings("unused")
public class TouchEvent extends SyntheticEvent<akasha.TouchEvent> {

    private boolean altKey;

    private TouchList changedTouches;

    private boolean ctrlKey;

    private boolean metaKey;

    private boolean shiftKey;

    private TouchList targetTouches;

    private TouchList touches;

    public native boolean getModifierState(@Nonnull String key);

    @JsOverlay
    public final boolean isAltKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final TouchList getChangedTouches() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isCtrlKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isMetaKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isShiftKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final TouchList getTargetTouches() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final TouchList getTouches() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
