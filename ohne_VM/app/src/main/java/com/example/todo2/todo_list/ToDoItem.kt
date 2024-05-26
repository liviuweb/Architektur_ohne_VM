package com.example.todo2.todo_list

data class ToDoItem (
    val id:Int,
    val title:String,
    val isCompleted:Boolean = false
)