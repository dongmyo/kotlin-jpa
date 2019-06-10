package com.dongmyo.test.jpa.entity

import javax.persistence.*

@Entity
@Table(name = "Users")
data class User(@Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                @Column(name = "user_id")
                val id: Int? = null) {

    @Column
    var name: String = ""

    @ElementCollection
    @CollectionTable(
            name="UserRoles",
            joinColumns=[JoinColumn(name="user_id")],
            uniqueConstraints = [UniqueConstraint(columnNames = ["user_id", "roles_role_id"])])
    var roles: MutableSet<Role> = HashSet()


    constructor() : this(null)

}
