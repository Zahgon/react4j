package react4j.examples.arez.step2;

import arez.annotations.Memoize;
import javax.annotation.Nullable;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.proptypes.html.AnchorProps;
import react4j.dom.proptypes.html.BtnProps;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.examples.arez.step2.model.AppData;
import react4j.examples.arez.step2.model.FilterMode;
import static react4j.dom.DOM.*;

@View(type = View.Type.TRACKING)
abstract class Footer {

    @Nullable
    @Render
    ReactNode render() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Memoize
    boolean hasCompletedItems() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
