package react4j.internal;

import arez.Arez;
import arez.Observer;
import arez.spy.ObservableValueInfo;
import arez.spy.ObserverInfo;
import grim.annotations.OmitType;
import java.util.Objects;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * Utilities for introspecting the React4j views and runtime.
 */
@OmitType(unless = "react4j.store_debug_data_as_state")
public final class IntrospectUtil {

    private IntrospectUtil() {
    }

    /**
     * Return the value for specified observable.
     * Exceptions are caught and types are converted to strings using {@link java.lang.Object#toString()}
     *
     * @param observableInfo the observable.
     * @return the value as a string.
     */
    @SuppressWarnings({ "UnnecessaryUnboxing", "rawtypes" })
    @Nullable
    public static Object getValue(@Nonnull final ObservableValueInfo observableInfo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * For the specified observer, collect all dependencies and record them in data to be emitted as debug data.
     *
     * @param observer the observer.
     * @param data     the target in which to place debug data.
     */
    public static void collectDependencyDebugData(@Nonnull final Observer observer, @Nonnull final JsPropertyMap<Object> data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Prepare the newState value to be updated given specified current state.
     * If no changes are required then return false.
     *
     * @param newState     the new "state" of the view.
     * @param currentState the current "state" of the view.
     * @return true if newState needs to be saved to native view, false otherwise.
     */
    public static boolean prepareStateUpdate(@Nonnull final JsPropertyMap<Object> newState, @Nullable final JsPropertyMap<Object> currentState) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
