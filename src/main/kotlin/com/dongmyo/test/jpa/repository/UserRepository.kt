package com.dongmyo.test.jpa.repository

import com.dongmyo.test.jpa.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>, UserRepositoryCustom
