package react4j;

import grim.annotations.OmitType;
import javax.annotation.Nonnull;
import org.realityforge.braincheck.BrainCheckConfig;

/**
 * Location of all compile time configuration settings for framework.
 */
@SuppressWarnings("FieldMayBeFinal")
@OmitType
final class ReactConfig {

    @Nonnull
    private static final ConfigProvider PROVIDER = new ConfigProvider();

    private static final boolean PRODUCTION_ENVIRONMENT = PROVIDER.isProductionEnvironment();

    private static boolean ENABLE_VIEW_NAMES = PROVIDER.enableViewNames();

    private static boolean MINIMIZE_INPUT_KEYS = PROVIDER.shouldMinimizeInputKeys();

    private static boolean SHOULD_VALIDATE_INPUT_VALUES = PROVIDER.shouldValidateInputValues();

    private static boolean SHOULD_STORE_DEBUG_DATA_AS_STATE = PROVIDER.shouldStoreDebugDataAsState();

    private static boolean CHECK_INVARIANTS = PROVIDER.shouldCheckInvariants();

    private ReactConfig() {
    }

    static boolean isProductionEnvironment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return true if views should have human readable names specified.
     * Useful if you want to interact via DevTools or other tool chains.
     *
     * @return true to enable human readable names for views.
     */
    static boolean enableViewNames() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return true if the input keys should be minimized.
     * This will significantly reduce the size of the compiled output but will make inspecting the inputs
     * in DevTools difficult if not impossible.
     *
     * @return true to minimize input keys.
     */
    static boolean shouldMinimizeInputKeys() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return true if the input value should be validated when initially set or when changed.
     *
     * @return true to validate input values.
     */
    static boolean shouldValidateInputValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return true if react state should be used to store debug data.
     * Useful if you want to inspect the debug data via DevTools. This feature is resource intensive
     * and should not be enabled in production.
     *
     * @return true if react state should be used to store debug data.
     */
    static boolean shouldStoreDebugDataAsState() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return true if invariants will be checked.
     *
     * @return true if invariants will be checked.
     */
    static boolean shouldCheckInvariants() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static final class ConfigProvider extends AbstractConfigProvider {

        @GwtIncompatible
        @Override
        boolean isProductionEnvironment() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @GwtIncompatible
        @Override
        boolean enableViewNames() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @GwtIncompatible
        @Override
        boolean shouldMinimizeInputKeys() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @GwtIncompatible
        @Override
        boolean shouldValidateInputValues() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @GwtIncompatible
        @Override
        boolean shouldStoreDebugDataAsState() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @GwtIncompatible
        @Override
        boolean shouldCheckInvariants() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @SuppressWarnings({ "unused", "StringEquality" })
    private static abstract class AbstractConfigProvider {

        boolean isProductionEnvironment() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        boolean enableViewNames() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        boolean shouldMinimizeInputKeys() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        boolean shouldValidateInputValues() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        boolean shouldStoreDebugDataAsState() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        boolean shouldCheckInvariants() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
