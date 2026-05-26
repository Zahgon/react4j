package react4j.processor;

import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.TypeMirror;
import org.realityforge.proton.AnnotationsUtil;
import org.realityforge.proton.MemberChecks;
import org.realityforge.proton.ProcessorException;

@SuppressWarnings("Duplicates")
final class InputDescriptor {

    @Nonnull
    private final ViewDescriptor _descriptor;

    @Nonnull
    private final String _name;

    @Nonnull
    private final String _qualifier;

    @Nonnull
    private final Element _element;

    @Nonnull
    private final TypeMirror _type;

    @Nullable
    private final ExecutableElement _method;

    @Nullable
    private final ExecutableType _methodType;

    @Nullable
    private final VariableElement _parameter;

    private final boolean _fromTreeContext;

    private final boolean _shouldUpdateOnChange;

    private final boolean _observable;

    private final boolean _disposable;

    @Nullable
    private final ImmutableInputKeyStrategy _immutableInputKeyStrategy;

    @Nonnull
    private final String _requiredValue;

    private boolean _onChangePresent;

    private boolean _suppressMutableInputAccessedInPostConstruct;

    @Nullable
    private VariableElement _defaultField;

    @Nullable
    private ExecutableElement _defaultMethod;

    @Nullable
    private ExecutableElement _validateMethod;

    /**
     * Flag set to true if input is optional.
     */
    private boolean _optional;

    @Nullable
    private Boolean _isNonNull;

    InputDescriptor(@Nonnull final ViewDescriptor descriptor, @Nonnull final String name, @Nonnull final String qualifier, @Nonnull final Element element, @Nonnull final TypeMirror type, @Nullable final ExecutableElement method, @Nullable final ExecutableType methodType, @Nullable final VariableElement parameter, final boolean fromTreeContext, final boolean shouldUpdateOnChange, final boolean observable, final boolean disposable, @Nullable final ImmutableInputKeyStrategy immutableInputKeyStrategy, @Nonnull final String requiredValue) {
        _descriptor = Objects.requireNonNull(descriptor);
        _name = Objects.requireNonNull(name);
        _qualifier = Objects.requireNonNull(qualifier);
        _element = Objects.requireNonNull(element);
        _type = Objects.requireNonNull(type);
        _method = method;
        _methodType = methodType;
        _parameter = parameter;
        _fromTreeContext = fromTreeContext;
        _shouldUpdateOnChange = shouldUpdateOnChange;
        _observable = observable;
        _disposable = disposable;
        _immutableInputKeyStrategy = immutableInputKeyStrategy;
        _requiredValue = Objects.requireNonNull(requiredValue);
    }

    @Nonnull
    String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    String getQualifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    Element getElement() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    TypeMirror getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isMethodInput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    ExecutableElement getMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    ExecutableType getMethodType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    VariableElement getParameter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean shouldUpdateOnChange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isObservable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isDisposable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isImmutable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    String getRequiredValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void markAsOnChangePresent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void suppressMutableInputAccessedInPostConstruct() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean needsMutableInputAccessedInPostConstructInvariant() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean mayNeedMutableInputAccessedInPostConstructInvariant() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ImmutableInputKeyStrategy getImmutableInputKeyStrategy() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasValidateMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ExecutableElement getValidateMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setValidateMethod(@Nonnull final ExecutableElement method) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasDefaultField() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    VariableElement getDefaultField() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setDefaultField(@Nonnull final VariableElement field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasDefaultMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ExecutableElement getDefaultMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setDefaultMethod(@Nonnull final ExecutableElement method) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isOptional() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isNonNull() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void markAsOptional() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    String getConstantName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isFromTreeContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isSpecialChildrenInput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
