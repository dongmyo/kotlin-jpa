package com.dongmyo.test.jpa.repository

import com.dongmyo.test.jpa.entity.Role
import com.dongmyo.test.jpa.entity.User
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.lang.Nullable

@NoRepositoryBean
interface UserRepositoryCustom {
    @Nullable
    fun getByRoles(name: String, roles: Set<Role>): User?

}
