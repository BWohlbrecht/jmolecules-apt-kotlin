package eu.wohlbrecht.jmolecules.apt.kotlin.auth

import org.jmolecules.ddd.annotation.Entity

@Entity
class UserAccount (
	// Missing @Identity should raise compile error
	val emailAddress: EmailAddress
)
