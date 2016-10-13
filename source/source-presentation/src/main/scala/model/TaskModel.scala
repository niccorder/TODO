package model

trait BaseTaskModel {
  def id: String
  def task: String
  def parentId: String
  def creationTimestamp: Long
}

case class TaskModel
(
  id: String,
  task: String,
  parentId: String,
  creationTimestamp: Long
) extends BaseTaskModel

case class CompletedTaskModel
(
  id: String,
  task: String,
  parentId: String,
  creationTimestamp: Long,
  completionTimestamp: Long
) extends BaseTaskModel
