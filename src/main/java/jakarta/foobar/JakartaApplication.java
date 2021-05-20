package jakarta.foobar;

import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("jakarta")
public class JakartaApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    return Set.of( JakartaResource.class );
  }

}
