package react4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import static org.realityforge.braincheck.Guards.*;

/**
 * A global registry containing the react contexts that have been created.
 * A react context is expected to be registered with a java type and an optional qualifier.
 * This allows multiple contexts of the same type to be present in the global registry.
 */
public final class Contexts {

    /**
     * The default qualifier if not otherwise specified.
     */
    @Nonnull
    private static final String DEFAULT_QUALIFIER = "";

    /**
     * The map containing all the contexts. See the class javadocs for further details.
     */
    @Nonnull
    private static final Map<Class<?>, Map<String, Context<?>>> c_contexts = new HashMap<>();

    /**
     * Context provider.
     */
    @Nonnull
    private static ContextProvider c_contextProvider = new DefaultContextProvider();

    private Contexts() {
    }

    /**
     * Register the context with the specified type, an empty "" qualifier and a null default value.
     * A context with matching type and qualifier parameters must not have been already registered.
     *
     * @param type the type of the context value.
     * @param <T>  the type of the context value.
     * @see #register(Class, String, Object)
     */
    public static <T> void register(@Nonnull final Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Register the context with the specified type, an empty "" qualifier and a default value.
     * A context with matching type and qualifier parameters must not have been already registered.
     *
     * @param type         the type of the context value.
     * @param defaultValue the default value to return if no provider has been specified higher in the tree.
     * @param <T>          the type of the context value.
     * @see #register(Class, String, Object)
     */
    public static <T> void register(@Nonnull final Class<T> type, @Nullable final T defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Register the context with the specified type, qualifier and a null default value.
     * A context with matching type and qualifier parameters must not have been already registered.
     *
     * @param type      the type of the context value.
     * @param qualifier the qualifier to distinguish multiple instances of the the same type.
     * @param <T>       the type of the context value.
     * @see #register(Class, String, Object)
     */
    public static <T> void register(@Nonnull final Class<T> type, @Nonnull final String qualifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Register the context with the specified type, qualifier and a default value.
     * A context with matching type and qualifier parameters must not have been already registered.
     *
     * @param type         the type of the context value.
     * @param qualifier    the qualifier to distinguish multiple instances of the the same type.
     * @param defaultValue the default value to return if no provider has been specified higher in the tree.
     * @param <T>          the type of the context value.
     */
    public static <T> void register(@Nonnull final Class<T> type, @Nonnull final String qualifier, @Nullable final T defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the context with the specified type and an empty "" qualifier.
     * A context with matching type and qualifier parameters must have already been registered.
     *
     * @param type the type of the context value.
     * @param <T>  the type of the context value.
     * @return the context.
     * @see #get(Class, String)
     */
    public static <T> Context<T> get(@Nonnull final Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the context with the specified type and qualifier.
     * A context with matching type and qualifier parameters must have already been registered.
     *
     * @param type      the type of the context value.
     * @param qualifier the qualifier to distinguish multiple instances of the the same type.
     * @param <T>       the type of the context value.
     * @return the context.
     * @see #get(Class)
     */
    @SuppressWarnings("unchecked")
    public static <T> Context<T> get(@Nonnull final Class<T> type, @Nonnull final String qualifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void setContextProvider(@Nonnull final ContextProvider contextProvider) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Interface used to provide context. This can be switched out as part of testing.
     */
    interface ContextProvider {

        <T> Context<T> createContext(@Nullable T defaultValue);
    }

    static class DefaultContextProvider implements ContextProvider {

        @Override
        public <T> Context<T> createContext(@Nullable final T defaultValue) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
