package com.scala.rimidalv

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.{LinearLayout, Button, TextView}
import scalaz.Scalaz._

// import macroid stuff
import macroid._
import macroid.FullDsl._

// include implicit contexts
class HelloActivity extends Activity with Contexts[Activity] {
  override def onCreate(savedInstanceState: Bundle) = {
    super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_hello)
      val hello = findViewById(R.id.hello).asInstanceOf[TextView]
      hello <~ text("херня")
    // the layout goes here
//    setContentView {
//      getUi {
//        l[LinearLayout](
//          w[Button] <~ text("Click me"),
//          w[TextView] <~ text("Hello")
//        )
//      }
//    }
  }
}