package react4j.examples.arez.best_practice.step2;

import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.Observable;

@ArezComponent
public abstract class EmployeeService {

    private boolean _loading;

    private String _employeeData;

    private String _errorMessage;

    private boolean _loadEmployeeData;

    @Observable(name = "loadEmployeeData")
    public boolean shouldLoadEmployeeData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLoadEmployeeData(final boolean loadEmployeeData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Action
    public void changeToEmployeeView() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //EXAMPLE ENDS HERE
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
