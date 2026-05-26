package react4j.processor;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.ParameterizedTypeName;
import com.palantir.javapoet.TypeName;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import org.realityforge.proton.AnnotationsUtil;
import org.realityforge.proton.GeneratorUtil;
import org.realityforge.proton.MemberChecks;
import org.realityforge.proton.ProcessorException;

final class ViewDescriptor {

    @Nonnull
    private final String _name;

    @Nonnull
    private final TypeElement _element;

    @Nonnull
    private final ViewType _type;

    private final boolean _exportBuilder;

    private final boolean _sting;

    private final boolean _hasConstructor;

    private final boolean _hasPostConstruct;

    private final boolean _shouldSetDefaultPriority;

    @Nonnull
    private final ExecutableElement _constructor;

    @Nullable
    private ExecutableElement _render;

    @Nullable
    private ExecutableElement _preUpdate;

    @Nullable
    private ExecutableElement _postRender;

    @Nullable
    private ExecutableElement _postUpdate;

    @Nullable
    private ExecutableElement _postMount;

    @Nullable
    private ExecutableElement _onError;

    /**
     * Methods that are inputs accessors.
     * These should be implemented as accesses to the underlying inputs value.
     */
    @Nullable
    private List<InputDescriptor> _inputs;

    /**
     * Methods that are inputs accessors.
     * These should be implemented as accesses to the underlying inputs value.
     */
    @Nullable
    private List<OnInputChangeDescriptor> _onInputChangeDescriptors;

    /**
     * Descriptors for methods annotated by @ScheduleRender.
     */
    @Nullable
    private List<ScheduleRenderDescriptor> _scheduleRenderDescriptors;

    /**
     * Descriptors for methods annotated by @Publish.
     */
    @Nullable
    private List<PublishDescriptor> _publishDescriptors;

    /**
     * Descriptors for methods annotated by @PreRender.
     */
    @Nullable
    private List<RenderHookDescriptor> _preRenderHooks;

    /**
     * Descriptors for methods annotated by @PostRender.
     */
    @Nullable
    private List<RenderHookDescriptor> _postRenderHooks;

    @Nullable
    private Boolean _validateInputs;

    @Nullable
    private Boolean _viewAccessesDeprecatedElements;

    @Nullable
    private Boolean _builderAccessesDeprecatedElements;

    @Nullable
    private List<PreludeChecksDescriptor> _preludeCheckCandidates;

    @Nullable
    private Boolean _hasDisposableInput;

    @Nullable
    private Boolean _hasNoValidateMethod;

    ViewDescriptor(@Nonnull final String name, @Nonnull final TypeElement element, @Nonnull final ExecutableElement constructor, @Nonnull final ViewType type, final boolean exportBuilder, final boolean sting, final boolean hasConstructor, final boolean hasPostConstruct, final boolean shouldSetDefaultPriority) {
        _name = Objects.requireNonNull(name);
        _element = Objects.requireNonNull(element);
        _constructor = Objects.requireNonNull(constructor);
        _type = Objects.requireNonNull(type);
        _exportBuilder = exportBuilder;
        _sting = sting;
        _hasConstructor = hasConstructor;
        _hasPostConstruct = hasPostConstruct;
        _shouldSetDefaultPriority = shouldSetDefaultPriority;
    }

    @Nonnull
    String keySuffix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ExecutableElement getConstructor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean enableSting() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean exportBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasConstructor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasPostConstruct() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean shouldSetDefaultPriority() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean requireRender() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    String getPackageName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    String getDisplayName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ClassName getClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    TypeElement getElement() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    DeclaredType getDeclaredType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ClassName getEnhancedClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ClassName getBuilderClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    String getBuilderSimpleName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ClassName getFactoryClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    private static String trimViewSuffix(@Nonnull final String name) {
        return name.endsWith("View") ? name.substring(0, name.length() - "View".length()) : name;
    }

    @Nonnull
    ClassName getArezClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    TypeName getViewType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean needsInjection() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean trackRender() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ViewType getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    int syntheticKeyParts() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasDisposableInput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasNoValidateMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<InputDescriptor> getImmutableInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<InputDescriptor> getConstructorInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<VariableElement> getInjectableConstructorParameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<InputDescriptor> getUpdateOnChangeInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<InputDescriptor> getObservableInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<InputDescriptor> getInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setInputs(@Nonnull final List<InputDescriptor> events) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<PreludeChecksDescriptor> getPreludeCheckCandidates() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setPreludeCheckCandidates(@Nonnull final List<PreludeChecksDescriptor> preludeCheckCandidates) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    InputDescriptor findInputNamed(@Nonnull final String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Needs to be invoked after all the inputs have been completely constructed.
     */
    void sortInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<OnInputChangeDescriptor> getPreUpdateOnInputChangeDescriptors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<OnInputChangeDescriptor> getPostUpdateOnInputChangeDescriptors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    private List<OnInputChangeDescriptor> getOnInputChangeDescriptors() {
        assert null != _onInputChangeDescriptors;
        return _onInputChangeDescriptors;
    }

    void setOnInputChangeDescriptors(@Nonnull List<OnInputChangeDescriptor> onInputChangeDescriptors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<ScheduleRenderDescriptor> getScheduleRenderDescriptors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setScheduleRenderDescriptors(@Nonnull final List<ScheduleRenderDescriptor> scheduleRenderDescriptors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<PublishDescriptor> getPublishDescriptors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setPublishDescriptors(@Nonnull final List<PublishDescriptor> publishDescriptors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<RenderHookDescriptor> getPreRenderDescriptors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setPreRenderDescriptors(@Nonnull final List<RenderHookDescriptor> preRenderDescriptors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<RenderHookDescriptor> getPostRenderDescriptors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setPostRenderDescriptors(@Nonnull final List<RenderHookDescriptor> postRenderDescriptors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasObservableInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    ExecutableElement getPreUpdate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setPreUpdate(@Nonnull final ExecutableElement preUpdate) throws ProcessorException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean shouldGenerateRender() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasRender() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    ExecutableElement getRender() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setRender(@Nonnull final ExecutableElement render) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    ExecutableElement getPostRender() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setPostRender(@Nonnull final ExecutableElement postRender) throws ProcessorException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    ExecutableElement getPostUpdate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setPostUpdate(@Nonnull final ExecutableElement postUpdate) throws ProcessorException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    ExecutableElement getPostMount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setPostMount(@Nonnull final ExecutableElement postMount) throws ProcessorException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    ExecutableElement getOnError() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setOnError(@Nonnull final ExecutableElement onError) throws ProcessorException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean shouldGenerateLifecycle() {
        return generateComponentDidMount() || generateShouldComponentUpdate() || generateComponentPreUpdate() || generateComponentDidUpdate() || generateComponentWillUnmount() || generateComponentDidCatch();
    }

    boolean shouldGenerateLiteLifecycle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateShouldComponentUpdate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateShouldComponentUpdateInLiteLifecycle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateComponentDidCatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateComponentWillUnmountInLiteLifecycle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateComponentWillUnmount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateComponentPreUpdate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateComponentDidMount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateComponentDidMountInLiteLifecycle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasPreUpdateOnInputChange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasPostUpdateOnInputChange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateComponentDidUpdate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean generateComponentDidUpdateInLiteLifecycle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean shouldValidateInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean viewAccessesDeprecatedElements() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean builderAccessesDeprecatedElements() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isDeprecated(@Nullable final Element element) {
        return null != element && null != element.getAnnotation(Deprecated.class);
    }

    @Nonnull
    private String shortSha(@Nonnull final String text) {
        try {
            final MessageDigest algo = MessageDigest.getInstance("SHA-1");
            final byte[] digest = algo.digest(text.getBytes());
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                final byte value = digest[i];
                sb.append(Integer.toString((value & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (final NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
