package react4j.examples.arez.best_practice.step1;

import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.Observable;

@ArezComponent
public abstract class EmployeeService {

    private final RemoteServiceAPI _remote;

    private boolean _loading;

    private String _employeeData;

    private String _errorMessage;

    EmployeeService(final RemoteServiceAPI remote) {
        _remote = remote;
    }

    @Action
    public void changeToEmployeeView() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Observable
    public boolean isLoading() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLoading(final boolean loading) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Observable
    public String getEmployeeData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEmployeeData(final String employeeData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Observable
    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setErrorMessage(final String errorMessage) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
