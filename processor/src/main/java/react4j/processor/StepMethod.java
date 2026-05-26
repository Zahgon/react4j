package react4j.processor;

import com.palantir.javapoet.TypeName;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.type.TypeMirror;

/**
 * Represents a step in the builder. There are a few "intrinsic" methods that are handled by generator
 * but the rest are driven by Input annotation details. The intrinsics are as follows:
 *
 * <ul>
 * <li>name = build: no parameters returns ReactNode and terminates build. This has custom code in implementation.</li>
 * <li>name = child, key = child: This is for single child views and the implementation caches child and returns build().</li>
 * <li>name = children: This is for multi child views and the implementation creates JsArray if null and adds all supplied non-null children to array before invoking build().</li>
 * <li>name = child, key = children: This is for multi child views built one child at a time. The implementation returns if null passed to it, initializes JsArray if null, adds child to array.</li>
 * </ul>
 */
final class StepMethod {

    /**
     * The name of the input and the corresponding builder method.
     */
    @Nonnull
    private final String _name;

    /**
     * The key under which the input is added into inputs.
     */
    @Nonnull
    private final String _key;

    /**
     * The expected type of the input.
     */
    @Nonnull
    private final TypeName _type;

    @Nullable
    private final InputDescriptor _input;

    /**
     * After this method is called should the builder STAY on the same step, ADVANCE to the next step or TERMINATE builder and call build().
     */
    @Nonnull
    private final StepMethodType _stepMethodType;

    StepMethod(@Nonnull final InputDescriptor input, @Nonnull final StepMethodType stepMethodType) {
        this(input.getName(), input.getName(), TypeName.get(input.getType()), input, stepMethodType);
    }

    StepMethod(@Nonnull final String name, @Nonnull final String key, @Nonnull final TypeName type, @Nullable final InputDescriptor input, @Nonnull final StepMethodType stepMethodType) {
        _name = Objects.requireNonNull(name);
        _key = Objects.requireNonNull(key);
        _type = Objects.requireNonNull(type);
        _input = input;
        _stepMethodType = Objects.requireNonNull(stepMethodType);
    }

    @Nonnull
    String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    TypeName getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    InputDescriptor getInput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    Element getElement() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    TypeMirror getTypeMirror() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    ExecutableElement getMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    StepMethodType getStepMethodType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isBuildIntrinsic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isChildIntrinsic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isChildrenIntrinsic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isChildrenStreamIntrinsic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
