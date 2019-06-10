package com.dongmyo.test.jpa.repository

import com.dongmyo.test.jpa.entity.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Int> {
}
