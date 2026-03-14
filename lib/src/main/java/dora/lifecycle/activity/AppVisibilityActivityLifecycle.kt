package dora.lifecycle.activity

import android.app.Activity
import android.app.Application
import android.os.Bundle
import dora.lifecycle.state.AppVisibility

class AppVisibilityActivityLifecycle : Application.ActivityLifecycleCallbacks {

    private var activityCount = 0

    override fun onActivityCreated(
        activity: Activity,
        savedInstanceState: Bundle?
    ) {
    }

    override fun onActivityDestroyed(activity: Activity) {
    }

    override fun onActivityPaused(activity: Activity) {
    }

    override fun onActivityResumed(activity: Activity) {
    }

    override fun onActivitySaveInstanceState(
        activity: Activity,
        outState: Bundle
    ) {
    }

    override fun onActivityStarted(activity: Activity) {
        if (activityCount == 0) {
            AppVisibility.isForeground = true
        }
        activityCount++
    }

    override fun onActivityStopped(activity: Activity) {
        activityCount--
        if (activityCount == 0) {
            AppVisibility.isForeground = false
        }
    }
}