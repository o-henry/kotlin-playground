package atomickotlin.`20-scopefunction`

// https://typealias.com/start/kotlin-scopes-and-scope-functions/
class Address(var street1: String = "", var street2: String = "", var city: String = "")

fun main() {
    var address = Address()

    // normal way to update an address object
    address.street1 = "9801 Maple Ave"
    address.street2 = "Apartment 255"
    address.city = "Rocksteady"

    // TODO: === with() ===
    // the with() scope function introduces a new scope (the lambda) in which the context object is represented as an implicit receive
    with(address) { // <1> implicit receiver and new scope
        street1 = "9801 Maple Ave" // without prefixing the name of variable
        street2 = "Apartment 255"
        city = "Rocksteady"
    }


    // TODO: === run() ===
    address.run {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 255"
        city = "Rocksteady"
    }


    fun String.singleQuoted() = "'$this'"

    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .singleQuoted()
        .uppercase()

    // 'ROBOTS FROM PLANET X3'
    val _newTitle = title
        .removePrefix("The ")
        .run { "'$this'" }
        .uppercase()

    // 'ROBOTS FROM PLANET X3'

    // TODO: === let() ===

}