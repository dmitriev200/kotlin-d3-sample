import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("reactSample")
    render(rootDiv) {
        morphingShape()
    }
    d3sample()
//    sampleDataBinding()
}


