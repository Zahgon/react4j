package react4j.dom.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
@SuppressWarnings("unused")
public class UIEvent extends SyntheticEvent<akasha.UIEvent> {

    private int detail;

    private AbstractView view;

    @JsOverlay
    public final int getDetail() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final AbstractView getView() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
