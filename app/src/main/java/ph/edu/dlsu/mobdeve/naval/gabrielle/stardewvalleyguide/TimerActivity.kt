package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.app.*
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityTimerBinding

class TimerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTimerBinding
    private lateinit var picker : MaterialTimePicker
    private lateinit var alarmManager : AlarmManager
    private lateinit var calendar: Calendar
    private lateinit var pendingIntent : PendingIntent

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createNotificationChannel() //creates the notification channel

        binding.setTimerBtn.setOnClickListener {
            openTimePicker()
        }

        binding.cancelTimerBtn.setOnClickListener {
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager

            val intent = Intent(this, AlarmBroadcast::class.java)

            pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

            alarmManager.cancel(pendingIntent)

            Toast.makeText(this, "Alarm is cancelled!", Toast.LENGTH_SHORT).show()
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun openTimePicker() {
        val clockFormat = TimeFormat.CLOCK_12H

        picker = MaterialTimePicker.Builder()
            .setTimeFormat(clockFormat)
            .setHour(12)
            .setMinute(0)
            .setTitleText("Set Alarm")
            .build()

        picker.show(supportFragmentManager, "Chanel")

        //ok btn
        picker.addOnPositiveButtonClickListener {
            val hour = picker.hour
            val min = picker.minute

            calendar = Calendar.getInstance()
            calendar[Calendar.HOUR_OF_DAY] = hour
            calendar[Calendar.MINUTE] = min
            calendar[Calendar.SECOND] = 0
            calendar[Calendar.MILLISECOND] = 0

            Log.d("tag", "Positive listener")

            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager

            val intent = Intent(this, AlarmBroadcast::class.java)

            pendingIntent = PendingIntent.getBroadcast(applicationContext, 0, intent, 0)

            alarmManager.set(
                AlarmManager.RTC_WAKEUP, //will wake up phone
                calendar.timeInMillis,   //will trigger at the time picked
                pendingIntent
            )

            Toast.makeText(this, "Alarm set for $hour : $min!", Toast.LENGTH_SHORT).show()
        }

        // triggered when clicked out of time picker
        picker.addOnCancelListener {
            Log.d("tag", "Cancel listener")
            Toast.makeText(this, "Alarm dismissed!", Toast.LENGTH_SHORT).show()
        }

        // cancel btn
        picker.addOnNegativeButtonClickListener {
            Log.d("tag", "Negative listener")

            Toast.makeText(this, "Alarm cancelled!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val name: CharSequence = "Chanel"
            val description = "Channel For Alarm Manager"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(
                "Chanel",
                name,
                importance
            )
            channel.description = description
            val notificationManager = getSystemService(
                NotificationManager::class.java
            )
            notificationManager.createNotificationChannel(channel)
        }
    }
}