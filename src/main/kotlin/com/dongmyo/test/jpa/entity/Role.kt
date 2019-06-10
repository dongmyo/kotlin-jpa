package com.dongmyo.test.jpa.entity

import javax.persistence.*

@Entity
@Table(name = "Roles")
data class Role(@Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                @Column(name = "role_id")
                val id: Int? = null) {
    @Column
    var name: String = ""

    constructor() : this(null)

}
