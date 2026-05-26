package react4j.dom.events;

import akasha.EventTarget;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
@SuppressWarnings("unused")
public class MouseEvent extends SyntheticEvent<akasha.MouseEvent> {

    private boolean altKey;

    private int button;

    private int buttons;

    private int clientX;

    private int clientY;

    private boolean ctrlKey;

    private boolean metaKey;

    private int pageX;

    private int pageY;

    private EventTarget relatedTarget;

    private int screenX;

    private int screenY;

    private boolean shiftKey;

    public native boolean getModifierState(@Nonnull String key);

    @JsOverlay
    public final boolean isAltKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getButton() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getButtons() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getClientX() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getClientY() {
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
    public final int getPageX() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getPageY() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final EventTarget getRelatedTarget() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getScreenX() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final int getScreenY() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final boolean isShiftKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
