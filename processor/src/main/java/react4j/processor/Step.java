package react4j.processor;

import com.palantir.javapoet.TypeName;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;

final class Step {

    private final int _index;

    @Nonnull
    private final List<StepMethod> _methods = new ArrayList<>();

    Step(final int index) {
        _index = index;
    }

    int getIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void addMethod(@Nonnull final InputDescriptor input, @Nonnull final StepMethodType stepMethodType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void addTerminalMethod(@Nonnull final String name, @Nonnull final String key, @Nonnull final TypeName type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<StepMethod> getMethods() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
