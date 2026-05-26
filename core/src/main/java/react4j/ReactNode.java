package react4j;

import akasha.lang.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * Union type representing possible output of render method.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface ReactNode {

    @JsOverlay
    static ReactNode of(final byte value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    static ReactNode of(final short value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    static ReactNode of(final int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    static ReactNode of(final long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    static ReactNode of(final float value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    static ReactNode of(final double value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    static ReactNode of(final String string) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    static ReactNode of(final JsArray<ReactNode> elements) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    static ReactNode of(final ReactNode... elements) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
