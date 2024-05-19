package com.S7P6.backendpropio.service

import com.S7P6.backendpropio.model.User
import com.S7P6.backendpropio.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun list(): List<User> {
        return userRepository.findAll()
    }

    fun save(user: User): User {
        return userRepository.save(user)
    }

    fun update(user: User): User {
        return userRepository.save(user)
    }

    fun delete(id: Long) {
        userRepository.deleteById(id)
    }

    fun getById(id: Long): User? {
        return userRepository.findById(id).orElse(null)
    }
}