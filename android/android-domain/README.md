# Android Domain Layer
This will host all the business logic for the application. We have a few constraints in this layer.
  - Do not disrupt the inward dependency flow.
  - Do not be forced into a framework. Be open, and ready to change.
  - Any communication with this layer must be through an Interactor and passed with a model to this layer.
  
Although these constraints may add some bloat for how small of a project this is, we will show why they have been put in place by writing our data layer to be able to be "hot-swapped" from one framework to the next, and we will have 0 lines refactored here to make that happen.