package eu.wohlbrecht.jmolecules.apt.kotlin.auth

import org.jmolecules.ddd.annotation.ValueObject

@ValueObject
data class EmailAddress(val value: String)
