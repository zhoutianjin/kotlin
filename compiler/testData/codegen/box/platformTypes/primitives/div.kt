// IGNORE_BACKEND: JS_IR
fun box(): String {
    val l = ArrayList<Int>()
    l.add(2)
    val x = l[0] / 2
    if (x != 1) return "Fail: $x}"
    return "OK"
}