import javafx.stage.Stage
import javafx.stage.Screen
import tornadofx.*
import view.MainView
import view.Styles

class Program : App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        super.start(stage)
        stage.width = 1000.0
        stage.height = 640.0
        val screenPrimary = Screen.getPrimary()
        stage.x = screenPrimary.visualBounds.width - screenPrimary.visualBounds.width / 2 - stage.width / 2
        stage.y = screenPrimary.visualBounds.height - screenPrimary.visualBounds.height / 2 - stage.height / 2
    }
}

fun main(args: Array<String>) {
    launch<Program>(args)
}