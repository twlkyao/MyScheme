The app module contains Activity and BroadcastReceiver,

the outerscheme module fire events to the Activity and BroadcastReceiver.

***Attention***

1. Only with the `<category android:name="android.intent.category.DEFAULT"/>` the `Activity` can receive implicit `Intent`. `Intent` has no need to call `Intent.addFlag("android.intent.category.DEFAULT")`, because the methods `startActivity()` and `startActivityForResult()`, treat all intents as if they declared the `CATEGORY_DEFAULT` category.
2. The `Service` `Intent` must be explicit.
3. As for `Broadcast`, if `Intent.addFlag("android.intent.category.DEFAULT")` being called, then `<category android:name="android.intent.category.DEFAULT"/>` must be added, otherwise, if `Intent.addFlag("android.intent.category.DEFAULT")` not being called, then with or with not `<category android:name="android.intent.category.DEFAULT"/>`, makes no difference.


***注意：***

1. 针对`Activity`只有在Intent-Filter中加入了`<category android:name="android.intent.category.DEFAULT"/>`，该`Activity`才可以接收隐式`Intent`.`startActivity()`和`startActivityForResult()`方法对传入的intent，默认他们都声明了`CATEGORY_DEFAULT`。
2. `Service`只能接收显示`Intent`.
3. 对于`BroadcastReceiver`，如果调用了`Intent.addFlag("android.intent.category.DEFAULT")`，则在`Intent-Filter`中必须加上`<category android:name="android.intent.category.DEFAULT"/>`，如果`Intent`没有调用`Intent.addFlag("android.intent.category.DEFAULT")`加入DEFAULT的category，则`Intent-Filter`中有没有`<category android:name="android.intent.category.DEFAULT"/>`，没有区别。
