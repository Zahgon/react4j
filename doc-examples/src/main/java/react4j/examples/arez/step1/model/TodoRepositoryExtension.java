package react4j.examples.arez.step1.model;

import arez.annotations.ArezComponentLike;
import arez.annotations.Memoize;

@ArezComponentLike
public interface TodoRepositoryExtension {

    @Memoize
    default int totalCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Memoize
    default int activeCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Memoize
    default int completedCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    TodoRepository self();
}
