package react4j.examples.arez.step2.model;

import arez.annotations.ArezComponent;
import arez.annotations.Observable;
import java.util.Objects;
import javax.annotation.Nonnull;

@ArezComponent
public abstract class ViewService {

    @Nonnull
    private FilterMode _filterMode = FilterMode.ALL;

    ViewService() {
    }

    @Observable
    @Nonnull
    public FilterMode getFilterMode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFilterMode(@Nonnull final FilterMode filterMode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
