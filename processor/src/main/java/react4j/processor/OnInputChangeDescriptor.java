package react4j.processor;

import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.lang.model.element.ExecutableElement;

final class OnInputChangeDescriptor {

    @Nonnull
    private final ExecutableElement _method;

    @Nonnull
    private final List<InputDescriptor> _inputs;

    /**
     * Flag set to true if the hook method is invoked prior to update.
     */
    private final boolean _preUpdate;

    OnInputChangeDescriptor(@Nonnull final ExecutableElement method, @Nonnull final List<InputDescriptor> inputs, final boolean preUpdate) {
        _method = Objects.requireNonNull(method);
        _inputs = Objects.requireNonNull(inputs);
        _preUpdate = preUpdate;
        _inputs.forEach(InputDescriptor::markAsOnChangePresent);
    }

    @Nonnull
    ExecutableElement getMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isPreUpdate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<InputDescriptor> getInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
