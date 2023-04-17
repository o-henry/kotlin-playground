package kotlinessentials

class A {
    fun printMe() {
        println(this) // this is reference to the instance of the class we called this function on.
    }
}

class User(val id: Int, val name: String)

class Puppy(val name: String) {
    inner class InnerPuppy {
        fun think() {
            println("Inner $name is thinking")
        }
    }
}

interface UserRepository {
    fun findUser(id: Int): User?
    fun addUser(user: User)
}

class FakeUserRepository : UserRepository {
    private var users = mapOf<Int, User>()

    override fun addUser(user: User) {
        users = users.plus(user.id to user)
    }

    override fun findUser(id: Int): User? {
        TODO("Not yet implemented")
    }
}


fun main() {
    val a: A = A()
    println(a) // A@ADDRESS
    a.printMe() // A@ADDRESS (the same address)


    /** user */
    val user = User()
    user.name = "norbert"
    println(user.name) // NOBERT

    /** puppyt */
    val puppy = Puppy("Cookie")
    val innerPuppy = puppy.InnerPuppy()
    innerPuppy.think()
}
