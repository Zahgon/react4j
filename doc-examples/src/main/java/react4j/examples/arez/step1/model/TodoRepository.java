package react4j.examples.arez.step1.model;

import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.Feature;
import arez.annotations.Memoize;
import arez.component.internal.AbstractRepository;
import javax.annotation.Nonnull;

@ArezComponent(service = Feature.ENABLE)
public abstract class TodoRepository extends AbstractRepository<Integer, Todo, TodoRepository> {

    @Action
    @Nonnull
    Todo create(@Nonnull final String title, final boolean completed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Memoize
    public boolean isNotEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Memoize
    public int totalCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Memoize
    int activeCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Memoize
    public int completedCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Action(reportParameters = false)
    public void destroy(@Nonnull final Todo entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
