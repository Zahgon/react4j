package react4j.examples.arez.step1;

import javax.annotation.Nonnull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.proptypes.html.AnchorProps;
import react4j.dom.proptypes.html.BtnProps;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.examples.arez.step1.model.AppData;
import react4j.examples.arez.step1.model.FilterMode;
import static react4j.dom.DOM.*;

@View(type = View.Type.TRACKING)
abstract class Footer {

    @Render
    @Nonnull
    ReactNode render() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
