package react4j.processor;

import java.util.Comparator;
import javax.annotation.Nonnull;

/**
 * Sort inputs.
 * Non-optional inputs come first, then optional inputs and finally the child or children input.
 * Within each group, constructor parameter inputs precede method inputs.
 */
final class InputComparator implements Comparator<InputDescriptor> {

    static final InputComparator COMPARATOR = new InputComparator();

    private InputComparator() {
    }

    @Override
    public int compare(@Nonnull final InputDescriptor o1, @Nonnull final InputDescriptor o2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
