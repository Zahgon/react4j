package react4j.examples.arez.best_practice.step2;

import arez.annotations.ArezComponent;
import arez.annotations.ComponentDependency;
import arez.annotations.Observe;

@ArezComponent
public abstract class EmployeeDataLoader {

    private final RemoteServiceAPI _remote;

    @ComponentDependency
    final EmployeeService _service;

    EmployeeDataLoader(final RemoteServiceAPI remote, final EmployeeService service) {
        _remote = remote;
        _service = service;
    }

    @Observe
    void loadEmployeeDataIfRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
