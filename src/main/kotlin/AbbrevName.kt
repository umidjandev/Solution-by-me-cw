class AbbrevName {
    fun abbrevName(name:String): String {
        var array = name.uppercase().split(" ")
        return array[0].get(0)+ "." + array[1].get(0)
    }
    /**
     * fun abbrevName(name:String) = name.split(" ").map { it.first().toUpperCase() }.joinToString(".")
     * fun abbrevName(name: String): String {
    val v = name.indexOf(" ")
    return "${name[0]}.${name[v + 1]}".toUpperCase()
    }
     *fun abbrevName(name: String) = name.split(" ").joinToString(".") { it.take(1).uppercase() }
     */
}