package example2;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloHandler2 implements RequestHandler<HelloRequest, HelloResponse> {
  @Override
  public HelloResponse handleRequest(HelloRequest helloRequest, Context context) {
    return new HelloResponse("hello from handler2 "+helloRequest.getCountry());
  }
}
