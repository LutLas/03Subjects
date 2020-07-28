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
                .subscribe { numbness ->
            println(numbness)
        }
        publishSubject.onNext(1)
        publishSubject.onNext(2)

        val subscriptionTwo = publishSubject
                .doOnDispose { println("Disposed Two") }
                .doOnSubscribe { println("Subscribed: $it") }
                .subscribe { int ->
                    printWithLabel("2)", int)
                }
        publishSubject.onNext(3)

        disposables.add(subscriptionOne)
        disposables.dispose()
        publishSubject.onNext(4)
        disposables.add(subscriptionTwo)
        disposables.dispose()
    }

}