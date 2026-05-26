package react4j.examples.arez.step2.model;

import arez.annotations.ArezComponent;
import arez.annotations.ComponentIdRef;
import arez.annotations.Observable;
import java.util.Objects;
import javax.annotation.Nonnull;

@ArezComponent
public abstract class Todo {

    @Nonnull
    private String _title;

    private boolean _completed;

    Todo(@Nonnull final String title, final boolean completed) {
        _title = Objects.requireNonNull(title);
        _completed = completed;
    }

    @ComponentIdRef
    public abstract int getId();

    @Observable
    @Nonnull
    public String getTitle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTitle(@Nonnull final String title) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Observable
    public boolean isCompleted() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCompleted(final boolean completed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
