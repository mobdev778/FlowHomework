package otus.homework.flowcats

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach

fun <T> Flow<Result<T>>.onSuccess(consumer: (T) -> Unit): Flow<Result<T>> = onEach {
    if (it is Result.Success) { consumer(it.data) }
}

fun <T> Flow<Result<T>>.onFailure(consumer: (Throwable) -> Unit): Flow<Result<T>> = onEach {
    if (it is Result.Failure) { consumer(it.exception) }
}
