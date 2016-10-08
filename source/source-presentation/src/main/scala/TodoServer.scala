import com.twitter.finagle.Thrift
import com.twitter.server.TwitterServer

object TodoServer extends TwitterServer {
  /* Do not allow the serv*/
  private TodoServer() {}
}
