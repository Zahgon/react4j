package react4j.examples.arez;

import akasha.HashChangeEvent;
import akasha.HashChangeEventListener;
import akasha.Location;
import akasha.WindowGlobal;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.Observable;
import arez.annotations.PostConstruct;
import arez.annotations.PreDispose;
import java.util.Objects;
import javax.annotation.Nonnull;

/**
 * This is a simple abstraction over browser location as a hash.
 * The model exposes the observable values for the location as the application sees it via
 * {@link #getLocation()}, the way the browser sees it via {@link #getBrowserLocation()}.
 * The application code should define an autorun that monitors the location as the browser
 * sees it and update the location as the application sees it via {@link #changeLocation(String)}
 * if the browser location is valid. Otherwise the browser location should be reset to the application
 * location.
 *
 * <p>It should be noted that this class is not a router but a primitive that can be used to
 * implement a router. Observing the application location will allow the application to update
 * the view. Observing the browser location will allow the application to decide whether the
 * route should be updated.</p>
 */
@ArezComponent
public abstract class BrowserLocation {

    @Nonnull
    private final HashChangeEventListener _listener = this::onHashChangeEvent;

    /**
     * The location according to the application.
     */
    @Nonnull
    private String _location = "";

    /**
     * The location according to the browser.
     */
    @Nonnull
    private String _browserLocation = "";

    /**
     * The location that the application is attempting to update the browser to.
     */
    @Nonnull
    private String _targetLocation = "";

    /**
     * Should we prevent the default action associated with hash change?
     */
    private boolean _preventDefault = true;

    /**
     * Create the model object.
     *
     * @return the BrowserLocation instance.
     */
    public static BrowserLocation create() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    BrowserLocation() {
    }

    @PostConstruct
    void postConstruct() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @PreDispose
    void preDispose() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return true if component will prevent default actions when hash.
     *
     * @return true if component will prevent default actions when hash.
     */
    public boolean shouldPreventDefault() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set a flag to determine whether events default action will be prevented.
     *
     * @param preventDefault true to prevent default action.
     */
    public void setPreventDefault(final boolean preventDefault) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Change the target location to the specified parameter.
     * This will ultimately result in a side-effect that updates the browsers location.
     * This location parameter should not include "#" as the first character.
     *
     * @param targetLocation the location to change to.
     */
    @Action
    public void changeLocation(@Nonnull final String targetLocation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Revert the browsers location to the application location.
     */
    @Action
    public void resetBrowserLocation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the location as the application sees it.
     * This return value does not include a "#" as the first character.
     *
     * @return the location.
     */
    @Observable
    @Nonnull
    public String getLocation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Observable
    void setLocation(@Nonnull final String location) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Observable
    @Nonnull
    public String getBrowserLocation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setBrowserLocation(@Nonnull final String browserLocation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Action
    void updateBrowserLocation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void onHashChangeEvent(@Nonnull final HashChangeEvent e) {
        if (_preventDefault) {
            e.preventDefault();
        }
        updateBrowserLocation();
    }

    @Nonnull
    private String getHash() {
        return WindowGlobal.location().hash.substring(1);
    }

    private void setHash(@Nonnull final String hash) {
        final Location location = WindowGlobal.location();
        if (0 == hash.length()) {
            /*
       * This code is needed to remove the stray #.
       * See https://stackoverflow.com/questions/1397329/how-to-remove-the-hash-from-window-location-url-with-javascript-without-page-r/5298684#5298684
       */
            WindowGlobal.history().pushState("", WindowGlobal.document().title, location.pathname + location.search);
        } else {
            location.hash = hash;
        }
    }
}
