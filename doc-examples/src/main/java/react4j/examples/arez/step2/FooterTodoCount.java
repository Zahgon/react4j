package react4j.examples.arez.step2;

import javax.annotation.Nonnull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.proptypes.html.HtmlProps;
import react4j.examples.arez.step2.model.AppData;
import static react4j.dom.DOM.*;

@View(type = View.Type.TRACKING)
abstract class FooterTodoCount {

    @Render
    @Nonnull
    ReactNode render() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
