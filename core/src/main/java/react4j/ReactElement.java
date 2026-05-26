package react4j;

import java.util.Objects;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.Contract;
import react4j.internal.ViewConstructorFunction;

/**
 * Element represents either a view or a host component.
 */
@SuppressWarnings("unused")
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ReactElement implements ReactNode {

    @JsProperty(name = "$$typeof")
    private Object typeof;

    private Object type;

    private String key;

    private Object ref;

    @JsProperty(name = "props")
    private JsPropertyMap<Object> inputs;

    // The view responsible for creating this element.
    // can be null if create happens outside of a render method (i.e. at the top level).
    @Nullable
    private Object _owner;

    @JsOverlay
    @Contract(pure = true)
    @Nonnull
    public final ReactElement dup() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    public static ReactElement createViewElement(@Nonnull final ViewConstructorFunction type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    static ReactElement createContextElement(@Nonnull final Object type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    private static ReactElement create(@Nonnull final Object type) {
        return createRawNode(React.Element, type);
    }

    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    private static ReactElement createRawNode(@Nonnull final Object typeof, @Nonnull final Object type) {
        final ReactElement element = new ReactElement();
        element.typeof = Objects.requireNonNull(typeof);
        element.type = Objects.requireNonNull(type);
        element._owner = React.currentOwner();
        return element;
    }

    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    private static ReactElement createRawElement(@Nonnull final Object type, @Nullable final String key, @Nullable final Object ref, @Nonnull final JsPropertyMap<Object> inputs) {
        final ReactElement element = create(type);
        element.key = key;
        element.ref = ref;
        element.inputs = Objects.requireNonNull(inputs);
        return element;
    }

    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    public static ReactElement createFragment(@Nullable final String key, @Nonnull final ReactNode... children) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create a StrictMode component with the specified children.
     *
     * @param children the child nodes.
     * @return a new React.StrictMode component.
     */
    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    public static ReactNode createStrictMode(@Nonnull final ReactNode... children) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    public static ReactElement createSuspense(@Nullable final String key, @Nullable final ReactNode fallback, final int maxTimeToFallback, @Nonnull final ReactNode... children) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    public static ReactElement createHostElement(@Nonnull final String type, @Nullable final String key, @Nullable final Object ref, @Nonnull final JsPropertyMap<Object> inputs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    @Nullable
    @Contract(pure = true)
    public final String key() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    public final void setKey(@Nullable final String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    @Nonnull
    @Contract(pure = true)
    public final JsPropertyMap<Object> inputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    @Nonnull
    public final ReactElement input(@Nonnull final String key, @DoNotAutobox final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsOverlay
    protected final void setInputs(@Nonnull final JsPropertyMap<Object> inputs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
