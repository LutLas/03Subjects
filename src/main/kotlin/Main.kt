import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.PublishSubject

fun main(args: Array<String>) {

    /*exampleOf("PublishSubject") {
        val disposables = CompositeDisposable()
        val publishSubject = PublishSubject.create<Int>()
        publishSubject.onNext(0)
        val subscriptionOne = publishSubject
                .doOnDispose { println("Disposed One") }
                .doOnComplete { println("Completed One") }
                .doOnSubscribe { println("Subscribed One: $it") }
                .subscribe { numbness ->
            println(numbness)
        }
        publishSubject.onNext(1)
        publishSubject.onNext(2)

        val subscriptionTwo = publishSubject
                .doOnDispose { println("Disposed Two") }
                .doOnComplete { println("Completed Two") }
                .doOnSubscribe { println("Subscribed Two: $it") }
                .subscribe { int ->
                    printWithLabel("2)", int)
                }
        publishSubject.onNext(3)

        disposables.add(subscriptionOne)
        disposables.dispose()
        publishSubject.onNext(4)

        // 1
        publishSubject.onComplete()

// 2
        publishSubject.onNext(5)

// 3


// 4
        val subscriptionThree = publishSubject.subscribeBy(
                onNext = { printWithLabel("3)", it) },
                onComplete = { printWithLabel("3)", "Complete") }
        )

        publishSubject.onNext(6)


        disposables.add(subscriptionThree)
        disposables.add(subscriptionTwo)
        disposables.dispose()
    }*/

    // 1
    /*exampleOf("BehaviorSubject") {
        // 2
        val subscriptions = CompositeDisposable()
        // 3
        val behaviorSubject = BehaviorSubject.createDefault("Initial value")
        behaviorSubject.onNext("X")
        val subscriptionOne = behaviorSubject
                .doOnDispose { println("DisposedOne") }
                .doOnComplete { println("CompletedOne") }
                .doOnError { println("ErrorOne Occurred: $it") }
                .doOnSubscribe { println("SubscribedOne: $it") }
                .subscribeBy(
                onNext = { printWithLabel("1)", it) },
                onError = { printWithLabel("1)", it) }
        )
        // 1
        behaviorSubject.onError(RuntimeException("Error!"))
// 2
        subscriptions.add(
                behaviorSubject.subscribeBy(
                onNext = { printWithLabel("2)", it) },
                onError = { printWithLabel("2)", it) }
                )
        )
        subscriptions.add(subscriptionOne)
        subscriptions.dispose()
    }*/

    /*exampleOf("BehaviorSubject State") {

        val subscriptions = CompositeDisposable()

        val behaviorSubject = BehaviorSubject.createDefault(0)

        println(behaviorSubject.value)

        // 1
        subscriptions.add(behaviorSubject.subscribeBy {
            printWithLabel("1)", it)
        })

// 2
        behaviorSubject.onNext(1)
// 3
        println(behaviorSubject.value)
// 4
        subscriptions.dispose()
    }*/

    
}