package com.example.springServers

import javax.persistence.Entity
import javax.persistence.Id
@Entity
data class Student (
    @Id
    var name:String,
    var course:String,
    var score:Int



        ){

    constructor():this("","",-1)


}