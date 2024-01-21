package otus.homework.flowcats

sealed class Result<out T> {
    class Success<T>(val data: T) : Result<T>()
    class Failure(val exception: Throwable) : Result<Nothing>()
}
