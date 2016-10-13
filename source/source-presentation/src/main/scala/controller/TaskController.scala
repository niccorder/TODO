package controller

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

/**
  * A Finatra Controller that maps task specific endpoints to appropriate UseCase's
  */
class TaskController extends Controller {

  get("/task/:taskId") { request: Request =>
    //TODO(niccorder) parse presentation model into a domain model
    request
  }

  post("/task/:taskId") { request: Request =>
    //TODO(niccorder) parse presentation model into a domain model
    request
  }

  put("/task/:taskId") { request: Request =>
    //TODO(niccorder) parse presentation model into a domain model
    request
  }

  delete("/task/:taskId") { request: Request =>
    //TODO(niccorder) parse presentation model into a domain model
    request
  }
}
