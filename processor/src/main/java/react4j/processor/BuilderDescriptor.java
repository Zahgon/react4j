package react4j.processor;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;

final class BuilderDescriptor {

    @Nonnull
    private final List<Step> _steps = new ArrayList<>();

    BuilderDescriptor() {
    }

    @Nonnull
    Step addStep() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nonnull
    List<Step> getSteps() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
