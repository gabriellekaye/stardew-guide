package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.app.*
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.google.android.material.timepicker.TimeFormat.CLOCK_12H
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
//            val currTime = Calendar.getInstance()
//            val startHour = currTime.get(Calendar.HOUR_OF_DAY)
//            val startMin = currTime.get(Calendar.MINUTE)
////            var picker = TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, min ->
////                binding.currTime.setText("$hourOfDay:$min")}, startHour, startMin, false).show()
//
//            picker = MaterialTimePicker.Builder()
//                .setTimeFormat(CLOCK_12H)
//                .setHour(startHour)
//                .setMinute(startMin)
//                .setTitleText("Set Alarm Time")
//                .build()
//
//            picker.show(supportFragmentManager,"Chanel")
//
//            picker.addOnPositiveButtonClickListener {
//                if(picker.hour > 12){
//                    binding.currTime.text =
//                        String.format("%02d", picker.hour - 12) + " : " +
//                                String.format("%02d", picker.minute) + "PM"
//                }
//                else{
//                    binding.currTime.text =
//                    String.format("%02d", picker.hour) + " : " +
//                            String.format("0.2d", picker.minute) + "AM"
//                }
//            }
//
//            calendar = Calendar.getInstance()
//            calendar[Calendar.HOUR_OF_DAY] = picker.hour
//            calendar[Calendar.MINUTE] = picker.minute
//            calendar[Calendar.SECOND] = 0
//            calendar[Calendar.MILLISECOND] = 0
            openTimePicker()
        }

        binding.startTimerBtn.setOnClickListener {

            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager

            val intent = Intent(this, AlarmBroadcast::class.java)

            pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

            alarmManager.set(
                AlarmManager.RTC_WAKEUP, //will wake up phone
                calendar.timeInMillis,   //will trigger at the time picked
                pendingIntent
            )

            Toast.makeText(this, "Alarm is set!", Toast.LENGTH_SHORT).show()
        }

        binding.cancelTimerBtn.setOnClickListener {
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager

            val intent = Intent(this, AlarmBroadcast::class.java)

            pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

            alarmManager.cancel(pendingIntent)

            Toast.makeText(this, "Alarm is cancelled!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun openTimePicker() {
        val clockFormat = TimeFormat.CLOCK_12H

        val picker = MaterialTimePicker.Builder()
            .setTimeFormat(clockFormat)
            .setHour(12)
            .setMinute(0)
            .setTitleText("Set Alarm")
            .build()

        picker.show(supportFragmentManager, "Chanel")

        //triggers when ok is pressed
        picker.addOnPositiveButtonClickListener {
            val hour = picker.hour
            val min = picker.minute
//            calendar[Calendar.HOUR_OF_DAY] = picker.hour
//            calendar[Calendar.MINUTE] = picker.minute
//            calendar[Calendar.SECOND] = 0
//            calendar[Calendar.MILLISECOND] = 0

        }

        // triggers when cancel is pressed
        picker.addOnNegativeButtonClickListener {

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