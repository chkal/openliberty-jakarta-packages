package other.foobar;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("test")
public class OtherResource {

  @GET
  @Produces("text/plain")
  public String getResponse() {
    return String.format( "Resource %s works fine!", this.getClass().getName() );
  }

}
