package com.dongmyo.test.jpa.repository

import com.dongmyo.test.jpa.entity.Role
import com.dongmyo.test.jpa.entity.User
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

class UserRepositoryImpl : UserRepositoryCustom {
    @PersistenceContext
    private lateinit var em: EntityManager

    override fun getByRoles(name: String, roles: Set<Role>): User? {
        val sql = """
      SELECT u
      FROM User u
      WHERE u.name = '$name'
      """

        return em.createQuery(sql).singleResult as User?
    }
}
