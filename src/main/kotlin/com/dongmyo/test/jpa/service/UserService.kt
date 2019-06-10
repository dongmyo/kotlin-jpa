package com.dongmyo.test.jpa.service

import com.dongmyo.test.jpa.entity.Role
import com.dongmyo.test.jpa.entity.User
import com.dongmyo.test.jpa.repository.RoleRepository
import com.dongmyo.test.jpa.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*
import kotlin.collections.HashSet

@Service
class UserService(val userRepository: UserRepository,
                  val roleRepository: RoleRepository) {
    @Transactional
    fun setUp() {
        val role1 = Role()
        role1.name = "role1"

        val role2 = Role()
        role2.name = "role2"

        roleRepository.saveAll(Arrays.asList(role1, role2))

        val user = User()
        user.name = "user1"

        user.roles.add(role1)
        user.roles.add(role2)

        userRepository.save(user)
    }

    @Transactional(readOnly = true)
    fun getName() {
        userRepository.getByRoles("user1", HashSet())
    }
}
