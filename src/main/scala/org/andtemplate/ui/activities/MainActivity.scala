package org.andtemplate.ui.activities

import android.app.Activity
import android.os.Bundle
import org.andtemplate.R

/**
 *
 * @author mle
 */
class MainActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
}
