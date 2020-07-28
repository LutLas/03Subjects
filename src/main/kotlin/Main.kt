import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject

fun main(args: Array<String>) {

    exampleOf("PublishSubject") {
        val disposables = CompositeDisposable()
        val publishSubject = PublishSubject.create<Int>()
        publishSubject.onNext(0)
        val subscriptionOne = publishSubject
                .doOnDispose { println("Disposed") }
                .doOnSubscribe { println("Subscribed: $it") }
                .subscribe { int ->
            println(int)
        }
        publishSubject.onNext(1)
        publishSubject.onNext(2)
        disposables.add(subscriptionOne)
        disposables.dispose()
    }

}