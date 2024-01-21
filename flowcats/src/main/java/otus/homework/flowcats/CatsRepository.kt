package otus.homework.flowcats

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import java.lang.RuntimeException

class CatsRepository(
    private val catsService: CatsService,
    private val refreshIntervalMs: Long = 5000
) {

    var counter = 0

    fun listenForCatFacts() = flow {
        while (true) {
            val latestNews = catsService.getCatFact()

            counter++
            if (counter % 2 == 0) { throw RuntimeException("Ha-ha") }

            emit(latestNews)
            delay(refreshIntervalMs)
        }
    }
}
