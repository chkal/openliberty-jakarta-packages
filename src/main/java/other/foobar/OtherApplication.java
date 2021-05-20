package other.foobar;

import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("other")
public class OtherApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    return Set.of( OtherResource.class );
  }

}
