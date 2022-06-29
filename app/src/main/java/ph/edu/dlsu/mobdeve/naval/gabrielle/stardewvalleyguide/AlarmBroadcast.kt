package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class AlarmBroadcast : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val goToTimerActivity = Intent(context, TimerActivity::class.java)
        intent!!.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        val pendingIntent = PendingIntent.getActivity(context,0, goToTimerActivity, 0)

        val notification = NotificationCompat.Builder(context!!,"Chanel")
            .setSmallIcon(R.drawable.player)
            .setContentTitle("Harvest your crops!")
            .setAutoCancel(false)
            .setDefaults(NotificationCompat.DEFAULT_ALL)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)

        val notificationManager = NotificationManagerCompat.from(context)
        notificationManager.notify(100, notification.build()) //show notif
    }
}