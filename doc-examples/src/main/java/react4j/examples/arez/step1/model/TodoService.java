package react4j.examples.arez.step1.model;

import arez.annotations.Action;
import arez.annotations.ArezComponent;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;

@ArezComponent
public abstract class TodoService {

    @Nonnull
    private final TodoRepository _repository;

    TodoService(@Nonnull final TodoRepository repository) {
        _repository = Objects.requireNonNull(repository);
    }

    @Action
    public void save(final Todo todo, final String newTitle) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Action
    public void clearCompleted() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
