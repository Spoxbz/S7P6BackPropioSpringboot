package com.S7P6.backendpropio.repository

import com.S7P6.backendpropio.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {


}