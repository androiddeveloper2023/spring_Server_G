package com.example.springServers

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository:CrudRepository<Student,String> {
}